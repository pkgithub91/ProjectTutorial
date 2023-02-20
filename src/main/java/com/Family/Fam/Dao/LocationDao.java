package com.Family.Fam.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Family.Fam.Beans.BabaBeans;
import com.Family.Fam.repository.BabaInterface;
@Component
public class LocationDao {
	@Autowired
	BabaInterface babaInterface; 
	public List<BabaBeans> getBabaDetails()
	{
	List<BabaBeans> blist = (List<BabaBeans>) babaInterface.findAll();
	return blist;
	}
	

}
