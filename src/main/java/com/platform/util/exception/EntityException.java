package com.platform.util.exception;

import java.util.Locale;

import com.platform.util.exception.PlatformApplicationException;
import com.platform.util.logging.PlatformLogger;

/**
 * @author Mkrishnamoorthy
 *
 */
public class EntityException extends PlatformApplicationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	PlatformLogger logger = PlatformLogger.getLogger(EntityException.class);
	
	public EntityException() {
		super(PlatformErrorConstant.APPLICATION_ERROR);
		logger.info(PlatformErrorConstant.APPLICATION_ERROR);
	}

	public EntityException(String message) {
		super(message);
		logger.debug(message);
	}

	public EntityException(String message, Throwable cause, Object...args) {
		super(message, cause, args);
		logger.debug(message, cause);
	}

	@Override
	protected String getLocalizedMessage(String errorCode, Locale locale, Object... args) {
		//I18N resource call to get translated message for the given error code.
		return com.platform.util.i18n.PlatformResource.getTranslatedText(errorCode, args, locale);
	}
}
