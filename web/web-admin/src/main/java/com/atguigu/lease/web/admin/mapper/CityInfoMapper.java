package com.atguigu.lease.web.admin.mapper;

import com.atguigu.lease.model.entity.CityInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
* @author liubo
* @description 针对表【city_info】的数据库操作Mapper
* @createDate 2023-07-24 15:48:00
* @Entity com.atguigu.lease.model.CityInfo
*/
public interface CityInfoMapper extends BaseMapper<CityInfo> {

    // 根据城市ID查询城市名称
    @Select("SELECT name FROM city_info WHERE id = #{cityId}")
    String selectCityNameByCityId(Long cityId);

    // 根据省份ID查询城市ID列表
    @Select("SELECT id FROM city_info WHERE province_id = #{provinceId}")
    List<Long> selectCityIdsByProvinceId(Long provinceId);
}




