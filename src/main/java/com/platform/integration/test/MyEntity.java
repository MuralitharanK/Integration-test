/**
 * Copyright (C) Altimetrik 2016. All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Altimetrik. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms and conditions
 * entered into with Altimetrik.
 */

package com.platform.integration.test;

import org.neo4j.ogm.annotation.NodeEntity;

import com.platform.api.audit.AuditData;

/**
 * @author - Muralitharan K
 *
 */
@NodeEntity
public class MyEntity {

    private AuditData auditJson;

	/**
	 * @return the auditJson
	 */
	public AuditData getAuditJson() {
		return auditJson;
	}

	/**
	 * @param auditJson the auditJson to set
	 */
	public void setAuditJson(String auditJson) {
		POJOConverter<AuditData> pojoConverter = new POJOConverter<>(AuditData.class);
		this.auditJson = pojoConverter.convert(auditJson);
	}

}
