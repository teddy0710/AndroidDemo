/**
  * Copyright 2018 bejson.com 
  */
package com.arms.zfl.networkdemo.dao;
import java.util.Date;
import java.util.List;

/**
 * Auto-generated: 2018-05-24 13:7:11
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Res {

    private long orderNo;
    private int payment;
    private int paymentType;
    private String paymentTypeDesc;
    private int postage;
    private int status;
    private String statusDesc;
    private String paymentTime;
    private String sendTime;
    private String endTime;
    private String closeTime;
    private Date createTime;
    private List<OrderItemVoList> orderItemVoList;
    private String imageHost;
    private int shippingId;
    private String receiverName;
    private ShippingVo shippingVo;
    public void setOrderNo(long orderNo) {
         this.orderNo = orderNo;
     }
     public long getOrderNo() {
         return orderNo;
     }

    public void setPayment(int payment) {
         this.payment = payment;
     }
     public int getPayment() {
         return payment;
     }

    public void setPaymentType(int paymentType) {
         this.paymentType = paymentType;
     }
     public int getPaymentType() {
         return paymentType;
     }

    public void setPaymentTypeDesc(String paymentTypeDesc) {
         this.paymentTypeDesc = paymentTypeDesc;
     }
     public String getPaymentTypeDesc() {
         return paymentTypeDesc;
     }

    public void setPostage(int postage) {
         this.postage = postage;
     }
     public int getPostage() {
         return postage;
     }

    public void setStatus(int status) {
         this.status = status;
     }
     public int getStatus() {
         return status;
     }

    public void setStatusDesc(String statusDesc) {
         this.statusDesc = statusDesc;
     }
     public String getStatusDesc() {
         return statusDesc;
     }

    public void setPaymentTime(String paymentTime) {
         this.paymentTime = paymentTime;
     }
     public String getPaymentTime() {
         return paymentTime;
     }

    public void setSendTime(String sendTime) {
         this.sendTime = sendTime;
     }
     public String getSendTime() {
         return sendTime;
     }

    public void setEndTime(String endTime) {
         this.endTime = endTime;
     }
     public String getEndTime() {
         return endTime;
     }

    public void setCloseTime(String closeTime) {
         this.closeTime = closeTime;
     }
     public String getCloseTime() {
         return closeTime;
     }

    public void setCreateTime(Date createTime) {
         this.createTime = createTime;
     }
     public Date getCreateTime() {
         return createTime;
     }

    public void setOrderItemVoList(List<OrderItemVoList> orderItemVoList) {
         this.orderItemVoList = orderItemVoList;
     }
     public List<OrderItemVoList> getOrderItemVoList() {
         return orderItemVoList;
     }

    public void setImageHost(String imageHost) {
         this.imageHost = imageHost;
     }
     public String getImageHost() {
         return imageHost;
     }

    public void setShippingId(int shippingId) {
         this.shippingId = shippingId;
     }
     public int getShippingId() {
         return shippingId;
     }

    public void setReceiverName(String receiverName) {
         this.receiverName = receiverName;
     }
     public String getReceiverName() {
         return receiverName;
     }

    public void setShippingVo(ShippingVo shippingVo) {
         this.shippingVo = shippingVo;
     }
     public ShippingVo getShippingVo() {
         return shippingVo;
     }

}