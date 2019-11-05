package SpringBoot.data_analystics.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import SpringBoot.data_analystics.dto.PublicDetails;
import SpringBoot.data_analystics.dto.WardDetails;
import SpringBoot.data_analystics.service.MyService;

@Controller
public class MyController {
	
	
	@Autowired
	public MyService myService;

	@RequestMapping("/SelectWard")
	public ModelAndView home() {
		
		ModelAndView mav = new ModelAndView("SelectWard");
		 
		List<WardDetails> wardDetailsList =  myService.getWardDetails("0");
		
		Map< Long, String > wards = new HashMap<Long, String>();
		for(WardDetails wd:wardDetailsList ) {
			wards.put(wd.getWardId(), wd.getWardName() + " / " + wd.getWardNumber());
		}
			
		mav.addObject("wardDetailsMap", wards);
		mav.addObject("WardDetails", new WardDetails());
		
		return mav;
	}
	
	
	@RequestMapping("/getList")
	public String getList(Map<String, Object> model) {
		
		List<PublicDetails> publicDetailsList =  myService.getPublicDetails("1");
		
		model.put("publicDetailsList", publicDetailsList);
		return "welcome";
	}
	
	
	@RequestMapping("/getPublicDetails/{id}")
	public String getPublicDetails(Map<String, Object> model, @PathVariable("id")Long pdId) {
		
		PublicDetails publicDetails =  myService.getPublicData(pdId);
		
		model.put("publicDetails", publicDetails);
		return "publicDetails";
	}
	
}
