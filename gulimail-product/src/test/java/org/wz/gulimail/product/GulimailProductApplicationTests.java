package org.wz.gulimail.product;

import com.aliyun.oss.OSSClient;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.wz.gulimail.product.entity.BrandEntity;
import org.wz.gulimail.product.entity.CategoryEntity;
import org.wz.gulimail.product.service.BrandService;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@SpringBootTest
class GulimailProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Autowired
    OSSClient ossClient;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为手机");
        log.info("插入结果{}",brandService.save(brandEntity));
    }

    @Test
    void test1() {
        List<CategoryEntity> collect = new ArrayList<CategoryEntity>().stream()
                .sorted(Comparator.comparingInt(CategoryEntity::getSort))
                .collect(Collectors.toList());
    }

    @Test
    public void upload() throws FileNotFoundException {
//        String url = "gulimail-wz-2020.oss-cn-hangzhou.aliyuncs.com";
        String endPoint = "oss-cn-hangzhou.aliyuncs.com";
        String accessKeyId = "LTAI5tNrUWEW2GY8yAoHo5YD";
        String accessKeySecret = "lpDIwy04xVCqSxWuYXpFJL492Tgnjm";
//
//        OSS ossClient = new OSSClientBuilder().build(endPoint, accessKeyId, accessKeySecret);
//
//
        FileInputStream fileInputStream = new FileInputStream("E:\\picture\\r&m_day.jpg");

        ossClient.putObject("gulimail-wz-2020","r&m_day.jpg", fileInputStream);
        ossClient.shutdown();
    }


}
