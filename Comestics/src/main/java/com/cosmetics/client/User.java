package com.cosmetics.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cosmetics.service.CosmeticsServiceImpl;
import com.cosmetics.service.ICosmeticsService;



public class User {

	public static void main(String[] args) {
		
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.cosmetics");
			ICosmeticsService cosmeticsService=context.getBean(CosmeticsServiceImpl.class,"cosmeticsServiceImpl");
			System.out.println("Show All policy details!!");
			cosmeticsService.getAll().forEach(System.out::println);
			
			System.out.println();
			System.out.println("Show by Name!");
			cosmeticsService.getByName("RedBlush").forEach(System.out::println);
			
			System.out.println();
			System.out.println("Show by Brand!");
			cosmeticsService.getByBrand("Paracute").forEach(System.out::println);
			
			System.out.println();
			System.out.println("Show by Category!");
			cosmeticsService.getByCategory("hair").forEach(System.out::println);
			
			System.out.println();
			System.out.println("Show by Price!");
			cosmeticsService.getByPrice(120.0).forEach(System.out::println);
			
	}

}
