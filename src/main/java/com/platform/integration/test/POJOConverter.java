/**
 * Copyright (C) Altimetrik 2016. All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Altimetrik. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms and conditions
 * entered into with Altimetrik.
 */

package com.platform.integration.test;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author - Muralitharan K
 * @param <T>
 *
 */
public class POJOConverter<T> extends PlatformConverter<String, T> {

//	@Autowired
//	ElasticsearchRepository<T, Serializable> elasticsearchRepository;
//	
//	@Autowired
//	ElasticsearchTemplate elasticsearchTemplate;
//	
//	
	private final Class<T> clazz;
	
	public POJOConverter(Class<T> clazz) {
        super();
        this.clazz = clazz;
    }
	/* (non-Javadoc)
	 * @see com.platform.integration.test.PlatformConverter#convert(java.lang.Object)
	 */
	@Override
	public T convert(String source) {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.convertValue(source, clazz);
	}
}
