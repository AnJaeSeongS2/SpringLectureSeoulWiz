package com.javalec.ex;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;

/**
 * Created by AJSMac on 2016. 10. 3..
 */
public class MainClass {
    public static void main(String[] args){

        String configLoc = "com/javalec/ex/applicationCTX.xml";
        AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
        //xml로 진행

            //AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
            //java로 진행

        MyCalculator myCalculator =ctx.getBean("myCalculator3", MyCalculator.class);
        myCalculator.add();

        MyCalculator myCalculator2 =ctx.getBean("myCalculator2", MyCalculator.class);
        myCalculator2.add();
        MyCalculator myCalculator3 = ctx.getBean("myCalculator2", MyCalculator.class);
        myCalculator3.setFirstNum(12);
        myCalculator3.add();
        myCalculator2.add();
        //bean이 같으면, 데이터 서로 공유를 하며, myCalculator객체들이 같다고 뜸


        Pencil pencil = ctx.getBean("pencil", Pencil.class);
        pencil.use();
        ctx.close();





    }
}
