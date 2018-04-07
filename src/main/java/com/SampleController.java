package com;
/**
 * <一句话功能简述> <功能详细描述>
 *
 * @author zhouhao
 * @version [版本号, 2018/4/6]
 */
import com.dao.ProductDao;
import com.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
@Controller
@EnableAutoConfiguration
@ComponentScan({"com"})
public class SampleController {

  @Autowired
  private ProductDao productDao;

  @RequestMapping("/")
  @ResponseBody
  @Transactional
  String home() {
    Product product = new Product();
    product.setId(10001);
    product.setName("测试摘要");
    product.setPrice(1000.0);
    try {
      productDao.insertProductInfo(product);
    }catch (Exception e){
      e.printStackTrace();
    }
    return "Hello World!";
  }

  public static void main(String[] args) throws Exception {
    SpringApplication.run(SampleController.class, args);
  }
}
