/**
 * Copyright (C) Altimetrik 2016. All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Altimetrik. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms and conditions
 * entered into with Altimetrik.
 */

package com.platform.api.gl;

import java.util.List;

import com.platform.bom.gl.GeneralLedger;

/**
 * @author - Muralitharan K
 *
 */
public interface GLDataService {
	/**
	 * 
	 * @param glData
	 * @return
	 * @throws GLException
	 */
	GeneralLedger createGL(GeneralLedger glData) throws GLException;
	/**
	 * 
	 * @param glData
	 * @return
	 * @throws GLException
	 */
	GeneralLedger updateGL(GeneralLedger glData) throws GLException;
	
	/**
	 * 
	 * @param id
	 * @throws GLException
	 */
	void deleteGL(Long id) throws GLException;
	
	List<GeneralLedger> getGLListByTypeAndTenantId(String type, String tenantId) throws GLException;
	
	GeneralLedger getGLCode(Long id) throws GLException;
}
