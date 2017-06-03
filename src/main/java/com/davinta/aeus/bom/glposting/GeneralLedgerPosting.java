/**
 * Copyright (C) Davinta Technologies 2017. All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Davinta Technologies. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms and conditions
 * entered into with Davinta Technologies.
 */

package com.davinta.aeus.bom.glposting;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.neo4j.ogm.annotation.NodeEntity;

import com.davinta.aeus.bom.domain.BaseEntity;
import com.davinta.aeus.bom.domain.annotation.TenantAware;

/**
 * General ledger entity is to capture information that requires to generate actual ledger and persist the entity.
 * @author - Muralitharan K
 *
 */

@TenantAware
public class GeneralLedgerPosting extends BaseEntity {

	/**
	 * Field serialVersionUID.
	 */
	private static final long serialVersionUID = -7456358520245260723L;

	/**
	 * This field enterpriseId specifies the enterpriseId
	 * the Enterprise Type - Enterprise | Office | Agent.
	 */
	@NotNull
	private String enterpriseId;

	@NotNull
	private String glCode;

	private String glIdentifier;

	private String glTemplateCode;

	private String glDescription;

	/**
	 * This field externalReference store the
	 * reference for the external reference.
	 */
	private String externalReference;

	/**
	 * This field glBalance store the
	 * balance for the glCode.
	 */
	private double glBalance;

	/**
	 * This field glAverageBalanceYTD store the
	 * average balance for the glCode for the year.
	 */
	private double glAverageBalanceYTD;

	/**
	 * This field glAverageBalanceMTD store the
	 * average balance for the glCode for the month.
	 */
	private double glAverageBalanceMTD;

	/**
	 * This field glBlockedStatusCR have value as 1 or 0.
	 * 1 	-- Blocked [ All Transactions will be blocked. Only Direct Posting
	 *       will be allowed for the respective glCode.
	 * 2	-- UnBlocked [ All Transactions all allowed. Direct and In-Direct Posting
	 *       will be allowed for the respective glCode.
	 */
	private short glBlockedStatusCR;

	/**
	 * This field glBlockedStatusDR have value as 1 or 0.
	 * 1 	-- Blocked [ All Transactions will be blocked. Only Direct Posting
	 *       will be allowed for the respective glCode.
	 * 2	-- UnBlocked [ All Transactions all allowed. Direct and In-Direct Posting
	 *       will be allowed for the respective glCode.
	 */
	private short glBlockedStatusDR;

	/**
	 * This field glLastBalanceUpdateDateTime specifies the
	 * last updated Balance Date and Time.
	 */
	private Date glLastBalanceUpdateDateTime;

	/**
	 * This field glLastUpdatedFromChannel specifies the
	 * channel by which balance was last updated.
	 */
	private String glLastUpdatedFromChannel;

	public String getEnterpriseId() {
		return enterpriseId;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getGlCode() {
		return glCode;
	}

	public void setGlCode(String glCode) {
		this.glCode = glCode;
	}

	public double getGlBalance() {
		return glBalance;
	}

	public void setGlBalance(double glBalance) {
		this.glBalance = glBalance;
	}

	public double getGlAverageBalanceYTD() {
		return glAverageBalanceYTD;
	}

	public void setGlAverageBalanceYTD(double glAverageBalanceYTD) {
		this.glAverageBalanceYTD = glAverageBalanceYTD;
	}

	public double getGlAverageBalanceMTD() {
		return glAverageBalanceMTD;
	}

	public void setGlAverageBalanceMTD(double glAverageBalanceMTD) {
		this.glAverageBalanceMTD = glAverageBalanceMTD;
	}

	/**
	 * Gets glBlockedStatusDR.
	 * @return the glBlockedStatusDR
	 */
	public short getGlBlockedStatusDR() {
		return glBlockedStatusDR;
	}

	/**
	 * Sets glBlockedStatusDR.
	 * @param glBlockedStatusDR the glBlockedStatusDR to set
	 */
	public void setGlBlockedStatusDR(short glBlockedStatusDR) {
		this.glBlockedStatusDR = glBlockedStatusDR;
	}

	/**
	 * Gets glBlockedStatusCR.
	 * @return the glBlockedStatusCR
	 */
	public short getGlBlockedStatusCR() {
		return glBlockedStatusCR;
	}

	/**
	 * Sets glBlockedStatusCR.
	 * @param glBlockedStatusCR the glBlockedStatusCR to set
	 */
	public void setGlBlockedStatusCR(short glBlockedStatusCR) {
		this.glBlockedStatusCR = glBlockedStatusCR;
	}

	public Date getGlLastBalanceUpdateDateTime() {
		return glLastBalanceUpdateDateTime;
	}

	public void setGlLastBalanceUpdateDateTime(Date glLastBalanceUpdateDateTime) {
		this.glLastBalanceUpdateDateTime = glLastBalanceUpdateDateTime;
	}

	public String getGlLastUpdatedFromChannel() {
		return glLastUpdatedFromChannel;
	}

	public void setGlLastUpdatedFromChannel(String glLastUpdatedFromChannel) {
		this.glLastUpdatedFromChannel = glLastUpdatedFromChannel;
	}


	/**
	 * Gets externalReference.
	 * @return the externalReference
	 */
	public String getExternalReference() {
		return externalReference;
	}

	/**
	 * Sets externalReference.
	 * @param externalReference the externalReference to set
	 */
	public void setExternalReference(String externalReference) {
		this.externalReference = externalReference;
	}

	/**
	 * Gets glIdentifier.
	 * @return the glIdentifier
	 */
	public String getGlIdentifier() {
		return glIdentifier;
	}

	/**
	 * Sets glIdentifier.
	 * @param glIdentifier the glIdentifier to set
	 */
	public void setGlIdentifier(String glIdentifier) {
		this.glIdentifier = glIdentifier;
	}

	/**
	 * Gets glTemplateCode.
	 * @return the glTemplateCode
	 */
	public String getGlTemplateCode() {
		return glTemplateCode;
	}

	/**
	 * Sets glTemplateCode.
	 * @param glTemplateCode the glTemplateCode to set
	 */
	public void setGlTemplateCode(String glTemplateCode) {
		this.glTemplateCode = glTemplateCode;
	}

	/**
	 * Gets glDescription.
	 * @return the glDescription
	 */
	public String getGlDescription() {
		return glDescription;
	}

	/**
	 * Sets glDescription.
	 * @param glDescription the glDescription to set
	 */
	public void setGlDescription(String glDescription) {
		this.glDescription = glDescription;
	}
}
