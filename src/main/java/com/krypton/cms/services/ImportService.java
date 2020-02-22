package com.krypton.cms.services;

public interface ImportService<T> {

	T processData(String file);
}
