package com.cosmetics.dao;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;


import com.cosmetics.model.Cosmetics;

@Component
public class CosmeticsDAOImpl implements ICosmeticsDao{

	@Override
	public List<Cosmetics> findAll() {
		// TODO Auto-generated method stub
		return showAllCometics();
	}

	@Override
	public List<Cosmetics> findByName(String name)  {
		// TODO Auto-generated method stub
		return showAllCometics().stream().filter(cosmetics->cosmetics.getName().equalsIgnoreCase(name)).collect(Collectors.toList()) ; 
	}
	
	

	@Override
	public List<Cosmetics> findByBrand(String brand) {
		
		return showAllCometics().stream().filter(cosmetics->cosmetics.getBrand().equalsIgnoreCase(brand)).collect(Collectors.toList()) ; 
				}

	@Override
	public List<Cosmetics> findByCategory(String category) {
		
		return showAllCometics().stream().filter(cosmetics->cosmetics.getCategory().equalsIgnoreCase(category)).collect(Collectors.toList()) ; 
	}

	@Override
	public List<Cosmetics> findByPrice(double price) {
		// TODO Auto-generated method stub
		 return showAllCometics().stream().filter(cosmetics->cosmetics.getPrice()==price).collect(Collectors.toList());
	}

	@Override
	public Cosmetics findByCategoryId(int comesticsId) {
		Optional<Cosmetics>cosmetics =showAllCometics().stream().filter((c)->c.getComesticsId()==(comesticsId)).findFirst();
		if(cosmetics.isPresent()) {
		return cosmetics.get();
		
		}
		return null;
	}
	private List<Cosmetics> showAllCometics(){
		return Arrays.asList(new Cosmetics(101,"RedBlush","Suagar","Face",399.0),
				new Cosmetics(201,"TheBlam","LAKME","FACE",250.0),
				new Cosmetics(401,"CoolCoverage","Paracute","legs",750.0),
				new Cosmetics(144,"fRIZE FREE","Treseme","hair",120.0),
				new Cosmetics(143,"SilkySmooth conditioner"," Treseme","hair",117.0),
				new Cosmetics(210,"Matte As Hell","LAKME","FACE",250.0)
);
		
	}
}
