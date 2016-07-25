package com.acube.sub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acube.sub.domain.Contact;
import com.acube.sub.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {
	@Autowired ContactRepository contactRepository;

	@Override
	public List<Contact> getCustomerContactList(String custNo) {
		// TODO Auto-generated method stub
		return contactRepository.getCustomerContactList(custNo);
	}

	@Override
	public int addContact(Contact contact) {
		// TODO Auto-generated method stub
		return contactRepository.addContact(contact);
	}

	@Override
	public int updateContact(Contact contact) {
		// TODO Auto-generated method stub
		return contactRepository.updateContact(contact);
	}

	@Override
	public int deleteContact(String contactSeq) {
		// TODO Auto-generated method stub
		return contactRepository.deleteContact(contactSeq);
	}
	
}
