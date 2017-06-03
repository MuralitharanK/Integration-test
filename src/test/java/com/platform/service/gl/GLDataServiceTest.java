/**
 * Copyright (C) Altimetrik 2016. All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Altimetrik. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms and conditions
 * entered into with Altimetrik.
 */

package com.platform.service.gl;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.platform.api.gl.GLDataService;
import com.platform.api.gl.GLDataServiceImpl;
import com.platform.api.gl.GLRepository;
import com.platform.bom.gl.GeneralLedger;
import com.platform.bom.gl.GeneralLedger.GLHead;
import com.platform.neo4j.config.Neo4jTestConfiguration;
import com.platform.util.redis.RedisMockProvider;

/**
 * @author - Muralitharan K
 *
 */
//@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={Neo4jTestConfiguration.class, GLDataServiceImpl.class, RedisMockProvider.class })
@ActiveProfiles(profiles = "test")
public class GLDataServiceTest {

	@Autowired
	GLDataService glDataService;

	@Autowired
	GLRepository glRepository;

	//@Test
	public void verify_createGL() {
		GeneralLedger glData = getGLData();
		glDataService.createGL(glData);
	}

	//@Test
	public void verify_createGLWithNullCode() {
		GeneralLedger glData = getGLData();
		glData.setDescription(null);
		glDataService.createGL(glData);
	}

	/**
	 * @return
	 */
	private GeneralLedger getGLData() {
		GeneralLedger data = new GeneralLedger();
		//data.setId(new Long(123));
		data.setGlCode("ASs02");
		data.setDescription("CASH");
		data.setHead(GLHead.ASSET);
		data.setCreatedByUser("User1");
		data.setCreatedDate(new Date());
		return data;
	}

	//@Test
	public void updateGL() {
		GeneralLedger glData = getGLData();
		glData.setId(new Long(1));
		glData.setHead(GLHead.LIABILITY);
		glDataService.createGL(glData);
	}

	public void deleteGL() {

	}

	@Test
	public void getGLListByType() {
		List<GeneralLedger> glDataList = glDataService.getGLListByTypeAndTenantId(GLHead.ASSET.name(), "");
		Assert.assertTrue(glDataList.size() == 9);
		glDataList = glDataService.getGLListByTypeAndTenantId(GLHead.LIABILITY.name(), "");
		Assert.assertTrue(glDataList.size() == 1);
	}

	@Test
	public void getGLCode() {
		GeneralLedger glData = glDataService.getGLCode(new Long(1));
		Assert.assertNotNull(glData);
		Assert.assertEquals(glData.getHead(), GLHead.LIABILITY);
	}

}
