package com.add.address.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.add.address.model.Address;

public interface AddressDao extends JpaRepository<Address, Integer> {

}
