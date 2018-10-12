package cap.service.impl;

import cap.service.HelloWorld;

public class HelloWorldImpl implements HelloWorld {
    @Override
    public String SayHi(String name) {
        return "欢饮您:"+name+"学习spring技术";
    }
}
