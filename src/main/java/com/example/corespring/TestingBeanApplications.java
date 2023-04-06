package com.example.corespring;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class TestingBeanApplications {
    public static void main(String[] args) {
        //Spring Context
        //manage the object

        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestingBeanApplications.class)){
            String[] beanNames = context.getBeanDefinitionNames();
            for (String beanName: beanNames){
                System.out.println("============================");
                System.out.println("Bean Name: " + beanName);
                System.out.println("============================");

            }
        } catch (Exception e){
            e.printStackTrace();
        }




    }
}
