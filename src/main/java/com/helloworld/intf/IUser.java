package com.helloworld.intf;

import com.helloworld.entities.User;

/**
 * 用户接口
 * @author 高达
 *
 */
public interface IUser {

	/**
	 * 注册
	 * @return
	 */
	public boolean registered(User user);
}
