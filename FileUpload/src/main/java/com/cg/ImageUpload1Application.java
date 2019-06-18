package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.cg.property.FileStorageProperties;

@SpringBootApplication

@EnableConfigurationProperties({ FileStorageProperties.class })
public class ImageUpload1Application {

	public static void main(String[] args) {
		SpringApplication.run(ImageUpload1Application.class, args);
		System.err.print("Application started");
	}

}
