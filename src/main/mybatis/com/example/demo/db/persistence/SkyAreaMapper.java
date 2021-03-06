package com.example.demo.db.persistence;

import java.util.List;

import com.example.demo.db.domain.SkyArea;

public interface SkyAreaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sky_area
     *
     * @mbggenerated
     */
    int insert(SkyArea record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sky_area
     *
     * @mbggenerated
     */
    int insertSelective(SkyArea record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sky_area
     *
     * @mbggenerated
     */
    SkyArea selectByPrimaryKey(Integer areaid);
    
    /**
     * 
     * @return
     */
    List<SkyArea> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sky_area
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SkyArea record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sky_area
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SkyArea record);
}