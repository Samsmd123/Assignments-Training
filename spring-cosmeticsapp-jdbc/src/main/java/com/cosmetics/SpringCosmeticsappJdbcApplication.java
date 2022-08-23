package com.cosmetics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cosmetics.model.Cosmetics;
import com.cosmetics.service.*;

@SpringBootApplication
public class SpringCosmeticsappJdbcApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringCosmeticsappJdbcApplication.class, args);
	}
ICosmeticsService cosmeticsService;
	
@Autowired

public void setCosmeticsService(ICosmeticsService cosmeticsService) {
	this.cosmeticsService = cosmeticsService;
}

	@Override
	public void run(String... args) throws Exception {
		//Cosmetics cosmetics=new Cosmetics("PowderFoundation","Maybeline","face",750.10);
		//cosmeticsService.addCosmetics(cosmetics);
		
		cosmeticsService.updateCosmetics(4, 850.0);
		cosmeticsService.getByName("MatHeaven").forEach(System.out::println);
		cosmeticsService.getByBrand("Sugar").forEach(System.out::println);
	}




}
