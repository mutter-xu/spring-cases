package org.kongtan.source.springcases.cases.invokebeanfactorypostprocessors005;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author admin
 * @Description TODO
 * @createTime 2021年05月09日 20:13:00
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {
        //打印当前堆栈信息
        Utils.printTrack("execute postProcessBeanDefinitionRegistry");

        //创建一个bean的定义类的对象，bean类型是CalculateService
        RootBeanDefinition helloBean = new RootBeanDefinition(CalculateService.class);

        //bean的定义注册到spring环境
        beanDefinitionRegistry.registerBeanDefinition("calculateService", helloBean);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        //打印当前堆栈信息
        Utils.printTrack("execute postProcessBeanFactory");
    }
}