package com.zohoCRM.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohoCRM.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
