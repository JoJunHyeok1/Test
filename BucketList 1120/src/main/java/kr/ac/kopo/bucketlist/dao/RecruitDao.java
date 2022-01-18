package kr.ac.kopo.bucketlist.dao;

import java.util.List;

import kr.ac.kopo.bucketlist.model.Recruit;
import kr.ac.kopo.bucketlist.util.Pager;

public interface RecruitDao {

	int total(Pager pager);

	List<Recruit> recruit(Pager pager);

	void add(Recruit item);

	Recruit item(int code);

	void update(Recruit item);

	void delete(int code);

}
