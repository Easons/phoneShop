package com.phone.dao;

import com.phone.pojo.user;

public interface userMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Tue Oct 03 11:37:50 CST 2017
     */
    int deleteByPrimaryKey(Integer uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Tue Oct 03 11:37:50 CST 2017
     */
    int insert(user record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Tue Oct 03 11:37:50 CST 2017
     */
    int insertSelective(user record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Tue Oct 03 11:37:50 CST 2017
     */
    user selectByPrimaryKey(Integer uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Tue Oct 03 11:37:50 CST 2017
     */
    int updateByPrimaryKeySelective(user record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Tue Oct 03 11:37:50 CST 2017
     */
    int updateByPrimaryKey(user record);
}