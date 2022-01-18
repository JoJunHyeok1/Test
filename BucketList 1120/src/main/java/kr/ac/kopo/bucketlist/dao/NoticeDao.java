package kr.ac.kopo.bucketlist.dao;

import java.util.List;

import kr.ac.kopo.bucketlist.model.Notice;
import kr.ac.kopo.bucketlist.util.Pager;

public interface NoticeDao {

	void add(Notice item);

	Notice item(int code);

	void update(Notice item);

	void delete(int code);

	int total(Pager pager);

	List<Notice> list(Pager pager);

}
