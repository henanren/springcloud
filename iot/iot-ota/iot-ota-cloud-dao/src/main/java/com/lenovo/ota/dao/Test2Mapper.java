package com.lenovo.ota.dao;

import com.lenovo.ota.entites.Test2;

public interface Test2Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test2
     *
     * @mbggenerated Thu Dec 06 09:53:30 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test2
     *
     * @mbggenerated Thu Dec 06 09:53:30 CST 2018
     */
    int insert(Test2 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test2
     *
     * @mbggenerated Thu Dec 06 09:53:30 CST 2018
     */
    int insertSelective(Test2 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test2
     *
     * @mbggenerated Thu Dec 06 09:53:30 CST 2018
     */
    Test2 selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test2
     *
     * @mbggenerated Thu Dec 06 09:53:30 CST 2018
     */
    int updateByPrimaryKeySelective(Test2 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test2
     *
     * @mbggenerated Thu Dec 06 09:53:30 CST 2018
     */
    int updateByPrimaryKey(Test2 record);
}