package org.kongtan.source.springcases.cases.invokebeanfactorypostprocessors005;

/**
 * @author admin
 * @Description TODO
 * @createTime 2021年05月09日 20:10:00
 */
public class CalculateService {
    private String desc = "desc from class";

    public void setDesc(String desc) {
        this.desc = desc;
    }


    
    public int add(int a, int b) {
        return a + b;
    }

    
    public String getServiceDesc() {
        return desc;
    }
}
