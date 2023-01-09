package com.zohoCRM.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohoCRM.entities.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {

}
