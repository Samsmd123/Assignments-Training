package com.cosmetics.dao;

import java.util.List;


import com.cosmetics.model.Cosmetics;

public interface ICosmeticsDao {
	List<Cosmetics> findAll();
	List<Cosmetics> findByName(String name) ;
	List<Cosmetics> findByBrand(String brand);
	List<Cosmetics> findByCategory(String category);
	List<Cosmetics> findByPrice(double price);
	
	Cosmetics findByCategoryId(int comesticsId) ;
}
