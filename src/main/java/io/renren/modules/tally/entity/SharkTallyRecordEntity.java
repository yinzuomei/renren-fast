package io.renren.modules.tally.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 账目表
 *
 * @author yinzuomei
 * @email 576302893@qq.com
 * @date 2019-11-25 19:55:50
 */
@Data
@TableName("shark_tally_record")
public class SharkTallyRecordEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private String id;
	/**
	 * 记账类型
	 */
	private String accountType;
	/**
	 * 记账类别
	 */
	private String type;
	/**
	 * 金额
	 */
	private BigDecimal amount;
	/**
	 * 消费时间
	 */
	private Date chargeDate;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 乐观锁
	 */
	private Integer revision;
	/**
	 * 创建人
	 */
	private String createdBy;
	/**
	 * 创建时间
	 */
	private Date createdTime;
	/**
	 * 更新人
	 */
	private String updatedBy;
	/**
	 * 更新时间
	 */
	private Date updatedTime;

}
