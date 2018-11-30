package com.cxf;

import com.webservice.HelloWorld;
import com.webservice.HelloWorldImpl;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import javax.xml.ws.Endpoint;

/***
 * CXF jetty服务端
 */
public class Server {
    public static void main(String[] args) {
        System.out.println("web service start");
        HelloWorld hello = new HelloWorldImpl();
        String address = "http://192.168.2.102/helloWorld";
        Endpoint.publish(address,hello);//jdk 实现
        JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
        factoryBean.setAddress(address);//设置暴露地址
        factoryBean.setServiceClass(HelloWorld.class);//设置实现类
        factoryBean.create();
        System.out.println("web service started");
    }
}
