package com.theoldzheng.dao;


import com.theoldzheng.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * Description:
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.28 12:58
 */
public interface UserMapper {
    /**
     * 查询数据库中所有的信息
     *
     * @return 所有信息的list
     */
    List<User> getUserList();

    /**
     * 通过id查询数据库信息
     *
     * @param id 传入一个id值
     * @return 返回一条信息
     */
    User getUserById(int id);

    /**
     * 插入一条数据
     *
     * @param user 传入一个要插入对象
     */
    void updateAdd(User user);

    /**
     * 根据传入的id值删除一条数据
     *
     * @param id 传入想要删除的id
     */
    void deleteById(int id);

    /**
     * 更新操作
     *
     * @param user
     */
    void update(User user);

    /**
     * 模糊查询
     *
     * @param value 传入值
     * @return 返回User实例
     */
    List<User> getByLike(String value);

    /**
     * 分页查询
     *
     * @param map 传入map
     * @return User实例
     */
    List<User> getByLimit(Map<String, Integer> map);

}
