package com;/*
* 文 件 名: ${file_name}
* 版 权: xxx., Ltd. Copyright 2015-2018, All rights reserved
* 描 述: &lt;描述&gt;
* 修 改 人:zhouhao
* 修改时间: 2018/4/6
* 跟踪单号: &lt;跟踪单号&gt;
* 修改单号: &lt;修改单号&gt;
* 修改内容:&lt;修改内容&gt;
*/

import com.dao.ProductDao;
import com.domain.Product;
import javafx.application.Application;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * <一句话功能简述> <功能详细描述>
 *
 * @author zhouhao
 * @version [版本号, 2018/4/6]
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SampleController.class)
public class MycatTest {
  @Autowired
  private ProductDao productDao;

  @Test
  @Transactional
  public void testInsert() {
    Product product = new Product();
    product.setId(10001);
    product.setName("测试摘要");
    product.setPrice(1000.0);
    try {
      productDao.insertProductInfo(product);
    }catch (Exception e){
      e.printStackTrace();
    }

  }
}
