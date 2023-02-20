package com.Family.Fam.repository;

import org.springframework.data.repository.CrudRepository;

import com.Family.Fam.Beans.BabaBeans;

public interface BabaInterface extends CrudRepository<BabaBeans, Integer> {
	BabaBeans getBabaBeansBnameByBid(int bid);
	

}
