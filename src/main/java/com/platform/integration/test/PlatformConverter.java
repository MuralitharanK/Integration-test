/**
 * Copyright (C) Altimetrik 2016. All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Altimetrik. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms and conditions
 * entered into with Altimetrik.
 */

package com.platform.integration.test;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Set;

import org.neo4j.ogm.json.ObjectMapperFactory;
import org.neo4j.ogm.typeconversion.AttributeConverter;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;
import org.springframework.core.convert.converter.GenericConverter;

/**
 * @author - Muralitharan K
 * @param <S>
 * @param <R>
 *
 */
public abstract class PlatformConverter<S, T> implements GenericConverter {

	private Class<S> classOfS;
	private Class<T> classOfT;
	
	@SuppressWarnings("unchecked")
	protected PlatformConverter() {
        Type typeA = ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        Type typeB = ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
        this.classOfS = (Class<S>) typeA;
        this.classOfT = (Class<T>) typeB;
    }
	/* (non-Javadoc)
	 * @see org.springframework.core.convert.converter.GenericConverter#getConvertibleTypes()
	 */
	@Override
	public Set<ConvertiblePair> getConvertibleTypes() {
		Set<ConvertiblePair> convertiblePairs = new HashSet<>();
        convertiblePairs.add(new ConvertiblePair(classOfS, classOfT));
        return convertiblePairs;
	}

    public T convert(Object source, TypeDescriptor sourceType, TypeDescriptor targetType) {
    	return this.convert((S) source);
    }

	protected abstract T convert(S source);

    //protected abstract S convertBack(T target);
}
