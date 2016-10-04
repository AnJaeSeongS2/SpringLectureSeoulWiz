package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by AJSMac on 2016. 10. 4..
 */
public class Pencil4B implements Pencil ,InitializingBean, DisposableBean{
    public void use(){
        System.out.println("4b굵기 연필");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("destroy() from DisposableBean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet() from InitializingBean");
    }
}
