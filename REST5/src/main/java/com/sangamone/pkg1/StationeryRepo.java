package com.sangamone.pkg1;

import java.util.List;
import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.beans.factory.annotation.Autowired;
public interface StationeryRepo extends JpaRepository<StationeryEntity, Integer>{
	
	StationeryController sc1=new StationeryController();
	
	@Query(value="select distinct location from sales",nativeQuery=true)
	public ArrayList<String> getDistinctLocations();
	
	String temp1="select sum(salesamt)from sales where location like";
	String temp2=sc1.getLocationById(1);
	String temp3=temp1+temp2;
	@Query(value=(temp3),nativeQuery=true)
	public int getSalesAmt1();
	
	@Query(value="select sum(salesamt) from sales where location like 'Saket'",nativeQuery=true)
	public int getSalesAmt2();
}
