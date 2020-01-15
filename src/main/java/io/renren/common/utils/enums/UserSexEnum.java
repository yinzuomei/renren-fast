package io.renren.common.utils.enums;

/**
 * @Description TODO
 * @Author yinzuomei
 * @Date 2019/11/20 16:39
 */
public enum UserSexEnum {
	/**
	 * 男
	 */
	MALE("1"),

	/**
	 * 女
	 */
	FEMALE("0");

	private String sex;

	UserSexEnum(String sex) {
		this.sex = sex;
	}

	public String sex() {
		return sex;
	}
}
