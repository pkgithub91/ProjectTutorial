package com.Family.Fam.Dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Family.Fam.dto.RegisterDto;
import com.Family.Fam.repository.RegistInterface;
@Repository
public class RegistDao {
	@Autowired
	RegistInterface registInterface;
	public boolean saveRecord(RegisterDto r)
	{
		RegisterDto rdto = registInterface.save(r);
		if(rdto.getRid()>0)
		{
			return true;
		}
		return false;
		
	}
	
	public List<RegisterDto> viewDetail()
	{
	List<RegisterDto>	list =registInterface.getRegistDtoListBy();
	return list;
	}

}
