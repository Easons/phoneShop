package com.phone.dao;

import com.phone.pojo.Brand_Type;

public interface Brand_TypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brand_type
     *
     * @mbggenerated Thu Dec 07 14:44:02 CST 2017
     */
    int deleteByPrimaryKey(Integer brandId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brand_type
     *
     * @mbggenerated Thu Dec 07 14:44:02 CST 2017
     */
    int insert(Brand_Type record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brand_type
     *
     * @mbggenerated Thu Dec 07 14:44:02 CST 2017
     */
    int insertSelective(Brand_Type record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brand_type
     *
     * @mbggenerated Thu Dec 07 14:44:02 CST 2017
     */
    Brand_Type selectByPrimaryKey(Integer brandId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brand_type
     *
     * @mbggenerated Thu Dec 07 14:44:02 CST 2017
     */
    int updateByPrimaryKeySelective(Brand_Type record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brand_type
     *
     * @mbggenerated Thu Dec 07 14:44:02 CST 2017
     */
    int updateByPrimaryKey(Brand_Type record);
}