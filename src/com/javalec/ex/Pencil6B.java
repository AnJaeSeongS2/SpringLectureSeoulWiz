package com.javalec.ex;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by AJSMac on 2016. 10. 4..
 */
public class Pencil6B implements Pencil {


    @PostConstruct
    public void initFunc(){
        System.out.println("6B init");
    }

    @PreDestroy
    public void destroyFunc(){
        System.out.println("6B destroy");
    }
    public void use(){
        System.out.println("6b굵기 연필");
    }
}
