package com.chittaranjan.demo.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.chittaranjan.demo.entity.CityEntity;
import com.chittaranjan.demo.repository.CityRepository;
import com.chittaranjan.demo.service.CityService;

@Service("cityService")
public class CityServiceImpl implements CityService {

  @Autowired
  private CityRepository cityRepository;

  @Override
  public List<CityEntity> getAllCities() {
    return cityRepository.findAll();
  }
}
