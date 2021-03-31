package com.theoldzheng.dao;

import com.theoldzheng.pojo.User;
import com.theoldzheng.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {

    @Test
    public void getUserList() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        try {

            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = mapper.getUserList();
            for (User user : userList) {
                System.out.println(user);
            }
        } finally {
                sqlSession.close();
        }
    }


    @Test
    public void updateAdd() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        try {
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            User user1 = new User(null, "黄大锤", "123456", "123456");
            mapper.updateAdd(user1);
            System.out.println(user1.getId());
            sqlSession.commit();
            System.out.println(user1.getId());
        } finally {

            sqlSession.close();
        }
    }


    @Test
    public void getByIdAndName() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getByIdAndName("2","祥林嫂");
        System.out.println(user);
        sqlSession.close();
    }
}