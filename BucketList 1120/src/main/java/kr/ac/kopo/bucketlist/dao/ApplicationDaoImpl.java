package kr.ac.kopo.bucketlist.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.bucketlist.model.Application;
import kr.ac.kopo.bucketlist.util.Pager;
@Repository
public class ApplicationDaoImpl implements ApplicationDao {
	@Autowired
	SqlSession sql;
	@Override
	public List<Application> application(Pager pager) {
		
		return sql.selectList("Application.list",pager);
	}
	@Override
	public int total(Pager pager) {
		return sql.selectOne("Application.total",pager);
	}
	@Override
	public void add(Application item) {
		sql.insert("Application.add",item);
		
	}
	@Override
	public Application item(int code) {
		return sql.selectOne("Application.item",code);
	}
	@Override
	public void update(Application item) {
		sql.update("Application.update",item);
		
	}
	@Override
	public void delete(int code) {
		sql.delete("Application.delete",code);
		
	}

}
