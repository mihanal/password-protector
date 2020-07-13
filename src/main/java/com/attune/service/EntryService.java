package com.attune.service;

import java.util.List;

import com.attune.dao.EntryDAO;
import com.attune.entity.Entry;

public class EntryService {

	public void enrichEntry(Entry entry) {
		
		EntryDAO dao = new EntryDAO();
		dao.saveEntry(entry);
	}
	
	public List<Entry> getEntries() {
		EntryDAO dao = new EntryDAO();
		return dao.getEntryList();
	}
}
