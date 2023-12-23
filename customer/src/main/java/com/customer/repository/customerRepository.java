package com.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customer.entity.customerEntity;
@Repository
public interface customerRepository extends JpaRepository<customerEntity, Integer>{

}
