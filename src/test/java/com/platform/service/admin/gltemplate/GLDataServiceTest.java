/**
 * Copyright (C) Altimetrik 2016. All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Altimetrik. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms and conditions
 * entered into with Altimetrik.
 */

package com.platform.service.admin.gltemplate;

import org.junit.FixMethodOrder;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import org.springframework.test.context.ActiveProfiles;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.platform.util.redis.RedisMockProvider;

/**
 * @author - Muralitharan K
 *
 */
//@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = {GeneralLedgerTemplateServiceImpl.class, RedisMockProvider.class })
@ActiveProfiles(profiles = "test")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GLDataServiceTest extends GLDataHelper {
//
//	@Autowired
//	GeneralLedgerTemplateService generalLedgerTemplateService;
//
//	@Autowired
//	GeneralLedgerTemplateRepository generalLedgerTemplateRepository;
//
//	@Test
//	public void verify1_createGL_ASSET() {
//		GeneralLedgerTemplate ledgerTemplate = getGLAssetData();
//		try {
//			generalLedgerTemplateService.createGLTemplate(ledgerTemplate);
//		} catch (GeneralLedgerException e) {
//			e.printStackTrace();
//		}
//	}
//	@Test
//	public void verify2_createRetailLoanGLData() {
//		GeneralLedgerTemplate glData = getRetailLoanGL_Asset();
//		GeneralLedgerTemplate parentGl;
//		try {
//			parentGl = generalLedgerTemplateService.retrieveGLTemplate("10001", "A100");
//			glData.setParentGeneralLedgerTemplate(parentGl);
//			generalLedgerTemplateService.createGLTemplate(glData);
//		} catch (GeneralLedgerException e) {
//			e.printStackTrace();
//		}
//
//	}
//
//	@Test
//	public void verify3_createPersonalLoanGLData() {
//		GeneralLedgerTemplate glData = getPersonalLoanGL_Asset();
//		//GeneralLedgerTemplate parentGlData = getGLAssetParentData();
//		GeneralLedgerTemplate parentGl;
//		try {
//			parentGl = generalLedgerTemplateService.retrieveGLTemplate("10001", "300");
//			glData.setParentGeneralLedgerTemplate(parentGl);
//			generalLedgerTemplateService.createGLTemplate(glData);
//		} catch (GeneralLedgerException e) {
//			e.printStackTrace();
//		}
//
//	}
//
//	@Test
//	public void verify4_createPLPvtEmpGLData() {
//		GeneralLedgerTemplate glData = getPL_PvtEmp_GL_Asset();
//		GeneralLedgerTemplate parentGl;
//		try {
//			parentGl = generalLedgerTemplateService.retrieveGLTemplate("10001", "3002");
//			glData.setParentGeneralLedgerTemplate(parentGl);
//			generalLedgerTemplateService.createGLTemplate(glData);
//		} catch (GeneralLedgerException e) {
//			e.printStackTrace();
//		}
//
//	}
//
//	@Test
//	public void verify5_createPLGovtEmpGLData() {
//		GeneralLedgerTemplate glData = getPL_GovtEmp_GL_Asset();
//		try {
//			GeneralLedgerTemplate parentGl = generalLedgerTemplateService.retrieveGLTemplate("10001", "3002");
//			glData.setParentGeneralLedgerTemplate(parentGl);
//			generalLedgerTemplateService.createGLTemplate(glData);
//		} catch (GeneralLedgerException e) {
//			e.printStackTrace();
//		}
//
//	}
//	//@Test
//	public void verify_createGLLiabilityData_3() {
//		GeneralLedgerTemplate glData = getGLLiability();
//		try {
//			generalLedgerTemplateService.createGLTemplate(glData);
//		} catch (GeneralLedgerException e) {
//			e.printStackTrace();
//		}
//	}
//
//	//@Test
//	public void verify_createGLLiabilityData_4() {
//		GeneralLedgerTemplate glData = getRetailLoanGL_Asset();
//		GeneralLedgerTemplate parentGl;
//		try {
//			parentGl = generalLedgerTemplateService.retrieveGLTemplate("10001", "L100");
//			glData.setParentGeneralLedgerTemplate(parentGl);
//			generalLedgerTemplateService.createGLTemplate(glData);
//		} catch (GeneralLedgerException e) {
//			e.printStackTrace();
//		}
//
//	}
//
//	//@Test
//	public void verify_createGLIncomeData() {
//		GeneralLedgerTemplate glData = getGLIncome();
//		try {
//			generalLedgerTemplateService.createGLTemplate(glData);
//		} catch (GeneralLedgerException e) {
//			e.printStackTrace();
//		}
//	}
//
//	//@Test
//	public void verify_createGLExpenseData() {
//		GeneralLedgerTemplate glData = getGLExpense();
//		try {
//			generalLedgerTemplateService.createGLTemplate(glData);
//		} catch (GeneralLedgerException e) {
//			e.printStackTrace();
//		}
//	}
//
//	//	@Test
//	public void verify_createGLHeads() {
//		//		GeneralLedger glData = createGLTypes(GlHead.ASSET);
//		//		generalLedgerTemplateService.createGL(glData);
//
//	}
//
//	public void deleteGL() {
//
//	}
//
//	//@Test
//	public void getGLListByType() {
//		GeneralLedgerTemplate glData = getGLAssetData();
//		ObjectMapper mapper = new ObjectMapper();
//		String glDataJson = "";
//		try {
//			glDataJson = mapper.writeValueAsString(glData);
//		} catch (JsonProcessingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		List<GeneralLedgerTemplate> glDataList;
//		try {
//			glDataList = generalLedgerTemplateService.retrieveGeneralLedgerTemplates(glDataJson);
//			Assert.assertTrue(glDataList.size() == 9);
//			glDataList = generalLedgerTemplateService.retrieveGeneralLedgerTemplates(glDataJson);
//			Assert.assertTrue(glDataList.size() == 1);
//		} catch (GeneralLedgerException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}

}
