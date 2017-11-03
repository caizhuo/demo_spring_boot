package com.example.demo.service;

import com.example.demo.domain.City;

import java.util.List;

/**
 * @author CaiZhuo
 * @create 2017-10-29 22:12
 * @desc 城市Service
 **/
public interface CityService {
    /**
     *获取城市信息列表
     * @return
     */
    List<City> findAllCity();

    /**
     *根据城市 ID,查询城市信息
     * @param id
     * @return
     */
    City findCityById(int id);

    /**
     *新增城市信息
     * @param city
     * @return
     */
    int saveCity(City city);

    /**
     *更新城市信息
     * @param city
     * @return
     */
    int updateCity(City city);

    /**
     *根据城市 ID,删除城市信息
     * @param id
     * @return
     */
    int deleteCity(int id);
}
