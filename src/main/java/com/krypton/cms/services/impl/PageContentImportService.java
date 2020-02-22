package com.krypton.cms.services.impl;

import java.io.IOException;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.krypton.beans.cms.Page;
import com.krypton.cms.services.ImportService;
@Service
public class PageContentImportService implements ImportService<Page> {

	@Override
	public Page processData(String path) {
		ObjectMapper mapper=new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		ObjectReader reader=mapper.readerFor(Page.class).withoutAttribute("components");
		Page page=null;
		
		try {
			page=reader.readValue(new ClassPathResource(path).getFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return page;
		
	}



	
	
	

}
