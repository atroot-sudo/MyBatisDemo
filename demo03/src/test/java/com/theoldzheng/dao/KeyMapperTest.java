package com.theoldzheng.dao;

import com.theoldzheng.pojo.Key;
import com.theoldzheng.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class KeyMapperTest {

    @Test
    public void getKeyById() {
        SqlSession  sqlSession = MyBatisUtils.getSqlSession();
        try {

            KeyMapper mapper = sqlSession.getMapper(KeyMapper.class);
            Key keyById = mapper.getKeyById(2);
            System.out.println(keyById);
        } finally {
            sqlSession.close();

        }
    }


    @Test
    public void getKeyByIdSimple() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        KeyMapper mapper = sqlSession.getMapper(KeyMapper.class);
        Key keyByIdSimple = mapper.getKeyByIdSimple(1);
        System.out.println(keyByIdSimple);
        sqlSession.close();
    }
}