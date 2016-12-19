package com.machado.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/customer")
public class CustomerController {	
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Customer> getAllCustomer() {
		
		List<Customer> list= new ArrayList<>();
		
		
		for(int i = 0; i < 10 ; i++){
			Customer c= new Customer();
			c.setId((long)i);
			c.setName("name_"+ i);
			c.setSurname("surname_"+ i);
			list.add(c);
		}		

		System.out.println("called ... before order > List<Customer> getAllCustomer");
		
		/* Lambda code test. */
		list.forEach((c) -> System.out.println(c));		
		
		list.sort((o1,o2)->o2.getId().compareTo(o1.getId()));
		
		System.out.println("called ... after order > List<Customer> getAllCustomer");
		
		/* Lambda code test. */
		list.forEach((c) -> { System.out.println(c) ; System.out.println(c); });
				
		return list;		
	}
	
	@RequestMapping(value="/add",method = RequestMethod.POST)
	public @ResponseBody Customer add(@RequestBody Customer customer) {
		
		System.out.println("added = "+ customer);
		return customer;
	}

}
