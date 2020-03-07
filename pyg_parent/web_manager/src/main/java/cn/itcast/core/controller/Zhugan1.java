package cn.itcast.core.controller;

import cn.itcast.core.pojo.good.Brand;
import cn.itcast.core.service.BrandService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/brand")
public class Zhugan1 {

    @Reference
    private BrandService brandService;

    @RequestMapping("/findAll")
    public List<Brand> findAll(){
        List<Brand> list = brandService.findAll();
        System.out.println("Ö÷¸É");
        return list;
    }
}