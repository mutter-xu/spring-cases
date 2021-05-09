package org.kongtan.source.springcases.cases.postprocessbeanfactory004;

import org.springframework.stereotype.Service;

/**
 * @author admin
 * @Description TODO
 * @createTime 2021年05月09日 19:51:00
 */
@Service
public class ChangeBeanDefinition {
    /**
     * raw data 原始数据，property属性
     * */
    String property = "raw data";

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }
}
