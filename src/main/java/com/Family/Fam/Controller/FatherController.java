package com.Family.Fam.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Family.Fam.Beans.ChildBean;
import com.Family.Fam.Beans.FatherBeans;
import com.Family.Fam.repository.ChildInterface;
import com.Family.Fam.repository.FatherInterface;

@RestController
public class FatherController {
	@Autowired
	FatherInterface fatherInterface;
	@Autowired
	ChildInterface childInterface;
	 
	
	@RequestMapping(value="baba" , method = RequestMethod.GET)
	public List<FatherBeans> getFatherList(@RequestParam("bid")int bid)
	{
		List<FatherBeans> list = fatherInterface.findFatherBeansByBid(bid);
		return list;
	}
	@RequestMapping(value="father" , method = RequestMethod.GET)
	public List<ChildBean> getChildList(@RequestParam("fid")int fid)
	{
		System.out.println(fid);
		List<ChildBean> list = childInterface.getChildBeansByFid(fid);
		for(ChildBean q:list)
		{
			System.out.println(q.getCname()+"  "+q.getCid());
		}
		return list;
	}
	
	
	
}
