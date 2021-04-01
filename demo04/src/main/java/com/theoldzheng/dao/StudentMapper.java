package com.theoldzheng.dao;

import com.theoldzheng.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Description:
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.4.1 9:37
 */
public interface StudentMapper {
    List <Student> getStudentList(@Param(value = "id") Integer id);
    List<Student> getStudentListByIn(@Param("list") List<Integer> list);
    Student getStudentById(Integer id);
}
