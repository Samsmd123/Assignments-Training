package com.cosmetics.util;

public class DbQueries {
	public static final String INSERTQUERY="INSERT INTO MYCOSMETICS(name,brand,category,price)value(?,?,?,?)";
	public static final String UPDATEQUERY="UPDATE MYCOSMETICS SET price=? where cosmetics_Id=?";
public static final String DELETEQUERY="delete from mycosmetics where mycosmetics_Id=?";
	
	public static final String SELECTQUERY="select * from mycosmetics";
	public static final String SELECTBYNAME="select * from mycosmetics where name=?";
	public static final String SELECTBYPRICE="select * from mycosmetics where price=?";
	public static final String SELECTBYBRAND="select * from mycosmetics where brand=?";

}
