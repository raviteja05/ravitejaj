package com.krypton.beans.cms.components;

import java.util.List;

public class Navigation {
	
	private String label;
	private String id;
	private String href;
	private List<Navigation> subNavigation;
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public List<Navigation> getSubNavigation() {
		return subNavigation;
	}
	public void setSubNavigation(List<Navigation> subNavigation) {
		this.subNavigation = subNavigation;
	}
	

}
