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

import org.springframework.data.neo4j.repository.GraphRepository;

import com.platform.bom.gl.GeneralLedger;

/**
 * @author - Muralitharan K
 * 
 */
public interface GLRepository extends GraphRepository<GeneralLedger> {

	List<GeneralLedger> findByHeadAndTenantId(String head, String tenenatId);
}
