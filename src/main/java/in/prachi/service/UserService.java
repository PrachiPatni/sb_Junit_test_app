package in.prachi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.prachi.dao.UserDao;

@Service


public class UserService {

	@Autowired
	private UserDao userDao;
	public String getUsername(Integer uid) {
		System.out.println(userDao.getClass().getName());
		String findName = userDao.findName(uid);
		System.out.println("Name ::"+ findName);

	return findName;
}
}