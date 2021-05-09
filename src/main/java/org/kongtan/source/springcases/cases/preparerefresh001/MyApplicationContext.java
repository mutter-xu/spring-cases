package org.kongtan.source.springcases.cases.preparerefresh001;

import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext;

/**
 * @author kongtan
 * TODO 配置启功必须存在的 属性配置（yml或properties）
 */
public class MyApplicationContext extends AnnotationConfigServletWebServerApplicationContext {
    @Override
    protected void initPropertySources() {
        super.initPropertySources();
        //把"MYSQL_HOST"作为启动的时候必须验证的环境变量
        getEnvironment().setRequiredProperties("propertySources");
    }
}
