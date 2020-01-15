package io.renren.common.utils.enums;

/**
 * @Auther: yinzuomei
 * @Date: 2019/11/20 16:51
 * @Description: 常用开关枚举：0否；1是 删除标识  0：未删除    1：删除
 */
public enum YesOrNoEnum {
	/**
	 * 是
	 */
	YES("1"),
	/**
	 * 否
	 */
	NO("0");

	private String value;

	YesOrNoEnum(String value) {
		this.value = value;
	}

	public String value() {
		return this.value;
	}
}
