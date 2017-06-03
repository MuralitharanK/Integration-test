/**
 * Copyright (C) Altimetrik 2016. All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Altimetrik. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms and conditions
 * entered into with Altimetrik.
 */

package com.platform.bom.gl;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.neo4j.ogm.annotation.NodeEntity;

import com.platform.bom.domain.BaseEntity;

/**
 * @author - Muralitharan K
 *
 */
@NodeEntity
public class GeneralLedger extends BaseEntity {

	private static final long serialVersionUID = -791530307772556625L;

	public enum GLHead {
		ASSET,
		LIABILITY,
		INCOME,
		EXPENSE
	}
	public enum PostingType {
		DIRECT,
		INDIRECT
	}
	@NotNull
	@Pattern(regexp="[a-zA-Z0-9]*")
	private String glCode;
	@NotNull
	private String description;
	@NotNull
	private GLHead head;
	private String parentGLCode;
	private PostingType postingType;


	/**
	 * Gets postingType.
	 * @return the postingType
	 */
	public PostingType getPostingType() {
		return postingType;
	}
	/**
	 * Sets postingType.
	 * @param postingType the postingType to set
	 */
	public void setPostingType(PostingType postingType) {
		this.postingType = postingType;
	}
	/**
	 * Gets glCode.
	 * @return the glCode
	 */
	public String getGlCode() {
		return glCode;
	}
	/**
	 * Sets glCode.
	 * @param glCode the glCode to set
	 */
	public void setGlCode(String glCode) {
		this.glCode = glCode;
	}
	/**
	 * Gets description.
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * Sets description.
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Gets head.
	 * @return the head
	 */
	public GLHead getHead() {
		return head;
	}
	/**
	 * Sets head.
	 * @param head the head to set
	 */
	public void setHead(GLHead head) {
		this.head = head;
	}
	/**
	 * Gets parentGLCode.
	 * @return the parentGLCode
	 */
	public String getParentGLCode() {
		return parentGLCode;
	}
	/**
	 * Sets parentGLCode.
	 * @param parentGLCode the parentGLCode to set
	 */
	public void setParentGLCode(String parentGLCode) {
		this.parentGLCode = parentGLCode;
	}

}
