/**
 * @author 吴春胤
 * 
 */
package com.ding9.android.vo;

import java.util.List;
import java.util.Map;

public class Product {
 
  private int id;   //产品Id号
  private String name;  //产品名称
  private double lowPrice;  //产品最低价格
  private double highPrice; //产品最高价格
  private int showThingsCount;
  public int getId() {
    return id;
  }
  public String getName() {
    return name;
  }
  public double getLowPrice() {
    return lowPrice;
  }
  public double getHighPrice() {
    return highPrice;
  }
  public int getShowThingsCount() {
    return showThingsCount;
  }
  public int getCommentCount() {
    return commentCount;
  }
  
  /**
   * 方法说明
   * @return 参数
   */
  public String getImageUrl() {
    return imageUrl;
  }
  private int commentCount;  
  private String imageUrl;
}
