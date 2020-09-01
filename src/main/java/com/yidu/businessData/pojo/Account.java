package com.yidu.businessData.pojo;

public class Account {
    private String accountId;       //PK 账户编号A001
    private String fundId;          //基金Id 来自基金表
    private String blankCardCode;   //银行卡号
    private String accountName;     //账户名称
    private String blankName;       //银行名称
    private Integer deposit;        //存款类型  1=活期  2=定期
    private Double cardRate;       //卡号利率  ?/100  年利率
    private Integer provisionDays;  //计息期间  1=360天；2=365天；3=366天
    private String openTime;        //开户时间
    private  String endTime;        //结束时间
    private String desc;            //备注*

    public Account() {
    }

    public Account(String accountId, String fundId, String blankCardCode, String accountName, String blankName, Integer deposit, Double cardRate, Integer provisionDays, String openTime, String endTime, String desc) {
        this.accountId = accountId;
        this.fundId = fundId;
        this.blankCardCode = blankCardCode;
        this.accountName = accountName;
        this.blankName = blankName;
        this.deposit = deposit;
        this.cardRate = cardRate;
        this.provisionDays = provisionDays;
        this.openTime = openTime;
        this.endTime = endTime;
        this.desc = desc;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getFundId() {
        return fundId;
    }

    public void setFundId(String fundId) {
        this.fundId = fundId;
    }

    public String getBlankCardCode() {
        return blankCardCode;
    }

    public void setBlankCardCode(String blankCardCode) {
        this.blankCardCode = blankCardCode;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getBlankName() {
        return blankName;
    }

    public void setBlankName(String blankName) {
        this.blankName = blankName;
    }

    public Integer getDeposit() {
        return deposit;
    }

    public void setDeposit(Integer deposit) {
        this.deposit = deposit;
    }

    public Double getCardRate() {
        return cardRate;
    }

    public void setCardRate(Double cardRate) {
        this.cardRate = cardRate;
    }

    public Integer getProvisionDays() {
        return provisionDays;
    }

    public void setProvisionDays(Integer provisionDays) {
        this.provisionDays = provisionDays;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId='" + accountId + '\'' +
                ", fundId='" + fundId + '\'' +
                ", blankCardCode='" + blankCardCode + '\'' +
                ", accountName='" + accountName + '\'' +
                ", blankName='" + blankName + '\'' +
                ", deposit=" + deposit +
                ", cardRate=" + cardRate +
                ", provisionDays=" + provisionDays +
                ", openTime='" + openTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
