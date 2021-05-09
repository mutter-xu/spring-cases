package org.kongtan.source.springcases.cases.postprocessbeanfactory004;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author admin
 * @Description TODO web应用启动后 验证是否改变了BD的内容。
 * @createTime 2021年05月09日 15:04:00
 */
@Component
public class MyRunnerTask implements ApplicationRunner {
    /**
     * 默认的日志等级为info   （error->warn->info->debug/trace）
     * 未配置xml，则不输出文件，只打印到Console
     * SLF4J是抽象，logback是spring boot默认实现，是在web包依赖中
     */
    Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    ChangeBeanDefinition changeBeanDefinition;

    @Override
    public void run(ApplicationArguments args) {
        logger.info(">> 系统启动后的任务  记录 -----------------------");
        logger.error(changeBeanDefinition.getProperty());
        logger.info(">>  完成了一个BD的修改--------------------------");

    }
}
