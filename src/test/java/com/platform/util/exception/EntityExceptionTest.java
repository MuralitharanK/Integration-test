package com.platform.util.exception;


import static org.junit.Assert.assertEquals;

import java.io.InvalidClassException;
import java.util.Locale;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Mkrishnamoorthy
 *
 */
public class EntityExceptionTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void GeneralEntityExceptionEngMessage() {
		EntityException exception = new EntityException("general.error", null);
		System.out.println(exception.getMessage());
		assertEquals("This feature is not implemented.", exception.getLocalizedMessage(exception.getMessage(), 
				Locale.ENGLISH));
	}
	
	@Test
	public void GeneralEntityExceptionFrMessage() {
		EntityException exception = new EntityException("general.error", null);
		System.out.println(exception.getMessage());
		assertEquals("Cette fonctionnalité n'est pas implémentée.", 
				exception.getLocalizedMessage(exception.getMessage(), Locale.FRENCH));
	}
	
	@Test
	public void InvalidEntityException() {
		try {
			throw new InvalidClassException("Not Registered");
		} catch (Exception ex) {
			EntityException exception = new EntityException("invalid.entity", ex);
			System.out.println(exception.getMessage());
			assertEquals("Invalid User entity.", exception.getLocalizedMessage(exception.getMessage(), 
					Locale.ENGLISH, "User"));
		}
	}
	
	@Test
	public void InvalidEntityExceptionWithEngLocaleMsg() {
		try {
			throw new InvalidClassException("Not Registered");
		} catch (Exception ex) {
			EntityException exception = new EntityException("invalid.entity", ex);
			assertEquals("Invalid User entity.", exception.getLocalizedMessage(exception.getMessage(), 
					Locale.ENGLISH, "User"));
		}
	}

	@Test
	public void InvalidEntityExceptionWithFrLocaleMsg() {
		try {
			throw new InvalidClassException("Not Registered");
		} catch (Exception ex) {
			EntityException exception = new EntityException("invalid.entity", ex);
			assertEquals("Invalid User entité.", exception.getLocalizedMessage(exception.getMessage(), 
					Locale.FRENCH, "User"));
		}
	}
	
	@Test
	public void InvalidEntityExceptionWithEngTraceMsg() {
		try {
			throw new InvalidClassException("Not Registered");
		} catch (Exception ex) {
			EntityException exception = new EntityException("invalid.entity", ex);
			System.out.println(exception.getTraceabilityMessage());
		}
	}
}
