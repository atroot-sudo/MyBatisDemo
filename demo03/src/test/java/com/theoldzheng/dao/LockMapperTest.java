package com.theoldzheng.dao;

import com.theoldzheng.pojo.Key;
import com.theoldzheng.pojo.Lock;
import com.theoldzheng.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LockMapperTest {

    @Test
    public void getLockById() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        try {

            LockMapper mapper = sqlSession.getMapper(LockMapper.class);
            Lock lockById = mapper.getLockById(3);
            List<Key> keyList = lockById.getKeyList();
            for (Key key : keyList) {
                System.out.println(key);
            }
        } finally {
            sqlSession.close();
        }
    }
}