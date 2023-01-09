package com.zohoCRM.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohoCRM.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
