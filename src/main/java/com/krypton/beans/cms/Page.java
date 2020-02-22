package com.krypton.beans.cms;

import java.util.List;

public class Page {
	
	private List<Section> sections;
	private String id;
	public List<Section> getSections() {
		return sections;
	}
	public void setSections(List<Section> sections) {
		this.sections = sections;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	

}
