package com.Family.Fam.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.Family.Fam.Beans.ChildBean;

public interface ChildInterface extends CrudRepository<ChildBean, Integer> {
	List<ChildBean> getChildBeansByFid(int fid);
	ChildBean getChildBeanCnameByCid(int cid);

}
