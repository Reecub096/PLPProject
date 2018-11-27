package com.cg.projectplp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.stereotype.Controller
public class Controller {

	@RequestMapping(value = "index")
	public String getMerchantMenu()
	{
		return "index";
	}
	
	@RequestMapping(value = "AddProducts",method = RequestMethod.GET)
	public String addProductsMerchants() {
		return "AddProducts";
	}
}
