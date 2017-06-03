/**
 * 
 */
package com.platform.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.platform.util.exception.EntityException;
import com.platform.util.exception.EntitySystemException;
import com.platform.util.exception.PlatformApplicationException;
import com.platform.util.exception.PlatformSystemException;
import com.platform.util.i18n.PlatformResource;

/**
 * @author Mkrishnamoorthy
 *
 */
@Controller
public class EntityController {

	@RequestMapping(value = "entity/createNewEntity.do", method = RequestMethod.POST)
	@ResponseBody
	public Object createNewEntityUIDetails(
			HttpServletRequest request,
			Model model,
			@Validated Entity entity,
			BindingResult entityBindingResult)
			throws BindException {

		if (entityBindingResult.hasErrors()) {
			System.out.println(entityBindingResult.getAllErrors().toString());
			throw new BindException(entityBindingResult);
		}
		ModelMap map = new ModelMap();
		try {
			//make service call for any operations.
			throw new EntityException("general.error", null);
		} catch (PlatformApplicationException ex) {
			PlatformResource.getTranslatedText(ex.getUserMessage(), null, Locale.ENGLISH);
			try {
				throw ex;
			} catch (PlatformApplicationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception ex) {
			throw new EntitySystemException("service.failed", ex);
		}
		return map;
	}
}
