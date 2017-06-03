/**
 * Copyright (C) Altimetrik 2016. All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Altimetrik. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms and conditions
 * entered into with Altimetrik.
 */
package com.platform.integration.test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;

import org.springframework.data.annotation.Id;

import com.platform.bom.domain.Model;

/**
 * @author Mkrishnamoorthy
 *
 */
public class AuditData implements Model {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public enum AuditType {
		REQUEST,
		RESPONSE
	}
	@Id
	private BigInteger auditId;
	private String userId;
	private String sessionId;
	private AuditType auditType;
	private String auditDetails;
	private String resourceName;
	private Timestamp entryTime;
	private BigDecimal duration; 
	/**
	 * responseType would be 'success' or 'failure'.
	 */
	private String responseType;

	/**
	 * @return the auditId
	 */
	public BigInteger getAuditId() {
		return auditId;
	}
	/**
	 * @param auditId the auditId to set
	 */
	public void setAuditId(BigInteger auditId) {
		this.auditId = auditId;
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the sessionId
	 */
	public String getSessionId() {
		return sessionId;
	}
	/**
	 * @param sessionId the sessionId to set
	 */
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	/**
	 * @return the auditType
	 */
	public AuditType getAuditType() {
		return auditType;
	}
	/**
	 * @param auditType the auditType to set
	 */
	public void setAuditType(AuditType auditType) {
		this.auditType = auditType;
	}
	/**
	 * @return the auditDetails
	 */
	public String getAuditDetails() {
		return auditDetails;
	}
	/**
	 * @param auditDetails the auditDetails to set
	 */
	public void setAuditDetails(String auditDetails) {
		this.auditDetails = auditDetails;
	}
	/**
	 * @return the resourceName
	 */
	public String getResourceName() {
		return resourceName;
	}
	/**
	 * @param resourceName the resourceName to set
	 */
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	/**
	 * @return the entryTime
	 */
	public Timestamp getEntryTime() {
		return entryTime;
	}
	/**
	 * @param entryTime the entryTime to set
	 */
	public void setEntryTime(Timestamp entryTime) {
		this.entryTime = entryTime;
	}
	/**
	 * @return the duration
	 */
	public BigDecimal getDuration() {
		return duration;
	}
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(BigDecimal duration) {
		this.duration = duration;
	}
	/**
	 * @return the responseType
	 */
	public String getResponseType() {
		return responseType;
	}
	/**
	 * @param responseType the responseType to set
	 */
	public void setResponseType(String responseType) {
		this.responseType = responseType;
	}
	
	@Override
	public String toString() {
		return "AuditData ["
				+ "auditId=" + auditId
				+ "userId = " + userId
				+ "sessionId = " + sessionId
				+ "auditType = " + auditType
				+ "auditDetails = " + auditDetails
				+ "resourceName = " + resourceName
				+ "entryTime = " + entryTime
				+ "duration = " + duration
				+ "responseType = " + responseType +"]";
	}
}
