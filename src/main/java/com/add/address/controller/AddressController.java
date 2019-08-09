package com.add.address.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.add.address.model.Address;
import com.add.address.service.AddressService;

@RestController
public class AddressController {
	@Autowired AddressService addressService;
	@RequestMapping(value="/address/getAll",method=RequestMethod.GET)
	public List<Address> getAll(){
		return addressService.getAll();
	}
	@RequestMapping(value="/address/add",method=RequestMethod.POST)
	public Address addAddress(@RequestBody Address address) {
		return addressService.addAddress(address);
	}
}
