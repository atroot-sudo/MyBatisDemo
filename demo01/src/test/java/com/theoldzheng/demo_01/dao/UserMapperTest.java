package com.theoldzheng.demo_01.dao;

import com.theoldzheng.demo_01.pojo.User;
import com.theoldzheng.demo_01.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {

    @Test
    public void getUserList() {

        //获取SqlSession对象
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
        mapper.update(new User(2,"祥林嫂","123456667"));
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

    }
}