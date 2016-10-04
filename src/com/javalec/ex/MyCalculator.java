package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.util.ArrayList;

/**
 * Created by AJSMac on 2016. 10. 3..
 */
public class MyCalculator {
    private Calculator calculator;
    private int firstNum;
    private int secondNum;
    private ArrayList<String> listName;





    public MyCalculator(){}
    public MyCalculator(Calculator calculator, int firstNum, int secondNum, ArrayList<String> listName) {
        this.calculator = calculator;
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.listName = listName;
    }

    public ArrayList<String> getListName() {
        return listName;
    }

    public void setListName(ArrayList<String> listNum) {
        this.listName = listNum;
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    public void setFirstNum(int firstNum){
        this.firstNum=firstNum;
    }

    public Calculator getCalculator() {
        return calculator;
    }

    public int getFirstNum() {
        return firstNum;
    }

    public int getSecondNum() {
        return secondNum;
    }
    public void add(){
        for( int i = 0 ; i < listName.size() ; i++){
            System.out.println(listName.get(i));
        }

        calculator.addition(firstNum,secondNum);
    }
}
