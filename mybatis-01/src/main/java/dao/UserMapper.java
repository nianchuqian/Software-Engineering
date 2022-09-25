package dao;

import pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author xie
 */
public interface UserMapper {
    /**
     * 查询全部用户
     */
    List<User> getUserList();

    /**
     * 根据ID查询用户
     */
    User getUserById(int id);

    User getUserById01(Map<String, Object> map);

    /**
     * 插入一个用户
     */
    int addUser(User user);

    int addUser01(Map<String, Object> map);

    /**
     * 修改用户
     */
    int updateUser(User user);

    /**
     * 删除用户
     */
    int deleteUser(int id);
    /**模糊查询*/
    List<User>getUserLike(String value);
}
