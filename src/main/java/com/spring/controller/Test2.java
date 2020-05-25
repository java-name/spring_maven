package com.spring.controller;

public class Test2 {
    private String message;
    private String msg1;
    private String msg2;

    public void getMsg1() {
        System.out.println("T2 Message : " + msg1);
    }

    public void setMsg1(String msg1) {
        this.msg1 = msg1;
    }

    public void getMsg2() {
        System.out.println("T2 Message : " + msg2);
    }

    public void setMsg2(String msg2) {
        this.msg2 = msg2;
    }

    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("T2 Message : " + message);
    }

//    public void init(){
//        System.out.println("Let's start");
//    }
//
//    public void destroy(){    //
//        System.out.println("GoodBye!");
//    }
}
 