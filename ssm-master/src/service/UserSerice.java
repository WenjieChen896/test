package service;

import po.User;
import po.UserExample;

import java.util.List;

public interface UserSerice {
    //查询所有
    public List<User> findUserList() throws Exception;
    }
