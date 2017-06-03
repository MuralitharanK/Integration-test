/**
 * 
 */
package com.platform.util.exception;

/**
 * @author Mkrishnamoorthy
 *
 */
public class EntitySystemException extends PlatformSystemException {

	private static final long serialVersionUID = -7050143783827865564L;

	public EntitySystemException(String message) {
		super(message);
	}

	public EntitySystemException(String message, Throwable cause, Object...args) {
		super(message, cause, args);
	}
}
