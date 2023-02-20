package hcl.pradeep.repository;

import org.springframework.data.repository.CrudRepository;

import hcl.pradeep.model.StateBean;

public interface StateRepository extends CrudRepository<StateBean, Integer>{
	//StateBean getStateBeanStateNameBystcode(String stcode);

}
