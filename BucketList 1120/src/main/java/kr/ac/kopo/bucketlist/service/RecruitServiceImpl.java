package kr.ac.kopo.bucketlist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.bucketlist.dao.RecruitDao;
import kr.ac.kopo.bucketlist.model.Recruit;
import kr.ac.kopo.bucketlist.util.Pager;

@Service
public class RecruitServiceImpl implements RecruitService {
	@Autowired
	RecruitDao dao;

	@Override
	public List<Recruit> recruit(Pager pager) {
		int total = dao.total(pager);
		pager.setTotal(total);
		return dao.recruit(pager);
	}

	@Override
	public void add(Recruit item) {
		dao.add(item);
		
	}

	@Override
	public Recruit item(int code) {
		
		return dao.item(code);
	}

	@Override
	public void update(Recruit item) {
		dao.update(item);
		
	}

	@Override
	public void delete(int code) {
		dao.delete(code);
		
	}
}
