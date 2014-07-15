package com.ding9.android.business;

import com.ding9.android.util.Pagination;
import com.ding9.android.vo.Product;
import com.ding9.android.vo.ProductDetail;

public class ProductBO {
  public Pagination<Product> search(String keyword, int pageNo, int pageSize, String sortType) {
    return new Pagination();
  }

  public Pagination<Product> search(String keyword, int pageNo, int pageSize) {
    return search(keyword, pageNo, pageSize, "default");

  }

  public Product getProduct(int productId) {    
    return null;

  }

  public ProductDetail getProductDetail(int productId) {
    return null;
  }
}
