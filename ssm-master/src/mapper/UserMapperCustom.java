package mapper;

import po.User;

import java.util.List;

public interface UserMapperCustom {
    //查询用户列表
    List<User> selectallUser();
}
