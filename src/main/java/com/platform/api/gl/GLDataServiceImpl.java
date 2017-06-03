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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.platform.bom.gl.GeneralLedger;
import com.platform.util.logging.PlatformLogger;
import com.platform.validation.exception.ValidationException;

/**
 * @author - Muralitharan K
 *
 */
@Component("glDataService")
public class GLDataServiceImpl implements GLDataService {

	//private static final String GL_CODE_PATTERN_MISMATCH = "GL Code: {0} does not match with the pattern.";
	//private static Pattern glCodePattern = Pattern.compile("[a-zA-Z_0-9]*");
	private static PlatformLogger logger = PlatformLogger.getLogger(GLDataServiceImpl.class);

	@Autowired
	GLRepository glRepository;

	/* (non-Javadoc)
	 * @see com.platform.service.gl.GLDataService#createGL(com.platform.bom.gl.GLData)
	 */
	@Override
	public GeneralLedger createGL(GeneralLedger glData) throws GLException {
		try {
			
			return glRepository.save(glData);
		}
		catch (ValidationException ex) {
			logger.error("Error occured while creating GL.", ex);
			ex.getValidationErrors();
			throw new GLException("Error occured while creating GL.", ex);
		}
		catch (Exception ex) {
			logger.error("Error occured while creating GL.", ex);
			throw new GLException("Error occured while creating GL.", ex);
		}
	}

	/* (non-Javadoc)
	 * @see com.platform.service.gl.GLDataService#updateGL(com.platform.bom.gl.GLData)
	 */
	@Override
	public GeneralLedger updateGL(GeneralLedger glData) throws GLException {
		try {
			return glRepository.save(glData);
		}
		catch (Exception ex) {
			logger.error("Error occured while updating GL.", ex);
			throw new GLException("Error occured while updating GL.", ex);
		}
	}

	/* (non-Javadoc)
	 * @see com.platform.service.gl.GLDataService#deleteGL(java.lang.String)
	 */
	@Override
	public void deleteGL(Long id) throws GLException {
		glRepository.delete(id);
	}

	/* (non-Javadoc)
	 * @see com.platform.service.gl.GLDataService#getGLListByType(java.lang.String)
	 */
	@Override
	public List<GeneralLedger> getGLListByTypeAndTenantId(String head, String tenentId) throws GLException {
		return glRepository.findByHeadAndTenantId(head, tenentId);
	}

	/* (non-Javadoc)
	 * @see com.platform.service.gl.GLDataService#getGLListByCode(java.lang.String)
	 */
	@Override
	public GeneralLedger getGLCode(Long id) throws GLException {
		return glRepository.findOne(id);
	}

}
