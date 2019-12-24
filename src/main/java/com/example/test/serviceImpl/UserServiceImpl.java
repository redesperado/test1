package com.example.test.serviceImpl;

import com.example.test.bean.UserBean;
import com.example.test.mapper.UserMapper;
import com.example.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    //将DAO注入Service层
    @Autowired
    UserMapper userMapper;

    @Override
    public UserBean loginIn(String name, String password) {
        return userMapper.getInfo(name,password);
    }

    @Override
    public UserBean queryUserById(String id) {
        return userMapper.selectUserById(id);
    }


    @Override
    public int addUser(UserBean userBean) {
        int aFlag = userMapper.insertUser(userBean);
        return aFlag;
    }

    @Override
    public int dropUser(String id) {
        int dFlag = userMapper.deleteUser(id);
        return dFlag;
    }

    @Override
    public int modifyUser(UserBean userBean) {
        int mFlag = userMapper.updateUser(userBean);
        return mFlag;
    }

    @Override
    public List<UserBean> queryAllUser() {
        return userMapper.getAllUser();
    }
}
