package com.theoldzheng.dao;

import com.theoldzheng.pojo.Student;
import com.theoldzheng.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class StudentMapperTest {

    @Test
    public void getStudentList() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        try {
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            List<Student> studentList = mapper.getStudentList(2);
            for (Student student : studentList) {
                System.out.println(student);
            }
        } finally {
            sqlSession.close();
        }
    }


    @Test
    public void getStudentListByIn() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        try {
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            List<Student> studentListByIn = mapper.getStudentListByIn(Arrays.asList(1, 2, 3, 4));
            for (Student student : studentListByIn) {
                System.out.println(student);
            }
        } finally {
            sqlSession.close();
        }
    }

    /**
     * 测试一级缓存
     */
    @Test
    public void test(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student s1 = mapper.getStudentById(2);
        System.out.println(s1);
        System.out.println("**********");
        Student s2 = mapper.getStudentById(2);
        System.out.println(s2);
        sqlSession.close();
    }

    /**
     * 测试二级缓存
     */
    @Test
    public void test01(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        SqlSession sqlSession2 = MyBatisUtils.getSqlSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student s1 = mapper.getStudentById(2);
        System.out.println(s1);
        sqlSession.close();
        System.out.println("***********");

        StudentMapper mapper2 = sqlSession2.getMapper(StudentMapper.class);
        Student s2 = mapper2.getStudentById(2);
        System.out.println(s2);
        sqlSession2.close();
    }
}