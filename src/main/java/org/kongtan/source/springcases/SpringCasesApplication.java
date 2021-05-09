package org.kongtan.source.springcases;

import org.kongtan.source.springcases.cases.preparerefresh001.MyApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author kongtan
 */
@SpringBootApplication
public class SpringCasesApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(SpringCasesApplication.class);
        springApplication.setApplicationContextClass(MyApplicationContext.class);
        springApplication.run(args);
    }

}
