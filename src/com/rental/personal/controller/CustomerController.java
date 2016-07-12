package com.rental.personal.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rental.personal.Customer;

@Controller
public class CustomerController {
	
	@RequestMapping(value="/customer/customer", method = RequestMethod.GET)
	public ModelAndView customer(){
		return new ModelAndView("customer", "command", new Customer());
	}
	
	@RequestMapping(value="/customer/addCustomer", method=RequestMethod.POST)
	public String adicionarCustomer(@ModelAttribute("SpringWeb") Customer customer, ModelMap model, HttpServletRequest request){
		model.addAttribute("firstName",customer.getFirstName());
		model.addAttribute("lastName",customer.getLastName());
		model.addAttribute("street",customer.getAddress().getStreet());
		model.addAttribute("district",customer.getAddress().getDistrict());
		model.addAttribute("city",customer.getAddress().getCity());
		model.addAttribute("phone",customer.getContactInfo().getPhone());
		model.addAttribute("email",customer.getContactInfo().getEmail());
		
		List<Customer> customers = (List<Customer>) request.getSession().getAttribute("customers");
		if(customers == null){
			customers = new ArrayList<Customer>();
		}
		customers.add(customer);
		request.getSession().setAttribute("customers", customers);
		
		return "showCustomer";
	}
	
	@RequestMapping(value="/customer/listCustomer", method = RequestMethod.GET)
	public String listarCustomers(@ModelAttribute("SpringWeb") ModelMap model, HttpServletRequest request){
		List<Customer> customers = (List<Customer>) request.getAttribute("customers");
		
		model.addAttribute("customers", customers);
		
		return "listCustomer";
	}
	
}
