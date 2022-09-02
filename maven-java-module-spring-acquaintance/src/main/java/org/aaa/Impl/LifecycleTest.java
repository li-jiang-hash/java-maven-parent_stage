package org.aaa.Impl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @Author:江Sir
 * @Date:01 2022/09/01 09:17
 * @description: Exercise
 * @Version 1.0.0
 */
public class LifecycleTest implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, BeanPostProcessor, BeanFactoryPostProcessor, InitializingBean, DisposableBean {

    @Override
    public void setBeanName(String s) {
        System.out.println("BeanNameAware");
    }
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");

    }

    public void init() {
        System.out.println("hello Word");

    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("postProcessBeanFactory");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("生命周期死亡");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
