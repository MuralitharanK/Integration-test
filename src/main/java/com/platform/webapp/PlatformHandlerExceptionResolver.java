/**
 * 
 */
package com.platform.webapp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.DefaultHandlerExceptionResolver;

import com.platform.util.exception.PlatformApplicationException;
import com.platform.util.exception.PlatformFatalException;
import com.platform.util.exception.PlatformSystemException;
import com.platform.util.i18n.PlatformResource;
import com.platform.util.logging.PlatformLogger;

/**
 * 
 * @author Mkrishnamoorthy
 *
 */
public class PlatformHandlerExceptionResolver extends DefaultHandlerExceptionResolver implements ApplicationContextAware {

	private ApplicationContext applicationContext;
	private PlatformLogger logger = PlatformLogger.getLogger(PlatformHandlerExceptionResolver.class);
	/* (non-Javadoc)
	 * @see org.springframework.context.ApplicationContextAware#setApplicationContext(org.springframework.context.ApplicationContext)
	 */
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	@Override
	protected ModelAndView doResolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
		logger.info("Method call : PlatformHandlerExceptionResolver class, doResolveException");
		ModelAndView modelAndView = super.doResolveException(request, response, handler, ex);
		if (ex instanceof PlatformApplicationException) {
			PlatformApplicationException appException = (PlatformApplicationException)ex;
			logger.error("A platform application exception thrown.", appException);
			// need exception message arguments and locale.
			//PlatformResource.getTranslatedText(appException.getUserMessage(), args, locale);
		} else if (ex instanceof PlatformSystemException) {
			PlatformSystemException sysException = (PlatformSystemException)ex;
			logger.error("A platform system exception thrown.", sysException);
		} else if (ex instanceof PlatformFatalException) {
			PlatformFatalException fatalException = (PlatformFatalException)ex;
			logger.error("A platform fatal exception thrown.", fatalException);
		} else {
			logger.error("An exception thrown from controller.", ex);
			modelAndView = handleUnknownException(modelAndView, ex);
		}
		return modelAndView;
	}

	private ModelAndView handleUnknownException(ModelAndView modelAndView, Exception ex) {
		// TBD what kind of exception message to send.
		return modelAndView;
	}
}
