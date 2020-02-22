package com.krypton.beans.cms;

import java.util.List;

public class Section {
	private String id;
	private List<Component> components;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<Component> getComponents() {
		return components;
	}
	public void setComponents(List<Component> components) {
		this.components = components;
	}
	

}
