package com.cg.projectplp.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.projectplp.beans.Inventory;
import com.cg.projectplp.service.ProjectService;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	ProjectService productservice;

	@RequestMapping(value = "index")
	public String getMerchantMenu()
	{
		return "index";
	}
	
	@RequestMapping(value = "AddProducts",method = RequestMethod.GET)
	public String addProductsMerchants(@ModelAttribute("my") Inventory in,BindingResult result, Map<String, Object> model) {
		
		List<String> myList = new ArrayList<>();
		myList.add("Electronics");
		myList.add("Books");
		myList.add("Footwear");
		model.put("cato", myList);
		return "AddProducts";
	}
	
	@RequestMapping(value = "Success", method = RequestMethod.POST)
	public String successPage()
	{
		return "Success";
	}
	
	@RequestMapping(value = "ProductView", method = RequestMethod.GET)
	public ModelAndView showProducts()
	{
		List<Inventory> prodList = productservice.getProductList();
		return new ModelAndView("ProductView", "pro", prodList);
	}
}
