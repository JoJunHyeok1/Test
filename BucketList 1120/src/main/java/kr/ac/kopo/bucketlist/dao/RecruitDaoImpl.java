package kr.ac.kopo.bucketlist.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.bucketlist.model.Recruit;
import kr.ac.kopo.bucketlist.util.Pager;

@Repository
public class RecruitDaoImpl implements RecruitDao {
	@Autowired
	SqlSession sql;
	@Override
	public int total(Pager pager) {
		return sql.selectOne("Recruit.total", pager);
	}
	@Override
	public List<Recruit> recruit (Pager pager) {
		return sql.selectList("Recruit.list", pager);
	}
	@Override
	public void add(Recruit item) {
		sql.insert("Recruit.add",item);
		
	}
	@Override
	public Recruit item(int code) {
		return sql.selectOne("Recruit.item",code);
	}
	@Override
	public void update(Recruit item) {
		sql.update("Recruit.update",item);
		
	}
	@Override
	public void delete(int code) {
		sql.delete("Recruit.delete",code);
		
	}

}
