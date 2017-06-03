/**
 * Copyright (C) Altimetrik 2016. All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Altimetrik. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms and conditions
 * entered into with Altimetrik.
 */

package com.platform.api.gl;

import com.platform.util.exception.PlatformSystemException;

/**
 * @author - Muralitharan K
 *
 */
public class GLException extends PlatformSystemException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2086187987607308584L;

	/**
	 * Constructor with message argument.
	 * @param errorCode - error message
	 * @param errorArgs - the arguments to be used to replace values within the message.
	 */
	public GLException(String errorCode, Object...errorArgs) {
		super(errorCode, errorArgs);
	}

	/**
	 * Constructor with message and exception arguments.
	 * @param errorCode - error message.
	 * @param cause - instance of any exception.
	 * @param errorArgs - the arguments to be used to replace values within the message.
	 */
	public GLException(String errorCode, Throwable cause, Object...errorArgs) {
		super(errorCode, cause, errorArgs);
	}
}
