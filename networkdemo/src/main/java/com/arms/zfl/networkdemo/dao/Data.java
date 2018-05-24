/**
  * Copyright 2018 bejson.com 
  */
package com.arms.zfl.networkdemo.dao;
import java.util.List;
import java.util.Date;

/**
 * Auto-generated: 2018-05-24 13:7:11
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Data {

    private int pageNum;
    private int pageSize;
    private int size;
    private String orderBy;
    private int startRow;
    private int endRow;
    private int total;
    private int pages;
    private List<List> list;
    private int firstPage;
    private int prePage;
    private int nextPage;
    private int lastPage;
    private boolean isFirstPage;
    private boolean isLastPage;
    private boolean hasPreviousPage;
    private boolean hasNextPage;
    private int navigatePages;
    private Date navigatepageNums;
    public void setPageNum(int pageNum) {
         this.pageNum = pageNum;
     }
     public int getPageNum() {
         return pageNum;
     }

    public void setPageSize(int pageSize) {
         this.pageSize = pageSize;
     }
     public int getPageSize() {
         return pageSize;
     }

    public void setSize(int size) {
         this.size = size;
     }
     public int getSize() {
         return size;
     }

    public void setOrderBy(String orderBy) {
         this.orderBy = orderBy;
     }
     public String getOrderBy() {
         return orderBy;
     }

    public void setStartRow(int startRow) {
         this.startRow = startRow;
     }
     public int getStartRow() {
         return startRow;
     }

    public void setEndRow(int endRow) {
         this.endRow = endRow;
     }
     public int getEndRow() {
         return endRow;
     }

    public void setTotal(int total) {
         this.total = total;
     }
     public int getTotal() {
         return total;
     }

    public void setPages(int pages) {
         this.pages = pages;
     }
     public int getPages() {
         return pages;
     }

    public void setList(List<List> list) {
         this.list = list;
     }
     public List<List> getList() {
         return list;
     }

    public void setFirstPage(int firstPage) {
         this.firstPage = firstPage;
     }
     public int getFirstPage() {
         return firstPage;
     }

    public void setPrePage(int prePage) {
         this.prePage = prePage;
     }
     public int getPrePage() {
         return prePage;
     }

    public void setNextPage(int nextPage) {
         this.nextPage = nextPage;
     }
     public int getNextPage() {
         return nextPage;
     }

    public void setLastPage(int lastPage) {
         this.lastPage = lastPage;
     }
     public int getLastPage() {
         return lastPage;
     }

    public void setIsFirstPage(boolean isFirstPage) {
         this.isFirstPage = isFirstPage;
     }
     public boolean getIsFirstPage() {
         return isFirstPage;
     }

    public void setIsLastPage(boolean isLastPage) {
         this.isLastPage = isLastPage;
     }
     public boolean getIsLastPage() {
         return isLastPage;
     }

    public void setHasPreviousPage(boolean hasPreviousPage) {
         this.hasPreviousPage = hasPreviousPage;
     }
     public boolean getHasPreviousPage() {
         return hasPreviousPage;
     }

    public void setHasNextPage(boolean hasNextPage) {
         this.hasNextPage = hasNextPage;
     }
     public boolean getHasNextPage() {
         return hasNextPage;
     }

    public void setNavigatePages(int navigatePages) {
         this.navigatePages = navigatePages;
     }
     public int getNavigatePages() {
         return navigatePages;
     }

    public void setNavigatepageNums(Date navigatepageNums) {
         this.navigatepageNums = navigatepageNums;
     }
     public Date getNavigatepageNums() {
         return navigatepageNums;
     }

}