package com.example.xmlconfigurationbeanlearning.pojopack;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath*:beans.xml")
public class Pojo {
    int a;
    String b;

    public void printPojo() {
        System.out.println("Print Pojo");
    }
}
