package com.krypton.beans.cms.data;

import java.util.HashMap;
import java.util.Map;

public class Data<T> {
	private T data;
	private Map<String,String> labels=new HashMap<>();
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Map<String, String> getLabels() {
		return labels;
	}
	public void setLabels(Map<String, String> labels) {
		this.labels = labels;
	}
	
}
