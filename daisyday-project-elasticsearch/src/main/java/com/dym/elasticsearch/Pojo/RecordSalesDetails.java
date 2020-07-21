package com.dym.elasticsearch.Pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
@Document(indexName = "sale_record_test",type = "record_sales_details", shards = 1,replicas = 0, refreshInterval = "-1")
public class RecordSalesDetails implements Serializable {
	 /**
     * record_sales_details.id (销售明细id)
     * @author: lying
     * @time: 2019-02-25 14:03:54
     */
	 @Id
    private String id;

    /**
     * record_sales_details.detail_id (交易详情id(1订单商品id，2订单id))
     * @author: lying
     * @time: 2019-02-25 14:03:54
     */
    private String detailId;

    /**
     * record_sales_details.order_code (订单编号)
     * @author: lying
     * @time: 2019-02-25 14:03:54
     */
    private String orderCode;

    /**
     * record_sales_details.deal_code (E3交易号)
     * @author: lying
     * @time: 2019-02-25 14:03:54
     */
    private String dealCode;

    /**
     * record_sales_details.pay_date (支付时间)
     * @author: lying
     * @time: 2019-02-25 14:03:54
     */
    @Field( type = FieldType.Date, format = DateFormat.custom,pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern ="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date payDate;

    /**
     * record_sales_details.pay_code (商户交易号)
     * @author: lying
     * @time: 2019-02-25 14:03:54
     */
    private String payCode;

    /**
     * record_sales_details.channel (支付渠道：0无支付，1支付宝App支付，2支付宝扫码支付，3微信App支付，4微信公众号支付，5微信扫码支付，6余额支付，7智荟金桥，8微信小程序支付)
     * @author: lying
     * @time: 2019-02-25 14:03:54
     */
    private Integer channel;

    /**
     * record_sales_details.order_source (订单来源：1Android，2iOS，3PC，4H5，5接口，6小程序)
     * @author: lying
     * @time: 2019-02-25 14:03:54
     */
    private Integer orderSource;

    /**
     * record_sales_details.type (交易类型：1订单，2运费)
     * @author: lying
     * @time: 2019-02-25 14:03:54
     */
    private String type;

    /**
     * record_sales_details.supplier_name (供应商名称)
     * @author: lying
     * @time: 2019-02-25 14:03:54
     */
    private String supplierName;

    /**
     * record_sales_details.warehouse_name (仓库名称)
     * @author: lying
     * @time: 2019-02-25 14:03:54
     */
    private String warehouseName;

    /**
     * record_sales_details.deliver_type (发货类型：1一件代发，2入仓模式)
     * @author: lying
     * @time: 2019-02-25 14:03:54
     */
    private Integer deliverType;

    /**
     * record_sales_details.brand_name (品牌名称)
     * @author: lying
     * @time: 2019-02-25 14:03:54
     */
    private String brandName;

    /**
     * record_sales_details.special_code (专场编号)
     * @author: lying
     * @time: 2019-02-25 14:03:54
     */
    private String specialCode;

    /**
     * record_sales_details.special_name (专场名称)
     * @author: lying
     * @time: 2019-02-25 14:03:54
     */
    private String specialName;

    /**
     * record_sales_details.goods_name (商品名称(品牌+商品名称))
     * @author: lying
     * @time: 2019-02-25 14:03:54
     */
    private String goodsName;

    /**
     * record_sales_details.goods_code (商品款号)
     * @author: lying
     * @time: 2019-02-25 14:03:54
     */
    private String goodsCode;

    /**
     * record_sales_details.goods_spec (商品尺码)
     * @author: lying
     * @time: 2019-02-25 14:03:54
     */
    private String goodsSpec;

    /**
     * record_sales_details.bar_code (条形码)
     * @author: lying
     * @time: 2019-02-25 14:03:54
     */
    private String barCode;

    /**
     * record_sales_details.goods_num (商品数量)
     * @author: lying
     * @time: 2019-02-25 14:03:54
     */
    private Integer goodsNum;

    /**
     * record_sales_details.goods_weight (商品重量)
     * @author: lying
     * @time: 2019-02-25 14:03:54
     */
    private BigDecimal goodsWeight;

    /**
     * record_sales_details.unit (单位)
     * @author: lying
     * @time: 2019-02-25 14:03:54
     */
    private String unit;

    /**
     * record_sales_details.gold (金币减免)
     * @author: lying
     * @time: 2019-02-25 14:03:54
     */
    private BigDecimal gold;

    /**
     * record_sales_details.commission (自购减免（单位：分）)
     * @author: lying
     * @time: 2019-02-25 14:03:54
     */
    private BigDecimal commission;

    /**
     * record_sales_details.rebate (佣金(单位：分))
     * @author: lying
     * @time: 2019-02-25 14:03:54
     */
    private BigDecimal rebate;

    /**
     * record_sales_details.coupon (优惠劵（单位：分）)
     * @author: lying
     * @time: 2019-02-25 14:03:54
     */
    private BigDecimal coupon;

    /**
     * record_sales_details.goods_price (吊牌单价(单位：分))
     * @author: lying
     * @time: 2019-02-25 14:03:54
     */
    private BigDecimal goodsPrice;

    /**
     * record_sales_details.cost_price (成本单价(单位：分))
     * @author: lying
     * @time: 2019-02-25 14:03:54
     */
    private BigDecimal costPrice;

    /**
     * record_sales_details.goods_money (销售单价(单位：分))
     * @author: lying
     * @time: 2019-02-25 14:03:54
     */
    private BigDecimal goodsMoney;

    /**
     * record_sales_details.cost_amount (成本价实际结算总金额(单位：分))
     * @author: lying
     * @time: 2019-02-25 14:03:54
     */
    private BigDecimal costAmount;

    /**
     * record_sales_details.real_amount (销售价实际结算总金额(单位：分))
     * @author: lying
     * @time: 2019-02-25 14:03:54
     */
    private BigDecimal realAmount;

    /**
     * record_sales_details.income_money (收入金额(单位：分))
     * @author: lying
     * @time: 2019-02-25 14:03:54
     */
    private BigDecimal incomeMoney;

    /**
     * record_sales_details.create_date (创建时间)
     * @author: lying
     * @time: 2019-02-25 14:03:54
     */
    @Field( type = FieldType.Date,
            format = DateFormat.custom,pattern = "yyyy-MM-dd HH:mm:ss"
    )
    @JsonFormat (shape = JsonFormat.Shape.STRING, pattern ="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")

    private Date createDate;

    /**
     * record_sales_details.create_name (创建人)
     * @author: lying
     * @time: 2019-02-25 14:03:54
     */
    private String createName;

    /**
     * record_sales_details.user_id (下单用户id)
     * @author: lying
     * @time: 2019-02-25 14:03:54
     */
    private String userId;

    /**
     * record_sales_details.express_code (快递单号)
     * @author: lying
     * @time: 2019-02-25 14:03:54
     */
    private String expressCode;

    /**
     * record_sales_details.supplier_id (供应商id)
     * @author: lying
     * @time: 2019-02-25 14:03:54
     */
    private String supplierId;

    /**
     * record_sales_details.warehouse_id (仓库id)
     * @author: lying
     * @time: 2019-02-25 14:03:54
     */
    private String warehouseId;

    /**
     * record_sales_details.special_id (专场id)
     * @author: lying
     * @time: 2019-02-25 14:03:54
     */
    private String specialId;
    
    /**
     * record_sales_details.gb_code (国际编码)
     * @author: lying
     * @time: 2019-04-22 10:52:48
     */
    private String gbCode;
    
    /**
     * record_sales_details.source_type (1:小蚁买手2：小蚁货仓)
     * @author: lying
     * @time: 2019-05-20 11:28:19
     */
    private Integer sourceType;

    /**
     * record_sales_details.rebate_money (上级佣金)
     * @author: lying
     * @time: 2019-05-20 11:28:19
     */
    private BigDecimal rebateMoney;

    /**
     * record_sales_details.vip_rebate_money (上级绩效)
     * @author: lying
     * @time: 2019-05-20 11:28:19
     */
    private BigDecimal vipRebateMoney;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDetailId() {
        return detailId;
    }

    public void setDetailId(String detailId) {
        this.detailId = detailId;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getDealCode() {
        return dealCode;
    }

    public void setDealCode(String dealCode) {
        this.dealCode = dealCode;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public String getPayCode() {
        return payCode;
    }

    public void setPayCode(String payCode) {
        this.payCode = payCode;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public Integer getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(Integer orderSource) {
        this.orderSource = orderSource;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public Integer getDeliverType() {
        return deliverType;
    }

    public void setDeliverType(Integer deliverType) {
        this.deliverType = deliverType;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getSpecialCode() {
        return specialCode;
    }

    public void setSpecialCode(String specialCode) {
        this.specialCode = specialCode;
    }

    public String getSpecialName() {
        return specialName;
    }

    public void setSpecialName(String specialName) {
        this.specialName = specialName;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getGoodsSpec() {
        return goodsSpec;
    }

    public void setGoodsSpec(String goodsSpec) {
        this.goodsSpec = goodsSpec;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public BigDecimal getGoodsWeight() {
        return goodsWeight;
    }

    public void setGoodsWeight(BigDecimal goodsWeight) {
        this.goodsWeight = goodsWeight;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public BigDecimal getGold() {
        return gold;
    }

    public void setGold(BigDecimal gold) {
        this.gold = gold;
    }

    public BigDecimal getCommission() {
        return commission;
    }

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    public BigDecimal getRebate() {
        return rebate;
    }

    public void setRebate(BigDecimal rebate) {
        this.rebate = rebate;
    }

    public BigDecimal getCoupon() {
        return coupon;
    }

    public void setCoupon(BigDecimal coupon) {
        this.coupon = coupon;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    public BigDecimal getGoodsMoney() {
        return goodsMoney;
    }

    public void setGoodsMoney(BigDecimal goodsMoney) {
        this.goodsMoney = goodsMoney;
    }

    public BigDecimal getCostAmount() {
        return costAmount;
    }

    public void setCostAmount(BigDecimal costAmount) {
        this.costAmount = costAmount;
    }

    public BigDecimal getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
    }

    public BigDecimal getIncomeMoney() {
        return incomeMoney;
    }

    public void setIncomeMoney(BigDecimal incomeMoney) {
        this.incomeMoney = incomeMoney;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getExpressCode() {
        return expressCode;
    }

    public void setExpressCode(String expressCode) {
        this.expressCode = expressCode;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getSpecialId() {
        return specialId;
    }

    public void setSpecialId(String specialId) {
        this.specialId = specialId;
    }

	public String getGbCode() {
		return gbCode;
	}

	public void setGbCode(String gbCode) {
		this.gbCode = gbCode;
	}

	public Integer getSourceType() {
		return sourceType;
	}

	public void setSourceType(Integer sourceType) {
		this.sourceType = sourceType;
	}

	public BigDecimal getRebateMoney() {
		return rebateMoney;
	}

	public void setRebateMoney(BigDecimal rebateMoney) {
		this.rebateMoney = rebateMoney;
	}

	public BigDecimal getVipRebateMoney() {
		return vipRebateMoney;
	}

	public void setVipRebateMoney(BigDecimal vipRebateMoney) {
		this.vipRebateMoney = vipRebateMoney;
	}
    
    
}