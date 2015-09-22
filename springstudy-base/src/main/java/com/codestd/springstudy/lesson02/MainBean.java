package com.codestd.springstudy.lesson02;

import java.util.List;
import java.util.Map;

public class MainBean {

	private String str;
	private Map<String,String> map; 
	private List<String> list;
	
	private EnumerationType enumType;
	
	//@Resource
	//@Autowired(required=false)
	private SubBean subBean;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public EnumerationType getEnumType() {
		return enumType;
	}

	public void setEnumType(EnumerationType enumType) {
		this.enumType = enumType;
	}
	
	public void setSubBean(SubBean subBean) {
		this.subBean = subBean;
	}

	public void print(){
		System.out.println("str:"+this.str);
		System.out.println("map:"+this.map);
		System.out.println("list:"+this.list);
		System.out.println("enumType:"+this.enumType);
		System.out.println("subBean:"+this.subBean);
	}
}
