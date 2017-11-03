package com.example.demo.controller;

import com.example.demo.domain.City;
import com.example.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author CaiZhuo
 * @create 2017-10-29 22:10
 * @desc 城市Controller
 **/
@RestController
@RequestMapping("/city")
public class CityRestController {
    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/test/{id}",method = RequestMethod.GET)
    public Object findOneCity(@PathVariable("id") Integer id){
        return cityService.findCityById(id);
    }
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<City> findAllCity() {
        return cityService.findAllCity();
    }
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public void createCity(@RequestBody City city) {
        cityService.saveCity(city);
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public void modifyCity(@RequestBody City city) {
        cityService.updateCity(city);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void modifyCity(@PathVariable("id") Integer id) {
        cityService.deleteCity(id);
    }

}
