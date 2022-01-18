package kr.ac.kopo.bucketlist.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.bucketlist.model.Notice;
import kr.ac.kopo.bucketlist.util.Pager;
@Repository
public class NoticeDaoImpl implements NoticeDao {
	@Autowired
	SqlSession sql;

	@Override
	public void add(Notice item) {
		sql.insert("Notice.add",item);
		
	}
	@Override
	public Notice item(int code) {
		return sql.selectOne("Notice.item",code);
	}
	@Override
	public void update(Notice item) {
		sql.update("Notice.update",item);
		
	}
	@Override
	public void delete(int code) {
		sql.delete("Notice.delete",code);
		
	}
	@Override
	public int total(Pager pager) {
		return sql.selectOne("Notice.total",pager);
	}

	@Override
	public List<Notice> list(Pager pager) {
		
		return sql.selectList("Notice.notice",pager);
	}

}
