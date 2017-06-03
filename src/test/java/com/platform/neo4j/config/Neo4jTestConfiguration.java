/**
 * Copyright (C) Altimetrik 2016. All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Altimetrik. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms and conditions
 * entered into with Altimetrik.
 */

package com.platform.neo4j.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.platform.integration.neo4j.Neo4jApplicationConfiguration;

/**
 * This class contains Neo4j Test Configuration
 * @author Murali Kodavati
 */

@EnableTransactionManagement
@ComponentScan(basePackages = { "com.platform" })
@Configuration
@EnableNeo4jRepositories(basePackages = "com.platform")
@Profile({ "embedded", "test" })
public class Neo4jTestConfiguration extends Neo4jApplicationConfiguration {

	@Configuration
	@PropertySource("classpath:neo4j-test.properties")
	static class Config {
		@Bean
		public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
			return new PropertySourcesPlaceholderConfigurer();
		}
	}

}
