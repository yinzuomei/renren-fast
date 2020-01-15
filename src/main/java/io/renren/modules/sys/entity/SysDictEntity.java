package io.renren.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 数据字典
 *
 * @author yinzuomei
 * @email 576302893@qq.com
 * @date 2019-11-17 20:57:51
 */
@Data
@TableName("sys_dict")
public class SysDictEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 上级ID，一级为0
	 */
	private Long pid;
	/**
	 * 字典类型
	 */
	private String dictType;
	/**
	 * 字典名称
	 */
	private String dictName;
	/**
	 * 字典值
	 */
	private String dictValue;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 排序
	 */
	private Integer sort;
	/**
	 * 删除标识  0：未删除    1：删除
	 */
	private Integer delFlag;
	/**
	 * 创建者
	 */
	private Long creator;
	/**
	 * 创建时间
	 */
	private Date createDate;
	/**
	 * 更新者
	 */
	private Long updater;
	/**
	 * 更新时间
	 */
	private Date updateDate;

}
