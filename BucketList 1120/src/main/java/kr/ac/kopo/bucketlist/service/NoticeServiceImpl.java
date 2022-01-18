package kr.ac.kopo.bucketlist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.bucketlist.dao.NoticeDao;
import kr.ac.kopo.bucketlist.model.Notice;
import kr.ac.kopo.bucketlist.util.Pager;
@Service
public class NoticeServiceImpl implements NoticeService {
	
	@Autowired
	NoticeDao dao;
	@Override
	public List<Notice> notice(Pager pager) {
		int total = dao.total(pager);
		pager.setTotal(total);
		return dao.list(pager);
	}
	@Override
	public void add(Notice item) {
	dao.add(item);
		
	}
	@Override
	public Notice item(int code) {
		
		return dao.item(code);
	}
	@Override
	public void update(Notice item) {
		dao.update(item);
		
	}
	@Override
	public void delete(int code) {
		dao.delete(code);
		
	}

}
