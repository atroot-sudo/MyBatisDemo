package com.theoldzheng.pojo;

import org.apache.ibatis.type.Alias;

/**
 * Description:
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.3.28 12:46
 */
@Alias("user")
public class User {
    private Integer id;
    private String name;
    private String password;
    private String txPassword;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", txPassword='" + txPassword + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTxPassword() {
        return txPassword;
    }

    public void setTxPassword(String txPassword) {
        this.txPassword = txPassword;
    }

    public User() {
    }

    public User(Integer id, String name, String password, String txPassword) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.txPassword = txPassword;
    }
}
