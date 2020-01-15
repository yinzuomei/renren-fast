package io.renren.modules.sys.controller;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.io.Serializable;

/**
 * @Description TODO
 * @Author yinzuomei
 * @Date 2019/12/29 16:26
 */
//@XmlRootElement(name="user")
@JacksonXmlRootElement(localName = "User")
public class User implements Serializable {
	private static final long serialVersionUID = -2428541358571443807L;

	private String id;

	private String name;

	@JacksonXmlProperty(localName = "id")
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}

	@JacksonXmlProperty(localName = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "TestDTO{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				'}';
	}
}
