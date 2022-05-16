package com.jobiak.imd.repository;

import org.springframework.stereotype.Repository;

import com.jobiak.imd.model.Customer2;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface CustomerRepo2 extends JpaRepository<Customer2,Long>{

}
