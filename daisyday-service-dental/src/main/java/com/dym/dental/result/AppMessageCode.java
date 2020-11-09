package com.dym.dental.result;


import java.util.HashMap;
import java.util.Map;


/**
 * app操作错误码
 * @author zhouao
 *
 */
public final class AppMessageCode {
	 
	/**
	 * 错误码集合
	 */
	private final static Map<Integer, String> ERROR_CODES = new HashMap<Integer, String>() {
		 
		private static final long serialVersionUID = -4650601400739626355L;
		
		{
            put(200,"success");
            
            //错误信息状态码
            put(401,"用户身份认证失败"); 
            put(403,"没有权限访问");
            put(401001,"用户名或密码错误"); 
            put(401002,"用户不存在或已终止协议的用户"); 
            put(401003,"密码错误");
            put(401004,"密码不符合要求");
            put(401005,"未注册的用户");
            put(401006,"已存在的昵称");
            put(401007,"已注册的用户");
            put(401008,"请求方法错误");

            put(40001,"appSecret error");
            put(40002,"ip address is not binding");
            put(40003,"appId error");
            put(40004,"appId is null");
            put(40005,"sign error");
            put(40006,"appSecret is null");
            put(40007,"timeStamp is null");
            put(40008,"apiName is null");
            put(40009,"sign is null");
            put(400010,"request timeout");
            put(400011,"参数不能为空");
            put(400012,"操作失败");
            put(400013,"json格式错误"); 
            put(400014,"账号为空"); 
            put(400015,"已禁用的账户"); 
            put(400016,"未知错误"); 
            put(400017,"认证次数超过限制"); 
            put(400018,"非法参数"); 
            put(400019,"验证码过期");
            put(400020,"验证码错误");
            put(400021,"密码不一致");
            put(400022,"修改密码已经达到上限");
            put(400023,"角色名称已经存在");
            put(400024,"该用户已经绑定该角色");
            put(400025,"该角色不存在或者禁用");
            put(400026,"参数错误");
            put(400027,"注册失败");
            put(400028,"电话号码格式不正确");
            put(400029,"验证码超时，请重新发送验证码");
            put(400030,"验证码错误");
            put(400031,"邀请码输入有误");
            put(400032,"邀请码已被使用");
            put(400033,"地址不存在");
            put(400034,"会员id不存在");
            put(400035,"手机号码格式不正确");
            put(400036,"该订单已发过红包");
            put(400037,"红包已领完");
            put(400038,"该用户已领过此红包");
            put(400039,"订单编号不存在");
            put(400040, "库存不足");
            put(400041, "购物车数据异常");
            put(400042, "红包已过期");
            put(400043, "红包不存在");
            put(400044, "登录失败，请重新登录");
            put(400045, " id输入有误或不存在");
            put(400046, "非法unionid");
            put(400047, "红包编码错误");
            put(400048, "参数错误");
            put(400049, "红包领取达到上限");
            put(400050, "不能反向锁粉");
            put(400051, "购物车商品信息异常");
            put(400052, "仓库信息异常");
            put(400053, "仓库运费信息异常");
            put(400054, "不是运营商 没有绩效");
            put(400055, "结算订单异常，请稍后重试");
            put(400056, "提交订单异常，请稍后重试");
            put(400057, "请先新增收货地址");
            put(400058, "收货地址异常");
            put(400059, "金币异常，请稍后重试");
            put(400060, "用户账户金币异常，请稍后重试");
            put(400061, "系统金币管理规则异常，请稍后重试");
            put(400062, "您已经绑定了手机号码，无需再次绑定"); 
            put(400063, "您已经绑定了微信，无需再次绑定");
            put(400064, "该手机号码已经绑定其他用户，无法重复绑定");
            put(400065, "微信已经绑定其他用户，无法重复绑定");
            put(400066, "参数错误");
            put(400067, "订单商品id错误");
            put(400068, "专场已下架或已结束");
            put(400069, "专场主题名称错误");
            put(400070, "专场编号");
            put(400071, "支付异常，请稍后重试");
            put(400072, "支付渠道异常");
            put(400073, "订单支付异常");
            put(400074, "订单信息异常");
            put(400075, "订单id错误");
        	put(400076, "推送异常");
        	put(400077, "不符合锁粉条件");
        	put(400078, "撤销订单失败");
        	put(400079, "订单商品异常");
        	put(400080, "立即购买异常");
        	put(400081, "确认收货失败");
        	put(400082, "更换尺码失败");
        	put(400083, "该订单商品已经评价");
        	put(400084, "支付订单已过期");
        	put(400085, "删除订单失败");
        	put(400086, "任务奖励已领取");
        	put(400087, "版本信息无数据");
        	put(400088, "申请售后异常，请稍后重试");
        	put(400089, "用户已发过新人红包");
        	put(400090, "订单运费信息异常");
        	put(400091, "申请售后失败，该商品已申请过售后");
        	put(400092, "寄回物流信息异常");
        	put(400093, "售后信息异常");
        	put(400094, "撤销申请异常");
        	put(400095, "任务未完成");
        	put(400096, "用户编码不存在");
        	put(400097, "不符合领取条件");
        	put(400098, "图片最多9张");
        	put(400099, "两位用户都已有上一级");
        	put(400100, "要绑定的粉丝已经有上一级");
        	put(400101, "要绑定的粉丝是用户的上一级");
        	put(400102, "输入金额超出可提现数");
        	put(400103, "提现账号id错误");
        	put(400104, "用户账号被冻结无法提现");
        	put(400105, "订单退款异常");
        	put(400106, "商品已下架");
        	put(400107, "红包通道已关闭");
        	put(400108, "今日已签");
        	put(400109, "提现金额低于最低提现额度");
        	put(400110, "开票类型输入有误");
        	put(400111, "邮箱格式不正确");
        	put(400112, "idList输入有误");
        	put(400113, "认证待审核");
        	put(400114, "认证已通过");
        	put(400115, "提现异常");
        	put(400116, "用户佣金异常");
        	put(400117, "无对应品牌");
        	put(400118, "用户绩效异常");
        	put(400119, "该专场已成功预约过啦");
        	put(400120, "今天已经点击过啦");
        	put(400121, "时间不在活动范围内呦~");
        	put(400122, "支付金额不满199不能参与抽奖哦");
        	put(400123, "已获取过抽奖号码了");
        	put(400124, "活动运费信息异常");
        	put(400125, "红包个数超过规定人数");
        	put(400126, "暂无可激活的优惠券");
        	put(400127, "优惠券信息异常");
        	put(400128, "卡号与激活码不匹配，请重新输入");
        	put(400129, "该券已激活过，请勿重复提交");
        	put(400130, " 该用户已经抽过奖");
        	put(400131, "助力人数已满");
        	put(400132, "该用户已帮助过这位好友");
        	put(400133, "每日最多可助力三位好友哦~");
        	put(400134, " 用户不能给自己助力");
        	put(400135, " 还有未完成的分享哦");
        	put(400136, " 先去领取奖励吧");
        	put(400137, "优惠券暂未开启，无法激活");
        	put(400138, "金币数额异常");
        	put(400139, "活动未开始");
        	put(400140, "活动已结束");
        	put(400141, "该次时间段已领取红包雨金币");
        	put(400142, "时间参数异常");
        	put(400143, "已设置提醒，请勿重复开抢提醒");
        	put(400144, "请绑定微信或者手机号码");
        	put(400145, "手机号码账号异常");
        	put(400146, "您没有删除该热播素材权限");
        	put(400147, "成员已有团");
        	put(400148, "非一级代购");
        	put(400149, "用户未创建团");
        	put(400150, "充值异常，请稍后重试");
        	put(400151, "团队id错误");
        	put(400152, "资料图片格式错误");
        	put(400153, "已提交过资料");
        	put(400154, "不符合申请条件");
        	put(400155, "该团员当月拿货额未达￥6000");
        	put(400156, "该商品已收藏");
        	put(400157, "收货人名字不能包含特殊字段");
        	put(400158, "预定失败");
        	put(400159, "预定订单商品信息异常");
        	put(400160, "企业付款失败");
        	put(400161, "退款金额异常");
        	put(400162, "认证失败，请输入正确的姓名和身份证号码");
			put(400163, "身份证格式不符");
			put(400164, "黄金会员购买失败，请稍后重试");
			put(400165, "本专场商品限购，您已达上限");
			put(400166, "请求次数过多");
			put(400167, "参数不能为空");
			put(400168, "您有订单未拉取,请拉取全部订单!");
			put(400169, "订单更新中暂不可同步库存,请稍后重试");
			put(400170, "请先拉取所有订单再进行库存同步");
			put(400172, "订单待支付");
			put(400173, "订单已取消");

            //服务器内部错误
            put(500,"服务器提出了一个问题,我们正在处理");
            put(500001,"服务器太忙了,请稍后重试");
            put(500002,"接口调用超时,请稍后重试");
		}
	};
	/**
	 * 获取错误信息
	 * @param code
	 * @return
	 */
	public final static String ErrorInfo(int code){
		return ERROR_CODES.get(code);
	}
	
	 

	/**
	 * 请求成功
	 */
	public final static int SUCCESS =200;
	
	
	/**
	 * 用户身份认证失败
	 */
	public final static int USER_AUTH_UNAUTH= 401;
	
	/**
	 * 用户没有权限
	 */
	public final static int NO_AUTH= 403;
	
	
	/**
	 * 服务器内部错误
	 */
	public final static int SERVER_ERROR = 500;

	/**
	 * 服务器内部错误
	 */
	public final static int SERVER_BAISY = 500001;
	/**
	 * 接口调用超时,请稍候重试
	 */
	public final static int SERVER_TIMEOUT = 500002;

	/**
	 * 用户名或密码错误
	 */
	public final static int INVALID_USER_OR_PWD =401001;
	
	
	/**
	 * 用户不存在或已终止协议的用户
	 */
	public final static int INVALID_USER =401002;
	
	
	/**
	 * 密码错误
	 */
	public final static int INVALID_PWD =401003;
	
	/**
	 * 密码不符合要求
	 */
	public final static int INVALIDATE_PWD = 401004;
	
	/**
	 * 未注册的用户
	 */
	public final static int UNEXISTS_USER = 401005;
	
	/**
	 * 已存在的昵称
	 */
	public final static int ALREADY_EXISTS_NAME = 401006;
	
	
	/**
	 * 已注册的用户
	 */
	public final static int ALREADY_EXISTS_USER =401007;
	/**
	 * 已注册的用户
	 */
	public final static int REQUEST_METH_ERROR =401008;
	
   


 

    /**
     * appSecret 秘钥有误
     */
    public static final int  SECRET_CODE = 40001;

    /**
     * ip 未绑定，请联系开发人员
     */
    public static final int  IP_CODE = 40002;

    /**
     * appId 有误
     */
    public static final int  APPID_CODE = 40003;

    /**
     * appId 为null
     */
    public static final int  APPID_NULL_CODE = 40004;

    /**
     * 签名
     */
    public static final int  SIGN_CODE = 40005;
    /**
     * appSecret 为null
     */
    public static final int  SECRET_NULL_CODE = 40006;
    /**
     * timeStamp 为null
     */
    public static final int   TIMESTAMP_NULL_CODE = 40007;
    /**
     * apiName 为null
     */
    public static final int  APINAME_NULL_CODE = 40008;
    /**
     * sign 为null
     */
    public static final int  SIGN_NULL_CODE = 40009;
    /**
     * TIMESTAMP 超时
     */
    public static final int  TIMESTAMP_CODE = 400010;
    /**
     * 参数不能为空
     */
    public final static int NOT_NULL =400011;
    /**
     * 操作失败
     */
    public static final int OPERATION_ERROR = 400012;
    /**
     * json格式错误
     */
    public final static int JSON_EROR =400013;
    /**
	 * 账号为空
	 */
	public static final int ACCOUNT_NULL = 400014;
	/**
	 * 已禁用的账户
	 */
	public final static int BAN_USER = 400015;
	/**
	 * 未知错误
	 */
	public final static int UNKNOWN_ERROR = 400016;
	/**
	 * 认证次数超过限制
	 */
	public final static int AURH_TIMES_OVER = 400017;
	/**
	 * 非法参数
	 */
	public final static int ILLEGAL_PARAM =400018;
	/**
	 * 验证码过期
	 */
	public final static int EXPIRED_CODE = 400019;
	/**
	 * 验证码错误
	 */
	public final static int INVALID_CODE = 400020;
 
	/**
	 * 密码不一致
	 */
	public final static int PWD_DIFFERENT= 400021;
	/**
	 * 修改密码已经达到上限
	 */
	public final static int MODIFY_PWD_TIMES_OVER= 400022;
	/**
	 * 角色名称已经存在
	 */
	public final static int R_NAME_EXIST = 400023;
	/**
	 * 该用户已经绑定该角色
	 */
	public final static int USER_BINDED_ROLE= 400024;
	/**
	 * 该角色不存在或者禁用
	 */
	public final static int USER__ROLE_ERROR= 400025;
	/**
	 * 参数错误
	 */
	public final static int ERROR_PARAM= 400026;
	/**
	 * 注册失败
	 */
	public final static int SIGN_IN_FAILURE= 400027;
	/**
	 * 电话号码格式不正确
	 */
	public final static int INVALID_TEL = 400028; 
	/**
	 *验证码超时，请重新发送验证码
	 */
	public final static int CODE_TIME_OUT = 400029; 
	/**
	 * 验证码错误
	 */
	public final static int CODE_TIME_ERROR = 400030; 
	/**
	 * 邀请码输入有误
	 */
	public final static int ERROE_INVITE_CODE = 400031; 
	/**
	 * 邀请码已被使用
	 */
	public final static int USED_INVITE_CODE = 400032; 
	/**
	 * 地址不存在
	 */
	public final static int ADDRESS_ERROR = 400033; 
	/**
	 * 会员id不存在
	 */
	public final static int USERID_ERROR = 400034; 
	/**
	 * 手机号码格式不正确
	 */
	public final static int USERPHONE_ERROR = 400035;
	/**
	 * 该订单已发过红包
	 */
	public final static int RED_ERROR = 400036;
	/**
	 * 红包已领完
	 */
	public final static int REDS_ERROR = 400037;
 
	/**
	 * 该用户已领过此红包
	 */
	public final static int REDC_ERROR = 400038;
	/**
	 * 订单编号不存在
	 */
	public final static int order_code = 400039;
	
	/**
	 * 库存不足
	 */
	public final static int STOCK_ERROR = 400040;
	
	/**
	 * 购物车数据异常
	 */
	public final static int SHOP_CART_ERROR = 400041;
	/**
	 * 红包已过期
	 */
	public final static int REDOVER_ERROR = 400042;
	/**
	 * 红包不存在
	 */
	public final static int REDNOT_ERROR = 400043;

	/**
	 * 登录失败，请重新登录
	 */
	public final static int LOGIN_ERROR = 400044;
	/**
	 * id输入有误或不存在
	 */
	public final static int IDNOT_ERROR = 400045;
	/**
	 * 非法unionid
	 */
	public final static int ERROR_UNIONID = 400046;
	/**
	 * 红包编码错误
	 */
	public final static int ERROR_CODERED= 400047;
	/**
	 * 参数错误
	 */
	public static final int ERROR = 400048;
	/**
	 * 红包领取达到上限
	 */
	public final static int ERROR_REDONLINE= 400049;

	
	/**
	 * 不能反向锁粉
	 */
	public final static int ERROR_FANS= 400050;
	
	/**
	 * 购物车商品信息异常
	 */
	public final static int CART_GOODS_ERROR= 400051;
	
	/**
	 * 仓库信息异常
	 */
	public final static int WAREHOUSE_ERROR= 400052;
	
	/**
	 * 仓库运费信息异常
	 */
	public final static int WAREHOUSE_FREIGHT_ERROR= 400053;
	
	/**
	 * 不是运营商 没有绩效
	 */
	public final static int ERROR_USERTYPE= 400054;
	
	/**
	 * 结算订单异常，请稍后重试
	 */
	public final static int ORDER_CONFIRM_ERROR = 400055;
	
	/**
	 * 提交订单异常，请稍后重试
	 */
	public final static int ORDER_SUBMIT_ERROR = 400056;
	
	/**
	 * 请先新增收货地址
	 */
	public final static int ADDRESS_NULL_ERROR = 400057;
	
	/**
	 * 收货地址异常
	 */
	public final static int ADDRESS_ID_ERROR = 400058;
	
	/**
	 * 金币异常，请稍后重试
	 */
	public final static int GOLD_ERROR = 400059;
	
	/**
	 * 用户账户金币异常，请稍后重试
	 */
	public final static int GOLD_ACCOUNT_ERROR = 400060;
	
	/**
	 * 系统金币管理规则异常，请稍后重试
	 */
	public final static int GOLD_SYSTEM_ERROR = 400061;
	
	
	/**
	 * 您已经绑定了手机号码，无需再次绑定
	 */
	public final static int USER_BIND_PHONE= 400062;
	/**
	 * 您已经绑定了微信，无需再次绑定
	 */
	public final static int USER_BIND_WX= 400063;
	/**
	 * 该手机号码已经绑定其他用户，无法重复绑定
	 */
	public final static int USER_PHONE_USED= 400064;
	/**
	 * 微信已经绑定其他用户，无法重复绑定
	 */
	public final static int USER_WX_USED= 400065;
	
	/**
	 * 参数错误
	 */
	public final static int PARAM_ERROR = 400066;
	/**
	 * 订单商品id错误
	 */
	public final static int GOODS_ERROR = 400067;
	/**
	 * 专场id错误
	 */
	public final static int SPECIALID_ERROR = 400068;
	/**
	 * 专场主题名称错误
	 */
	public final static int SPECIALID_NAME_ERROR = 400069;
	/**
	 * 专场编号
	 */
	public final static int SPECIALID_CODE_ERROR = 400070;
	
	/**
	 * 支付异常，请稍后重试
	 */
	public final static int PAY_ERROR = 400071;
	
	/**
	 * 支付渠道异常
	 */
	public final static int CHANNEL_ERROR = 400072;
	
	/**
	 * 订单支付异常
	 */
	public final static int ORDER_PAY_ERROR = 400073;
	
	/**
	 * 订单信息异常
	 */
	public final static int ORDER_ERROR = 400074;
	
	/**
	 * 订单id错误
	 */
	public final static int ORDER_ID_ERROR = 400075;
	
	/**
	 * 推送异常
	 */
	public final static int PUSH_ERROR = 400076;
	/**
	 *不符合锁粉条件
	 */
	public final static int FANS_ERROR = 400077;
	
	/**
	 * 撤销订单失败
	 */
	public final static int ORDER_REVOKE_ERROR = 400078;

	
	
	/**
	 * 订单商品异常
	 */
	public final static int ORDER_GOODS_ERROR = 400079;
	
	/**
	 * 立即购买异常
	 */
	public final static int BUY_NOW_ERROR = 400080;
	
	/**
	 * 确认收货失败
	 */
	public final static int ORDER_CONFIRM_RECEIPT = 400081;
	
	/**
	 * 更换尺码失败
	 */
	public final static int ORDER_CHANGE_SPEC = 400082;
	
	/**
	 *该订单商品已经评价
	 */
	public final static int EVALUATE_ERROR = 400083;
	
	/**
	 * 支付订单已过期
	 */
	public final static int PAY_TIME_EXPIRE = 400084;
	
	/**
	 * 删除订单失败
	 */
	public final static int ORDER_DELETE_ERROR = 400085;
	
	/**
	 * 任务奖励已领取
	 */
	public final static int TASK_ERROR = 400086;
	
	/**
	 * 版本信息无数据
	 */                         
	public final static int NOVERSION_ERROR= 400087;
	
	/**
	 * 申请售后异常，请稍后重试
	 */
	public final static int RETURN_APPLY_ERROR = 400088;
 
	/**
	 * 用户已发过新人红包
	 */                              
	public final static int NEW_RED_ERROR= 400089;
	
	/**
	 * 订单运费信息异常
	 */
	public final static int ORDER_FREIGHT_ERROR = 400090;
	
	/**
	 * 申请售后失败，该商品已申请过售后
	 */
	public final static int RETURN_APPLIED_REFUND = 400091;

	
	/**
	 * 寄回物流信息异常
	 */
	public final static int RETURN_SEND_BACK = 400092;
	
	/**
	 * 售后信息异常
	 */
	public final static int RETURN_INFO_ERROR = 400093;
	
	/**
	 * 撤销申请异常
	 */
	public final static int RETURN_REVOKE_ERROR = 400094;
	
	/**
	 * 任务未完成
	 */
	public final static int TASK_ERROR0 = 400095;
	
	/**
	 *用户编码不存在
	 */
	public final static int USER_CORD = 400096;
	
	/**
	 *不符合领取条件
	 */
	public final static int GIVE_STATUS = 400097;
	
	/**
	 *图片最多9张
	 */
	public final static int IMG_ERRPR = 400098;
	
	/**
	 *两位用户都已有上一级
	 */
	public final static int FANS_ERROR1 = 400099;
	
	/**
	 *要绑定的粉丝已经有上一级
	 */
	public final static int FANS_ERROR2 = 400100;
	
	/**
	 *要绑定的粉丝是用户的上一级
	 */
	public final static int FANS_ERROR3 = 400101;
	
	/**
	 *输入金额超出可提现数
	 */                       
	public final static int USABLE_GOLD = 400102;
	
	/**
	 *提现账号id错误
	 */                       
	public final static int CARD_ERROE = 400103;
	
	/**
	 *用户账号被冻结无法提现
	 */                       
	public final static int CASH_STATUS = 400104;
	
	/**
	 * 订单退款异常
	 */
	public final static int REFUND_ERROR = 400105;
	
	/**
	 * 商品已售空
	 */
	public final static int GOODSID_ERROR = 400106;
	
	/**
	 * 红包通道已关闭
	 */
	public final static int REDS_ERRORS = 400107;
	
	/**
	 * 今日已签
	 */
	public final static int SIGN = 400108;
	
	/**
	 *提现金额低于最低提现额度
	 */                       
	public final static int CASH_ERROR = 400109;
	
	/**
	 *开票类型输入有误
	 */                       
	public final static int INVOICE_TYPE_ERROR = 400110;
	
	/**
	 * 邮箱格式不正确
	 */
	public final static int EMAIL_ERROR = 400111;
	
	/**
	 * idList输入有误
	 */
	public final static int ID_ERROR = 400112;
	
	/**
	 * 认证待审核
	 */
	public final static int APPLYCARD_STATUS1 = 400113;
	
	/**
	 * 认证已通过
	 */
	public final static int APPLYCARD_STATUS2 = 400114;

	/**
	 * 提现异常
	 */
	public final static int WITHDRAWAL_ERROR = 400115;
	
	/**
	 * 用户佣金异常
	 */
	public final static int USER_BALANCE_ERROR = 400116;
	
	/**
	 * 无对应品牌
	 */
	public final static int BRAND_ERROR = 400117;
	
	/**
	 * 用户绩效异常
	 */
	public final static int USER_EARNINGS_ERROR = 400118;
	
	/**
	 * 该专场已成功预约过啦
	 */
	public final static int SPECIALMAKE_ERROR = 400119;
	
	/**
	 *今天已经点击过啦
	 */
	public final static int ACTIVIT_ERROR = 400120;
	
	/**
	 *活动截止啦
	 */
	public final static int ORDERPAYMENT_ERROR = 400121;
	
	/**
	 *支付金额不满199不能参与抽奖哦
	 */
	public final static int ACTIVITYPAYMENT_ERROR = 400122;
	
	/**
	 *已获取过抽奖号码了
	 */
	public final static int ACTIVITYNUMBER_ERROR = 400123;
	
	/**
	 * 活动运费信息异常
	 */
	public final static int ADVERTS_FREIGHT_ERROR= 400124;
	
	/**
	 * 红包个数超过规定人数
	 */                         
	public final static int RED_NUM_ERROR= 400125;
	
	/**
	 * 暂无可激活的优惠券
	 */                         
	public final static int COUPON_NULL_ERROR= 400126;
	
	/**
	 * 优惠券信息异常
	 */                         
	public final static int COUPON_INFO_ERROR= 400127;
	
	/**
	 * 卡号与激活码不匹配，请重新输入
	 */                         
	public final static int COUPON_ADD_ERROR= 400128;
	
	/**
	 * 该券已激活过，请勿重复提交
	 */                         
	public final static int COUPON_ACTIVATED_ERROR= 400129;
	
	/**
	 * 该用户已经抽过奖
	 */                         
	public final static int PRIZE_ERROR= 400130;
	
	/**
	 * 助力人数已满
	 */                         
	public final static int HELP_ERROR= 400131;
	
	/**
	 * 该用户已帮助过这位好友
	 */                         
	public final static int HELP_ERROR1= 400132;
	
	/**
	 * 每日最多可助力三位好友哦~
	 */                         
	public final static int HELP_ERROR2= 400133;
	
	/**
	 * 用户不能给自己助力
	 */                         
	public final static int HELP_ERROR3= 400134;
	
	/**
	 *1：还有未完成的分享哦
	 */                         
	public final static int FLOP_ERROR1= 400135;
	
	/**
	 * 2：先去领取奖励吧
	 */                         
	public final static int FLOP_ERROR2= 400136;
	
	/**
	 * 优惠券暂未开启，无法激活
	 */
	public final static int COUPON_STATUS_ERROR = 400137;
	
	/**
	 * 金币数额异常
	 */
	public final static int GOLD_ERROR200 = 400138;
	
	/**
	 * 活动未开始
	 */
	public final static int ACTIVITY_ERROR = 400139;
	
	/**
	 * 活动已结束
	 */
	public final static int ACTIVITY_ERROR2 = 400140;
	
	/**
	 * 该次时间段已领取红包雨金币
	 */
	public final static int ACTIVITY_ERROR3 = 400141;
	
	/**
	 * 时间参数异常
	 */
	public final static int ACTIVITY_ERROR4 = 400142;
	/**
	 * 已设置提醒，请勿重复开抢提醒
	 */
	public final static int MAKED_ERROR = 400143;
	/**
	 * 请绑定微信或者手机号码
	 */
	public final static int WX_PHONE_NOT_BRAND = 400144;
	/**
	 *put(400145, "手机号码账号异常");
	 */
	public final static int USER_ON_PHONE_ERROR = 400145;
	
	/**
	 *put(400146, "热播素材无权限");
	 */
	public final static int USER_ON_HITMATERIAL_ERROR = 400146;
	
	/**
	 * 成员已有团
	 */
	public final static int TEAM_ERROR = 400147;
	
	/**
	 * 非一级代购
	 */
	public final static int TEAM_ERROR2 = 400148;
	
	/**
	 * 用户未创建团
	 */
	public final static int GROUP_ERROR = 400149;
	
	/**
	 * 充值异常，请稍后重试
	 */
	public final static int RECHARGE_ERROR = 400150;
	
	/**
	 * 团队id错误
	 */
	public final static int TEAMID_ERROR = 400151;
	
	/**
	 *资料图片格式错误
	 */
	public final static int TEAMIDIMG_ERROR = 400152;
	
	/**
	 *已提交过资料
	 */
	public final static int TEAMIDDATE_ERROR = 400153;
	
	/**
	 *不符合申请条件
	 */
	public final static int TEAMLOG_ERROR = 400154;
	
	/**
	 *该团员当月拿货额未达￥6000
	 */
	public final static int SELL_ERROR = 400155;
	
	/**
	 * 该商品已收藏
	 */
	public final static int FAVORITES_ERROR = 400156;
	
	/**
	 * 收货人名字不能包含特殊字段
	 */
	public final static int ADDRESS_ERROR2 = 400157;
	
	/**
	 * 预定失败
	 */
	public final static int MAKE_ORDER_ERROR = 400158;
	
	/**
	 * 预定订单商品信息异常
	 */
	public final static int MAKE_ORDER_GOODS_ERROR = 400159;
	
	/**
	 * 企业付款失败
	 */
	public final static int TRANSFER_ERROR = 400160;
	
	/**
	 * 退款金额异常
	 */
	public final static int REFUND_AMOUNT_ERROR = 400161;

	/**
	 * 认证失败，请输入正确的姓名和身份证号码
	 */
	public final static int ID_CARD_ERROR = 400162;

	/**
	 * 身份证格式不符
	 */
	public final static int ID_CARD_FORMAT_ERROR = 400163;

	/**
	 * 黄金会员购买失败，请稍后重试
	 */
	public final static int VIP_BUY_ERROR = 400164;

	/**
	 * 本专场商品限购，您已达上限
	 */
	public final static int LIMIT_SPECIAL_ERROR = 400165;

	/**
	 * 请求接口次数达限
	 */
	public final static int REQUEST_ERROR = 400166;

	/**
	 * 请求接口次数达限
	 */
	public final static int OPEN_API_ORDER_CODE_ERROR = 400167;

	/**
	 * 请求接口次数达限
	 */
	public final static int OPEN_API_CHECK_ERROR = 400168;
	public final static int OPEN_API_STOCK_ERROR = 400169;
	public final static int OPEN_API_SYNCH_ERROR = 400170;

	/**
	 * 订单待支付
	 */
	public final static int PAY_UNPAY_ERROR = 400172;

	/**
	 * 订单已取消
	 */
	public final static int PAY_CANCEL_ERROR = 400173;


}
