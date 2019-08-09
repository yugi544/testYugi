package com.add.address.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.add.address.dao.AddressDao;
import com.add.address.model.Address;

@Service
public class AddressServiceImpl implements AddressService{
	@Autowired
	AddressDao dao;
	@Override
	public List<Address> getAll() {
		// TODO Auto-generated method stub
		return dao.findAll();		
	}
	@Override
	public Address addAddress(Address address) {
		// TODO Auto-generated method stub
		return dao.save(address);
	}

}
