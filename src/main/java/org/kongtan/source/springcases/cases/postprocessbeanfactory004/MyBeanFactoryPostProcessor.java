package org.kongtan.source.springcases.cases.postprocessbeanfactory004;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author admin
 * @Description TODO
 * @createTime 2021年05月09日 19:55:00
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        AbstractBeanDefinition abstractBeanDefinition = (AbstractBeanDefinition) beanFactory.getBeanDefinition("changeBeanDefinition");

        MutablePropertyValues pv =  abstractBeanDefinition.getPropertyValues();
        pv.addPropertyValue("property", "property has been changed!!!");
        abstractBeanDefinition.setScope(BeanDefinition.SCOPE_SINGLETON);
    }
}
