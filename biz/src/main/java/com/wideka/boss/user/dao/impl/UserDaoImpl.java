package com.wideka.boss.user.dao.impl;

import com.wideka.boss.api.user.bo.User;
import com.wideka.boss.framework.dao.impl.BaseDaoImpl;
import com.wideka.boss.user.dao.IUserDao;

/**
 * 
 * @author JiakunXu
 * 
 */
public class UserDaoImpl extends BaseDaoImpl implements IUserDao {

	@Override
	public User getUserByPassport(String passport) {
		return (User) getSqlMapClientTemplate().queryForObject("user.getUserByPassport", passport);
	}

}
