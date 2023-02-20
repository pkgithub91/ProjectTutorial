package hcl.pradeep.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hcl.pradeep.model.StateBean;
import hcl.pradeep.repository.StateRepository;

@Repository
public class LogicalDao {
	
	@Autowired private StateRepository stateRepository;
	
	public List<StateBean> getStateList()
	{
		return (List<StateBean>)stateRepository.findAll();
	}

}
