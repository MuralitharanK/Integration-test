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
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author - Muralitharan K
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ComponentScan("com.platform.api")
//@ContextConfiguration(classes = {GeneralLedgerTemplateMapper.class, GeneralLedgerServiceImpl.class, GeneralLedgerTemplateServiceImpl.class})
@ActiveProfiles(profiles = "test")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GeneralLedgerTemplateServiceTest {
//
//	@Autowired
//	GLDataHelper dataHelper;
//
//	@Autowired
//	GeneralLedgerTemplateMapper mapper;
//
//	@Autowired
//	GeneralLedgerTemplateService glTemplateService;
//
//	@Autowired
//	GeneralLedgerService glService;
//
//	@InjectMocks
//	GeneralLedgerRepository glRepository;
//
//	@InjectMocks
//	GeneralLedgerTemplateRepository glTemplateRepository;
//
//	//	GeneralLedgerTemplateRepository glTemplateRepository = Mockito.mock(GeneralLedgerTemplateRepository.class);
//	//	GeneralLedgerService glService = Mockito.mock(GeneralLedgerService.class);
//
//	@Before
//	public void setup() {
//		//		glTemplateService.setGeneralLedgerService(glService);
//		//		glTemplateService.setGeneralLedgerTemplateRepository(glTemplateRepository);
//	}
//
//	//@Test(expected = GeneralLedgerException.class)
//	public void verifyCreateGLTemplateWithNoTenant() throws PlatformApplicationException {
//		GeneralLedgerTemplate ledgerTemplate = getGLTemplate();
//		GeneralLedgerTemplateEntity templateEntity = EntityMapper.convertBomToMessaging(ledgerTemplate, GeneralLedgerTemplateEntity.class, mapper);
//		glTemplateService.createEntity(templateEntity);
//	}
//
//	//@Test
//	public void verifyCreateGLTemplate() throws PlatformApplicationException {
//		GeneralLedgerTemplate ledgerTemplate = dataHelper.getGLAssetData();
//		ledgerTemplate.setTenantId("1001");
//		GeneralLedgerTemplateEntity templateEntity = EntityMapper.convertBomToMessaging(ledgerTemplate, GeneralLedgerTemplateEntity.class, mapper);
//		glTemplateService.createEntity(templateEntity);
//	}
//
//	//@Test(expected = GeneralLedgerException.class)
//	public void verifyCreateGLTemplateWithDuplicateTemplate() throws PlatformApplicationException {
//		GeneralLedgerTemplate ledgerTemplate = dataHelper.getGLAssetData();
//		ledgerTemplate.setTenantId("1001");
//		//Mockito.when(glTemplateService.getGeneralLedgerTemplateRepository().findByTenantIdAndCode(Mockito.anyString(), Mockito.anyString())).thenReturn(ledgerTemplate);
//		GeneralLedgerTemplateEntity templateEntity = EntityMapper.convertBomToMessaging(ledgerTemplate, GeneralLedgerTemplateEntity.class, mapper);
//		glTemplateService.createEntity(templateEntity);
//	}
//
//	private GeneralLedgerTemplate getGLTemplate() {
//		GeneralLedgerTemplate ledgerTemplate = new GeneralLedgerTemplate();
//		return ledgerTemplate;
//	}
//
//	//@Test(expected = GeneralLedgerException.class)
//	public void verifyUpdateGLTemplateWithNoTemplate() throws PlatformApplicationException {
//		GeneralLedgerTemplate ledgerTemplate = getGLTemplate();
//		ledgerTemplate.setTenantId("1001");
//		GeneralLedgerTemplateEntity templateEntity = EntityMapper.convertBomToMessaging(ledgerTemplate, GeneralLedgerTemplateEntity.class, mapper);
//		glTemplateService.updateEntity(ledgerTemplate.getId(), templateEntity);
//	}
//
//	//@Test
//	public void verifyUpdateGLTemplate() throws PlatformApplicationException {
//		GeneralLedgerTemplate ledgerTemplate = dataHelper.getGLAssetData();
//		ledgerTemplate.setParentGeneralLedgerTemplate(dataHelper.getRetailLoanGL_Asset());
//		//Mockito.when(glTemplateService.getGeneralLedgerTemplateRepository().findByTenantIdAndCode(Mockito.anyString(), Mockito.anyString())).thenReturn(ledgerTemplate);
//		GeneralLedgerTemplateEntity templateEntity = EntityMapper.convertBomToMessaging(ledgerTemplate, GeneralLedgerTemplateEntity.class, mapper);
//		glTemplateService.updateEntity(ledgerTemplate.getId(), templateEntity);
//	}
//
//	//@Test
//	public void verifyDeleteGLTemplate() throws PlatformApplicationException {
//		GeneralLedgerTemplate ledgerTemplate = dataHelper.getGLAssetData();
//		ledgerTemplate.setParentGeneralLedgerTemplate(dataHelper.getRetailLoanGL_Asset());
//		//Mockito.when(glTemplateService.getGeneralLedgerTemplateRepository().findByTenantIdAndCode(Mockito.anyString(), Mockito.anyString())).thenReturn(ledgerTemplate);
//		glTemplateService.deleteEntity(ledgerTemplate.getId());
//	}
//
//	//@Test(expected = GeneralLedgerException.class)
//	public void verifyDeleteGLTemplateWithNoTemplate() throws PlatformApplicationException {
//		GeneralLedgerTemplate ledgerTemplate = dataHelper.getGLAssetData();
//		ledgerTemplate.setParentGeneralLedgerTemplate(dataHelper.getRetailLoanGL_Asset());
//		glTemplateService.deleteEntity(ledgerTemplate.getId());
//	}
//
//	//@Test(expected = GeneralLedgerException.class)
//	public void verifyDeleteGLTemplateWithGLActualCode() throws PlatformApplicationException {
//		GeneralLedgerTemplate ledgerTemplate = dataHelper.getGLAssetData();
//		ledgerTemplate.setParentGeneralLedgerTemplate(dataHelper.getRetailLoanGL_Asset());
//		//Mockito.when(glTemplateService.getGeneralLedgerTemplateRepository().findByTenantIdAndCode(Mockito.anyString(), Mockito.anyString())).thenReturn(ledgerTemplate);
//		//Mockito.when(glTemplateService.getGeneralLedgerService().getGeneralLedgerByTenantIdAndCode(Mockito.anyString(), Mockito.anyString())).thenReturn(getGL());
//		glTemplateService.deleteEntity(ledgerTemplate.getId());
//	}
//	public void retrieveGLTemplate() {
//
//	}
//
//	public void retrieveGeneralLedgerTemplates() {
//
//	}
}
