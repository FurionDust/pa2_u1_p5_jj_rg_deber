package com.uce.edu;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Pa2U1P5JjRgDeberApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P5JjRgDeberApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
			System.out.println("Programa para deber!");
			System.out.println("Soy Jose Jimenez Loor");
			System.out.println("------------------------------------");
			System.out.println("Soy el primer cambio en la rama Main");
			System.out.println("------------------------------------");
			System.out.println("Soy un cambio en nueva branch llamada Version1");
	}

}
