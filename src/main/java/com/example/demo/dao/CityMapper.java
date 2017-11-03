package com.example.demo.dao;

import com.example.demo.domain.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CityMapper {

    /**
     *获取城市信息列表
     * @return
     */
    List<City> findAllCity();

    /**
     *根据城市 ID，获取城市信息
     * @param id
     * @return
     */
    City findById(@Param("id") Integer id);

    /**
     *
     * @param city
     * @return
     */
    int saveCity(City city);

    int updateCity(City city);

    int deleteCity(Integer id);
    //==============================================================
    int deleteByPrimaryKey(Integer id);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
}