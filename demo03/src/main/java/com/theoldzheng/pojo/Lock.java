package com.theoldzheng.pojo;

import java.util.List;

/**
 * Description:锁子表
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.31 18:50
 */
public class Lock {
    private Integer id;
    private String lockName;
    private List<Key> keyList;



    @Override
    public String toString() {
        return "Lock{" +
                "id=" + id +
                ", lockName='" + lockName + '\'' +
                ", keyList=" + keyList +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLockName() {
        return lockName;
    }

    public void setLockName(String lockName) {
        this.lockName = lockName;
    }

    public List<Key> getKeyList() {
        return keyList;
    }

    public void setKeyList(List<Key> keyList) {
        this.keyList = keyList;
    }

    public Lock() {
    }

    public Lock(Integer id, String lockName, List<Key> keyList) {
        this.id = id;
        this.lockName = lockName;
        this.keyList = keyList;
    }
}
