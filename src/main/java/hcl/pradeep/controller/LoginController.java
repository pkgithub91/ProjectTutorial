package hcl.pradeep.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import hcl.pradeep.dao.LogicalDao;
import hcl.pradeep.model.LoginBean;
import hcl.pradeep.model.RegistrationBean;
import hcl.pradeep.model.StateBean;

@Controller
public class LoginController {

	@Autowired
	private LoginBean loginBean;
	@Autowired
	private RegistrationBean registrationBean;
	
	@Autowired private LogicalDao logicalDao;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView login() {
		return new ModelAndView("login", "tt", loginBean);
	}

	@RequestMapping(value = "/lgn", method = RequestMethod.POST)
	public ModelAndView saveLogin(@ModelAttribute("tt") LoginBean loginBean, ModelMap m)

	{

		if (!loginBean.getUser().equalsIgnoreCase(loginBean.getPassword())) {
			m.addAttribute("p", registrationBean);
			return new ModelAndView("registration","r",registrationBean);
		} else {
			return new ModelAndView( "login");
		}
		
		
		

	}
	
	@ModelAttribute("lst")
	public List<StateBean> getStateList()
	{
		return logicalDao.getStateList();
	}

}
