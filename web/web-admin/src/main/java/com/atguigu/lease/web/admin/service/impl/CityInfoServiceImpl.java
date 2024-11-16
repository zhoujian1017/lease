package com.atguigu.lease.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.lease.model.entity.CityInfo;
import com.atguigu.lease.web.admin.service.CityInfoService;
import com.atguigu.lease.web.admin.mapper.CityInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author liubo
* @description 针对表【city_info】的数据库操作Service实现
* @createDate 2023-07-24 15:48:00
*/
@Service
public class CityInfoServiceImpl extends ServiceImpl<CityInfoMapper, CityInfo>
    implements CityInfoService{

    @Autowired
    private CityInfoMapper cityInfoMapper;

    @Override
    public String getCityNameByCityId(Long cityId) {
        return cityInfoMapper.selectCityNameByCityId(cityId);
    }

    @Override
    public List<Long> getCityIdsByProvinceId(Long provinceId) {
        return cityInfoMapper.selectCityIdsByProvinceId(provinceId);
    }
}




