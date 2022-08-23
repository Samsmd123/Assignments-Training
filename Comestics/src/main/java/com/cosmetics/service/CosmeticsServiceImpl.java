package com.cosmetics.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cosmetics.dao.*;

import com.cosmetics.model.Cosmetics;


@Service

public class CosmeticsServiceImpl implements ICosmeticsService {

	ICosmeticsDao cosmeticsDAO;

	@Autowired
	public void setCosmeticsDAO(ICosmeticsDao cosmeticsDAO) {
		this.cosmeticsDAO = cosmeticsDAO;
	}

	@Override
	public List<Cosmetics> getAll() {
		List<Cosmetics> cosmeticses = cosmeticsDAO.findAll();
		 
		return cosmeticses.stream().collect(Collectors.toList());
	}

	@Override
	public List<Cosmetics> getByName(String name) {
		List<Cosmetics>  cosmeticsList=cosmeticsDAO.findByName(name);
		List<Cosmetics> cosmetics=cosmeticsList
				.stream()
				
				.sorted((Cosmetics c1,Cosmetics c2)->c1.getName().compareTo(c2.getName()))
				.collect(Collectors.toList());
		
		
		return cosmeticsList;	
		
	}

	@Override
	public List<Cosmetics> getByBrand(String brand) {
		List<Cosmetics>  cosmeticsList=cosmeticsDAO.findByBrand(brand);
		List<Cosmetics> cosmetics=cosmeticsList
				.stream()
				
				.sorted((Cosmetics c1,Cosmetics c2)->c1.getName().compareTo(c2.getBrand()))
				.collect(Collectors.toList());
		
		
		return cosmeticsList;	
		
	}

	@Override
	public List<Cosmetics> getByCategory(String category) {
		List<Cosmetics>  cosmeticsList=cosmeticsDAO.findByCategory(category);
		List<Cosmetics> cosmetics=cosmeticsList
				.stream()
				
				.sorted((Cosmetics c1,Cosmetics c2)->c1.getName().compareTo(c2.getCategory()))
				.collect(Collectors.toList());
		
		
		return cosmeticsList;	
		
	}
	

	@Override
	public List<Cosmetics> getByPrice(double price) {
		List<Cosmetics>  cosmeticsList=cosmeticsDAO.findByPrice(price);
		List<Cosmetics> cosmetics=cosmeticsList
				.stream()
				
				.sorted((Cosmetics c1,Cosmetics c2)->c1.getName().compareTo(c2.getName()))
				.collect(Collectors.toList());
		
		return cosmeticsList;
	}		

	@Override
	public Cosmetics getByCategoryId(int comesticsId) {
		
		return null;
	}

	
}
