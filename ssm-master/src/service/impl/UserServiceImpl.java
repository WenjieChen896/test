package service.impl;

import mapper.UserMapper;
import mapper.UserMapperCustom;
import org.springframework.beans.factory.annotation.Autowired;
import po.User;
import po.UserExample;
import service.UserSerice;

import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Description todo
 * @Author chenwj
 * @Date2018/10/28 18:59
 * @Version 1.0
 */
public class UserServiceImpl implements UserSerice {
    @Autowired
    private UserMapperCustom userMapperCustom;

  @Override
  //查询所有
  public List<User> findUserList() throws Exception{
      return userMapperCustom.selectallUser();
};


}
