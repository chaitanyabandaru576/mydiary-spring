package com.twg.spring.mydiary.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.twg.spring.mydiary.dao.EntryDaoInterface;
import com.twg.spring.mydiary.entities.Entry;

@Component
public class EntryBusinessInterfaceImpl implements EntryBusinessInterface {
	
	@Autowired
	EntryDaoInterface entryDaoInterface;

	@Override
	public void save(Entry entry) {
		entryDaoInterface.save(entry);
	}

	@Override
	public void update(Entry entry) {
		entryDaoInterface.update(entry);

	}

	@Override
	public void delete(Entry entry) {
		entryDaoInterface.delete(entry);

	}

	@Override
	public Entry findById(int id) {
		return entryDaoInterface.findById(id);
	}

	@Override
	public List<Entry> findAll() {
		return entryDaoInterface.findAll();
	}

	@Override
	public List<Entry> findByUserId(int id) {
		// TODO Auto-generated method stub
		return entryDaoInterface.findByUserId(id);
	}

}
