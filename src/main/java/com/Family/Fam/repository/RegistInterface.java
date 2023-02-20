package com.Family.Fam.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.Family.Fam.dto.RegisterDto;



public interface RegistInterface extends CrudRepository<RegisterDto , Integer>{
	List<RegisterDto> getRegistDtoListBy();

}
