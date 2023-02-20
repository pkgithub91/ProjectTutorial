package com.Family.Fam.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.Family.Fam.Beans.BabaBeans;
import com.Family.Fam.Beans.CommonBean;
import com.Family.Fam.Beans.RegistBean;
import com.Family.Fam.Bo.RegistrationService;
import com.Family.Fam.Dao.LocationDao;






@Controller
public class RegistController {
	@Autowired
	RegistBean registBean;
	@Autowired
	LocationDao locationDao;
	@Autowired
	RegistrationService registrationService;
	
	@RequestMapping(value="openrgpage" ,method = RequestMethod.GET)
	public ModelAndView getUserDetails()
	{
		
		return new ModelAndView("registration" ,"r", registBean);
		
	}
	@ModelAttribute("babalist")
	public List<BabaBeans> getStateList()
	{
		List<BabaBeans> list = locationDao.getBabaDetails();
	return list;
	}
	
	@RequestMapping(value="registsave" ,method = RequestMethod.POST)
	public ModelAndView getRegistrationDetails(@ModelAttribute("r")RegistBean registBean)
	{
		
		if(registrationService.getRegistrationDetails(registBean))
		{
			return new ModelAndView("S");
		}
		return new ModelAndView("E");
		
	}
	@RequestMapping(value="view" , method= RequestMethod.GET)
	public ModelAndView viewDetail()
	{
		List<CommonBean>clist = registrationService.getViewDetail();
		return new ModelAndView("view","cmn",clist);
		
		
	}
	
	
	
	
	
	
	
	
	 

}
