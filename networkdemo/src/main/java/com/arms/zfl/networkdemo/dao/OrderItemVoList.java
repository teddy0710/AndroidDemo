/**
  * Copyright 2018 bejson.com 
  */
package com.arms.zfl.networkdemo.dao;
import java.util.Date;

/**
 * Auto-generated: 2018-05-24 13:7:11
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class OrderItemVoList {

    private long orderNo;
    private int productId;
    private String productName;
    private String productImage;
    private int currentUnitPrice;
    private int quantity;
    private int totalPrice;
    private Date createTime;
    public void setOrderNo(long orderNo) {
         this.orderNo = orderNo;
     }
     public long getOrderNo() {
         return orderNo;
     }

    public void setProductId(int productId) {
         this.productId = productId;
     }
     public int getProductId() {
         return productId;
     }

    public void setProductName(String productName) {
         this.productName = productName;
     }
     public String getProductName() {
         return productName;
     }

    public void setProductImage(String productImage) {
         this.productImage = productImage;
     }
     public String getProductImage() {
         return productImage;
     }

    public void setCurrentUnitPrice(int currentUnitPrice) {
         this.currentUnitPrice = currentUnitPrice;
     }
     public int getCurrentUnitPrice() {
         return currentUnitPrice;
     }

    public void setQuantity(int quantity) {
         this.quantity = quantity;
     }
     public int getQuantity() {
         return quantity;
     }

    public void setTotalPrice(int totalPrice) {
         this.totalPrice = totalPrice;
     }
     public int getTotalPrice() {
         return totalPrice;
     }

    public void setCreateTime(Date createTime) {
         this.createTime = createTime;
     }
     public Date getCreateTime() {
         return createTime;
     }

}