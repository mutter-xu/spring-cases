package org.kongtan.source.springcases.cases.invokebeanfactorypostprocessors005;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author admin
 * @Description TODO
 * @createTime 2021年05月09日 20:12:00
 */
@RestController
public class HelloController {

    CalculateService calculateService;
    @Autowired(required = false)
    public void setCalculateService(CalculateService calculateService) {
        this.calculateService = calculateService;
    }
}
