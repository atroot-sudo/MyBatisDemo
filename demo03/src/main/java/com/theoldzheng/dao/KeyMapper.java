package com.theoldzheng.dao;

import com.theoldzheng.pojo.Key;

/**
 * Description:
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.31 19:08
 */

public interface KeyMapper {
    /**
     * 使用级联注入的方式实现联查
     * @param id
     * @return
     */
    Key getKeyById(Integer id);
    Key getKeyByIdSimple(Integer id);
}
