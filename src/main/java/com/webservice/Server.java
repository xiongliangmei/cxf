package com.webservice;

import javax.xml.ws.Endpoint;

/***
 * 发布到服务器上 webservice 服务端
 */
public class Server {

    public static void main(String[] args) {
        System.out.println("web service start");
        HelloWorld hello = new HelloWorldImpl();
        String address = "http://192.168.2.102/helloWorld";
        Endpoint.publish(address,hello);//jdk 实现
        System.out.println("web service started");
    }
}
