package com.example.demo;

import com.example.demo.services.BarcodesService.BarbecueBarcodeGenerator;
import com.example.demo.services.BarcodesService.Barcode4jBarcodeGenerator;
import com.example.demo.services.BarcodesService.QRGenBarcodeGenerator;
import com.example.demo.services.BarcodesService.ZxingBarcodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.BufferedImageHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;

import java.awt.image.BufferedImage;
import java.util.Date;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		System.out.println("Hello World!");
		System.out.println(new Date());
		System.out.println("Rebate");
	}

}
