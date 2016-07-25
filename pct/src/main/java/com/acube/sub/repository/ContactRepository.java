package com.acube.sub.repository;

import java.util.List;

import com.acube.sub.domain.Contact;

public interface ContactRepository {
	public List<Contact> getCustomerContactList(String custNo);
	public int addContact(Contact contact);	
	public int updateContact(Contact contact);
	public int deleteContact(String contactSeq);
	
	

}
