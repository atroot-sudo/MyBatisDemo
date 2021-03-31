package com.theoldzheng.pojo;

/**
 * Description:钥匙表
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.31 18:46
 */
public class Key {
    private Integer id;
    private String keyName;
    private Lock lock;

    @Override
    public String toString() {
        return "Key{" +
                "id=" + id +
                ", keyName='" + keyName + '\'' +
                ", lock=" + lock +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public Lock getLock() {
        return lock;
    }

    public void setLock(Lock lock) {
        this.lock = lock;
    }

    public Key() {
    }

    public Key(Integer id, String keyName, Lock lock) {
        this.id = id;
        this.keyName = keyName;
        this.lock = lock;
    }
}
