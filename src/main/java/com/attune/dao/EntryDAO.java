package com.attune.dao;

import java.util.List;

import org.hibernate.Session;
import com.attune.entity.Entry;
import com.attune.util.HibernateUtil;

public class EntryDAO {

	public void saveEntry(Entry entry) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		System.out.println("jjjjjjjjjjjjjjjjjj" + session.createQuery("from Entry", Entry.class).getResultList().size());
        session.beginTransaction();
 
        session.save(entry);
        session.getTransaction().commit();
        System.out.println(session.createQuery("from Entry", Entry.class).getResultList().size());
               
	}
	
	public List<Entry> getEntryList() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		return session.createQuery("from Entry", Entry.class).getResultList();
	}
}
