package com.theoldzheng.dao;

import com.theoldzheng.pojo.User;
import com.theoldzheng.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class UserMapperTest {

    @Test
    public void getUserList() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }

    @Test
    public void getUserById() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userById = mapper.getUserById(2);
        System.out.println(userById);
        sqlSession.close();
    }

    /*@Test
    public void updateAdd() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateAdd(new User(3, "王多鱼", "1232456"));
        sqlSession.commit();
        sqlSession.close();
    }*/


    @Test
    public void deleteById() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteById(1);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void update() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.update(new User(2, "祥林嫂", "123456667"));
        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public void getByLike() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getByLike("王");
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void test01() {
        Logger logger = Logger.getLogger(this.getClass());
        logger.error("hello world");
    }

    @Test
    public void getByLimit() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Integer> map = new HashMap<>();
        map.put("startIndex",0);
        map.put("pageSize",3);
//        map.put("name","大聪明");
//        map.put("password","123456");
        List<User> byLimit = mapper.getByLimit(map);
        for (User user : byLimit) {
            System.out.println(user);
        }
        sqlSession.close();
    }
}