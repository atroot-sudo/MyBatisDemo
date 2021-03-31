package com.theoldzheng.dao;

import com.theoldzheng.pojo.Lock;

/**
 * Description:
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.31 20:07
 */
public interface LockMapper {
    Lock getLockById(Integer id);
    Lock getLockByIdSimple(Integer id);
}
