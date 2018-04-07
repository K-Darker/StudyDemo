package com.domain;
/*
* 文 件 名: ${file_name}
* 版 权: xxx., Ltd. Copyright 2015-2018, All rights reserved
* 描 述: &lt;描述&gt;
* 修 改 人:zhouhao
* 修改时间: 2018/4/6
* 跟踪单号: &lt;跟踪单号&gt;
* 修改单号: &lt;修改单号&gt;
* 修改内容:&lt;修改内容&gt;
*/

import javax.persistence.Entity;

/**
 * <一句话功能简述> <功能详细描述>
 *
 * @author zhouhao
 * @version [版本号, 2018/4/6]
 */
public class Product {
  private int id;
  private String name;
  private double price;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}
