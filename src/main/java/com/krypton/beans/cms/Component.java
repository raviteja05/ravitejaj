package com.krypton.beans.cms;

import com.krypton.beans.cms.data.Data;

public class Component<T> {
	private String id;
	private String name;
	private String componentType;
	private String path;
	private Data<T> componentData;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getComponentType() {
		return componentType;
	}
	public void setComponentType(String componentType) {
		this.componentType = componentType;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public Data<T> getComponentData() {
		return componentData;
	}
	public void setComponentData(Data<T> data) {
		this.componentData = data;
	}
	
	

}
