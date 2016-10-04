package com.javalec.ex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

/**
 * Created by AJSMac on 2016. 10. 4..
 */

////java로 스프링ApplicationConfig진행
@Configuration
public class ApplicationConfig {
    @Bean
    public Calculator calculator2(){Calculator calculator = new Calculator(); return calculator;};
    @Bean
    public MyCalculator myCalculator3(){
        ArrayList<String> listName = new ArrayList<String>();
        listName.add("an");
        listName.add("an");
        listName.add("an");

        MyCalculator myCalculator = new MyCalculator();
        myCalculator.setCalculator(new Calculator());
        myCalculator.setFirstNum(10);
        myCalculator.setSecondNum(3);
        myCalculator.setListName(listName);

        return myCalculator;

    }
    @Bean
    public MyCalculator myCalculator4(){
        ArrayList<String> listName = new ArrayList<String>();
        listName.add("an2");
        listName.add("an");
        listName.add("an");

        MyCalculator myCalculator = new MyCalculator();
        myCalculator.setCalculator(new Calculator());
        myCalculator.setFirstNum(10);
        myCalculator.setSecondNum(3);
        myCalculator.setListName(listName);
        return myCalculator;

    }
    @Bean
    public Pencil pencil2(){ Pencil pencil = new Pencil4B(); return pencil;};
}
