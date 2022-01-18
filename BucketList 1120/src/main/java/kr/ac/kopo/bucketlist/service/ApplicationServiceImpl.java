package kr.ac.kopo.bucketlist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.bucketlist.dao.ApplicationDao;
import kr.ac.kopo.bucketlist.model.Application;
import kr.ac.kopo.bucketlist.util.Pager;

@Service
public class ApplicationServiceImpl implements ApplicationService {
	@Autowired
	ApplicationDao dao;
	@Override
	public List<Application> application(Pager pager) {
		int total = dao.total(pager);
		pager.setTotal(total);
		return dao.application(pager);
	}
	@Override
	public void add(Application item) {
		dao.add(item);
		
	}
	@Override
	public Application item(int code) {
	
		return dao.item(code);
	}
	@Override
	public void update(Application item) {
		dao.update(item);
		
	}
	@Override
	public void delete(int code) {
		dao.delete(code);
		
	}

}
