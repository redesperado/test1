package com.example.test.service;

import com.example.test.bean.UserBean;

import java.util.List;

public interface UserService {

    UserBean loginIn(String name,String password);

    UserBean queryUserById(String id);

    int addUser(UserBean userBean);

    int dropUser(String id);

    int modifyUser(UserBean userBean);

    List<UserBean> queryAllUser();

}
