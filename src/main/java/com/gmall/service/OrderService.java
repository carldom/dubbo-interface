package com.gmall.service;

import java.util.List;

import com.gmall.bean.UserAddress;

public interface OrderService {

	public List<UserAddress> initOrder(String userId);
}
