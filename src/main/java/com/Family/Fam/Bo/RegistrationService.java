package com.Family.Fam.Bo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Family.Fam.Beans.CommonBean;
import com.Family.Fam.Beans.RegistBean;
import com.Family.Fam.Dao.RegistDao;
import com.Family.Fam.dto.RegisterDto;
import com.Family.Fam.repository.BabaInterface;
import com.Family.Fam.repository.ChildInterface;
import com.Family.Fam.repository.FatherInterface;
@Service
public class RegistrationService {
	@Autowired
	RegistDao registDao;
	@Autowired
	BabaInterface babaInterface;
	@Autowired
	FatherInterface fatherInterface;
	@Autowired
	ChildInterface childInterface;
	
	public boolean getRegistrationDetails(RegistBean registbean )
	{
		RegisterDto r = new RegisterDto();
		r.setBid(registbean.getBid());
		r.setFid(registbean.getFid());
		r.setCid(registbean.getCid());
		r.setGender(registbean.getGender().equalsIgnoreCase("m")?"male":"female");
		r.setPhone(registbean.getPhone());
		return registDao.saveRecord(r);
		
	}
	public List<CommonBean> getViewDetail()
	{
	List<RegisterDto>	list = registDao.viewDetail();
	List<CommonBean> clist = new ArrayList<CommonBean>();
	for(RegisterDto p:list)
	{
		CommonBean cb = new CommonBean();
		cb.setBname(babaInterface.getBabaBeansBnameByBid(p.getBid()).getBname());
		cb.setName(fatherInterface.getFatherBeansNameByFid(p.getFid()).getName());
		cb.setCname(childInterface.getChildBeanCnameByCid(p.getCid()).getCname());
		cb.setGender(p.getGender());
		cb.setPhone(p.getPhone());
		clist.add(cb);
	}
	
	
	return clist;
	
	}

}
