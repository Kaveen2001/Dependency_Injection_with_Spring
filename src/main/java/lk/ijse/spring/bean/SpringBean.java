package lk.ijse.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    // Spring Bean Life Cycle

    // Instantiate the Object --> 1
    public SpringBean() {
        System.out.println("Spring Bean Object is Instantiated..!");
    }

    // Populate Properties --> 2
    /*private String id;
    private String name;
    private String address;*/

    // Bean Name Awareness --> 3
    @Override
    public void setBeanName(String name) {
        System.out.println("Spring Bean Name Aware Called..!");
    }

    // Bean Factory Awareness --> 4
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Spring Bean Factory Aware Called..!");
    }

    // Application Context Awareness --> 5
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Spring Bean Application Context Aware Called..!");
    }

    // Initializing Bean --> 6
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Spring Bean Called and Spring Bean is Ready to use..!");
    }

    // Disposable Bean --> 7
    @Override
    public void destroy() throws Exception {
        System.out.println("Spring Bean is Destroyed..!");
    }
}
