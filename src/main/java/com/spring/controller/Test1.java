package com.spring.controller;

public class Test1 {
    private String message;
    private String Msg1;

    public void getMsg1() {
        System.out.println("Your Message : " + Msg1);
    }

    public void setMsg1(String msg1) {
        Msg1 = msg1;
    }

    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }

    public void init(){
        System.out.println("Let's start");
    }

    public void destroy(){    //
        System.out.println("GoodBye!");
    }
}
 