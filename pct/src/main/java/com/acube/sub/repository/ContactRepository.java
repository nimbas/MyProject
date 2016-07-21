package com.acube.sub.repository;

import java.util.List;

import com.acube.sub.domain.Contact;

public interface ContactRepository {
	public List<Contact> getCustomerContactList(String custNo);

}
