package com.dao.impl;/*
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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * <一句话功能简述> <功能详细描述>
 *
 * @author zhouhao
 * @version [版本号, 2018/4/6]
 */
@Repository
public class ProductDaoImpl  implements ProductDao{

  @Autowired
  private NamedParameterJdbcTemplate jdbcTemplate;

  @Override
  @Transactional
  public Long insertProductInfo(Product product) {
    String sql = "insert into product(id,name,price,create_tm,company_id) " +
        "values(:id,:name,:price,:create_tm,:company_id)";
    Map<String, Object> param = new HashMap<>();
    param.put("id", product.getId());
    param.put("name", product.getName());
    param.put("price", product.getPrice());
    param.put("create_tm", new Date());
    param.put("company_id", 1);
    try {
      long update = jdbcTemplate.update(sql, param);
    }catch (Exception e){
      e.printStackTrace();
    }
    jdbcTemplate.query("select * from product", new ResultSetExtractor<Product>() {

      @Override
      public Product extractData(ResultSet rs) throws SQLException, DataAccessException {
        return new Product();
      }
    });
    return 1L;
  }
}
