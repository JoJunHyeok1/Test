package kr.ac.kopo.bucketlist.dao;

import java.util.List;

import kr.ac.kopo.bucketlist.model.Application;
import kr.ac.kopo.bucketlist.util.Pager;

public interface ApplicationDao {

	List<Application> application(Pager pager);

	int total(Pager pager);

	void add(Application item);

	Application item(int code);

	void update(Application item);

	void delete(int code);

}
