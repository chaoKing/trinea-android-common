package com.ding9.android.util;

import java.util.ArrayList;
import java.util.List;

import android.R.integer;

public class Pagination<T> {

  private List<T> records = new ArrayList<T>(); // 当前分页的记录集合

  private int currentPageNumber; // 当前页的页码

  private int amountOfRecorders; // 记录总数

  private int pageSize; //每页的记录数

  public List<T> getRecords() {
    return records;
  }

  public void setRecords(List<T> records) {
    this.records = records;
  }

  public int getCurrentPageNumber() {
    return currentPageNumber;
  }

  public void setCurrentPageNumber(int currentPageNumber) {
    this.currentPageNumber = currentPageNumber;
  }

  public int getAmountOfRecorders() {
    return amountOfRecorders;
  }

  public void setAmountOfRecorders(int amountOfRecorders) {
    this.amountOfRecorders = amountOfRecorders;
  }

  public int getPageSize() {
    return pageSize;
  }

  public void setPageSize(int pageSize) {
    this.pageSize = pageSize;
  }
}
