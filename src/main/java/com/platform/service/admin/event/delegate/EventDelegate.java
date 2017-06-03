/**
 * Copyright (C) Altimetrik 2016. All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Altimetrik. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms and conditions
 * entered into with Altimetrik.
 */

package com.platform.service.admin.event.delegate;

/**
 * @author - Muralitharan K
 *
 */
public interface EventDelegate<T> {

	void validate(T businessEntity);
	void preProcess(T businessEntity);
	void process(T businessEntity);
	void postProcess(T businessEntity);
}
