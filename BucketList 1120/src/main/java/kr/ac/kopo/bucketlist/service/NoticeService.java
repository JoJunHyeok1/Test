package kr.ac.kopo.bucketlist.service;

import java.util.List;

import kr.ac.kopo.bucketlist.model.Notice;
import kr.ac.kopo.bucketlist.util.Pager;

public interface NoticeService {

	List<Notice> notice(Pager pager);

	void add(Notice item);

	Notice item(int code);

	void update(Notice item);

	void delete(int code);

}
