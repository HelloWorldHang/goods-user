package com.brady.user.entity;

import java.io.Serializable;

public class SysUser implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.id
     *
     * @mbg.generated Thu Jan 28 17:33:55 CST 2021
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.username
     *
     * @mbg.generated Thu Jan 28 17:33:55 CST 2021
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.password
     *
     * @mbg.generated Thu Jan 28 17:33:55 CST 2021
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.nickname
     *
     * @mbg.generated Thu Jan 28 17:33:55 CST 2021
     */
    private String nickname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.addr
     *
     * @mbg.generated Thu Jan 28 17:33:55 CST 2021
     */
    private String addr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.phone_num
     *
     * @mbg.generated Thu Jan 28 17:33:55 CST 2021
     */
    private Integer phoneNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_user
     *
     * @mbg.generated Thu Jan 28 17:33:55 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.id
     *
     * @return the value of sys_user.id
     *
     * @mbg.generated Thu Jan 28 17:33:55 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.id
     *
     * @param id the value for sys_user.id
     *
     * @mbg.generated Thu Jan 28 17:33:55 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.username
     *
     * @return the value of sys_user.username
     *
     * @mbg.generated Thu Jan 28 17:33:55 CST 2021
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.username
     *
     * @param username the value for sys_user.username
     *
     * @mbg.generated Thu Jan 28 17:33:55 CST 2021
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.password
     *
     * @return the value of sys_user.password
     *
     * @mbg.generated Thu Jan 28 17:33:55 CST 2021
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.password
     *
     * @param password the value for sys_user.password
     *
     * @mbg.generated Thu Jan 28 17:33:55 CST 2021
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.nickname
     *
     * @return the value of sys_user.nickname
     *
     * @mbg.generated Thu Jan 28 17:33:55 CST 2021
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.nickname
     *
     * @param nickname the value for sys_user.nickname
     *
     * @mbg.generated Thu Jan 28 17:33:55 CST 2021
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.addr
     *
     * @return the value of sys_user.addr
     *
     * @mbg.generated Thu Jan 28 17:33:55 CST 2021
     */
    public String getAddr() {
        return addr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.addr
     *
     * @param addr the value for sys_user.addr
     *
     * @mbg.generated Thu Jan 28 17:33:55 CST 2021
     */
    public void setAddr(String addr) {
        this.addr = addr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.phone_num
     *
     * @return the value of sys_user.phone_num
     *
     * @mbg.generated Thu Jan 28 17:33:55 CST 2021
     */
    public Integer getPhoneNum() {
        return phoneNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.phone_num
     *
     * @param phoneNum the value for sys_user.phone_num
     *
     * @mbg.generated Thu Jan 28 17:33:55 CST 2021
     */
    public void setPhoneNum(Integer phoneNum) {
        this.phoneNum = phoneNum;
    }
}