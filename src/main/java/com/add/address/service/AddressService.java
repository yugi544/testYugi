package com.add.address.service;

import java.util.List;

import com.add.address.model.Address;

public interface AddressService {
	
	public List<Address> getAll();
	public Address addAddress(Address address);

}
