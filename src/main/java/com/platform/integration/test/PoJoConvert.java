/**
 * Copyright (C) Altimetrik 2016. All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Altimetrik. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms and conditions
 * entered into with Altimetrik.
 */

package com.platform.integration.test;

import org.neo4j.ogm.json.ObjectMapperFactory;
import org.neo4j.ogm.typeconversion.AttributeConverter;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;

/**
 * @author - Muralitharan K
 * @param <T>
 *
 */
public class PoJoConvert<T> implements AttributeConverter<String, T> {

	private Class<T> clazz;

	public PoJoConvert(Class<T> clazz) {
		this.clazz = clazz;
	}
	/* (non-Javadoc)
	 * @see org.neo4j.ogm.typeconversion.AttributeConverter#toGraphProperty(java.lang.Object)
	 */
	@Override
	public T toGraphProperty(String value) {
		return ObjectMapperFactory.objectMapper().convertValue(value, clazz);
	}

	/* (non-Javadoc)
	 * @see org.neo4j.ogm.typeconversion.AttributeConverter#toEntityAttribute(java.lang.Object)
	 */
	@Override
	public String toEntityAttribute(T value) {
		return null;
	}

}
