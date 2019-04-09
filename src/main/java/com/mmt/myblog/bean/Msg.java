package com.mmt.myblog.bean;

import java.util.HashMap;
import java.util.Map;

public class Msg {
	int code;
	String msg;
	Map<String,Object> map = new HashMap<String,Object>();
	public Msg success(){
		Msg m = new Msg();
		m.code = 100;
		m.msg = "success";
		return m;
	}
	public Msg fail(){
		Msg m = new Msg();
		m.code = 200;
		m.msg = "fail";
		return m;
	}
	public Msg add(String key,Object val){
		this.map.put(key, val);
		return this;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Map<String, Object> getMap() {
		return map;
	}
	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	
}
