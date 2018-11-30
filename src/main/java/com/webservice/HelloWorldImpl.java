package com.webservice;

import javax.jws.WebService;

@WebService
public class HelloWorldImpl implements HelloWorld {
    @Override
    public String say(String str) {
        return "Hello"+str;
    }
}
