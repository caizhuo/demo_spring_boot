package com.example.demo.service;

import com.example.demo.dao.CityMapper;
import com.example.demo.domain.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * @author CaiZhuo
 * @create 2017-10-29 22:14
 * @desc 城市ServiceImpl
 **/
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityMapper cityMapper;

    public List<City> findAllCity() {
        return cityMapper.findAllCity();
    }


    public City findCityById(int id) {
        return cityMapper.findById(id);
    }


    @Override
    public int saveCity(City city) {
        return cityMapper.saveCity(city);
    }

    @Override
    public int updateCity(City city) {
        return cityMapper.updateCity(city);
    }

    @Override
    public int deleteCity(int id) {
        return cityMapper.deleteCity(id);
    }
}
