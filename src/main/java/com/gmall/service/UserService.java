package com.gmall.service;

import java.util.List;

import com.gmall.bean.UserAddress;

public interface UserService {
	
	public List<UserAddress> getUserAddressList(String userId);
}
