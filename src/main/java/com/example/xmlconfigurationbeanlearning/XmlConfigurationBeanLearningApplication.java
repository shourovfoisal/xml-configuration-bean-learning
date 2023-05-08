package com.example.xmlconfigurationbeanlearning;

import com.example.xmlconfigurationbeanlearning.pojopack.Pojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class XmlConfigurationBeanLearningApplication {

	@Autowired
	private static Pojo pojo;

	public static void main(String[] args) {
		SpringApplication.run(XmlConfigurationBeanLearningApplication.class, args);
	}

}
