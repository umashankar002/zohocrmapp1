package com.zohoCRM.services;

import org.springframework.stereotype.Service;

import com.zohoCRM.entities.Billing;
import com.zohoCRM.repositories.BillingRepository;

@Service
public class BillingServiceIMPL implements BillingService {
	
	BillingRepository billingrepo;
	
	public BillingServiceIMPL(BillingRepository billingrepo) {
		super();
		this.billingrepo = billingrepo;
	}


	@Override
	public void saveOneBill(Billing billing) {
		billingrepo.save(billing);
	}

}
