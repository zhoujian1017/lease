package com.atguigu.lease.web.admin.service.impl;

import com.atguigu.lease.model.entity.CityInfo;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.lease.model.entity.DistrictInfo;
import com.atguigu.lease.web.admin.service.DistrictInfoService;
import com.atguigu.lease.web.admin.mapper.DistrictInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author liubo
* @description 针对表【district_info】的数据库操作Service实现
* @createDate 2023-07-24 15:48:00
*/
@Service
public class DistrictInfoServiceImpl extends ServiceImpl<DistrictInfoMapper, DistrictInfo>
    implements DistrictInfoService{
    @Autowired
    private DistrictInfoMapper mapper;

    @Override
    public String getDistrictNameByDistrictId(Long districtId) {
        return mapper.selectCityNameByCityId(districtId);
    }

    @Override
    public List<Long> getDistrictIdsByCityId(Long CityId) {
        return mapper.selectCityIdsByProvinceId(CityId);
    }
}




