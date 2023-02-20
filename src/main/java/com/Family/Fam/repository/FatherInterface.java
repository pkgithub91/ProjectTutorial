package com.Family.Fam.repository;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Family.Fam.Beans.FatherBeans;
@Repository
public interface FatherInterface extends CrudRepository<FatherBeans, Integer> {
	List<FatherBeans> findFatherBeansByBid(int bid);
	FatherBeans	getFatherBeansNameByFid(int fid);
}
