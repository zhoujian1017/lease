package com.atguigu.lease.web.admin.service.impl;

import com.atguigu.lease.model.entity.ApartmentInfo;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.lease.model.entity.ProvinceInfo;
import com.atguigu.lease.web.admin.service.ProvinceInfoService;
import com.atguigu.lease.web.admin.mapper.ProvinceInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author liubo
* @description 针对表【province_info】的数据库操作Service实现
* @createDate 2023-07-24 15:48:00
*/
@Service
public class ProvinceInfoServiceImpl extends ServiceImpl<ProvinceInfoMapper, ProvinceInfo>
    implements ProvinceInfoService{

    @Autowired
    private ProvinceInfoMapper provinceInfoMapper;
    @Override
    public String getProvinceNameById(Long provinceId) {
        ProvinceInfo provinceInfo = provinceInfoMapper.selectById(provinceId);
        return provinceInfo != null ? provinceInfo.getName(): null;
    }
}




