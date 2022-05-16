package com.jobiak.imd.repository;

import org.springframework.stereotype.Repository;

import com.jobiak.imd.model.Customer;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface CustomerRepo extends JpaRepository<Customer,Long>{

}
