package cn.itcast.core.service;

import cn.itcast.core.pojo.good.Brand;

import java.util.List;

public interface BrandService {
    public List<Brand> findAll();

//    //public PageResult findPage(Integer page, Integer rows);
//    public PageResult findPage(Brand brand, Integer page, Integer rows);
//
//    public void add(Brand brand);
//
//    public Brand findOne(Long id);
//
//    public void update(Brand brand);
//
//    public void delete(Long[] ids);
//
//    public List<Map> selectOptionList();
}
