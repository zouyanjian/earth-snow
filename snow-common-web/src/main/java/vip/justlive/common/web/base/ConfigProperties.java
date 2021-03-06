/*
 * Copyright (C) 2018 justlive1
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package vip.justlive.common.web.base;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * 配置属性类
 * 
 * @author wubo
 *
 */
@Configuration
public class ConfigProperties {

  public static final String DEFAULT_CONFIG_PATH = "classpath*:config/*.properties";

  public static final String SERVER_NAME = "server.name";
  public static final String SERVER_NAME_FIELD = "serverName";

  public static final String CAS_SERVER_URL_PREFIX = "cas.server.prefixUrl";
  public static final String CAS_SERVER_LOGINURL = "cas.server.loginUrl";
  public static final String CAS_SERVER_URL_PREFIX_FIELD = "casServerUrlPrefix";
  public static final String CAS_SERVER_LOGINURL_FIELD = "casServerLoginUrl";

  public static final String IGNORES_URLS = "app.ignoreMatchers";
  public static final String IGNORES_URLS_FIELD = "ignorePattern";

  public static final String ANY_PATH = "/*";
  public static final String URL_PATH_SEPARATOR = "/";

  @Value("${app.host:}")
  public String appHost;

  @Value("${app.name:}")
  public String appName;

  @Value("${app.ignoreMatchers:/static/**,/webjars/**}")
  public String[] ignoreMatchers;

  @Value("${cas.server.prefixUrl:}")
  public String casServerPrefixUrl;

  @Value("${cas.server.loginUrl:}")
  public String casLoginUrl;

  @Value("${cas.server.logoutUrl:}")
  public String casLogoutUrl;

  @Value("${security.auth.dataSource.driver:}")
  public String authDataSourceDriver;

  @Value("${security.auth.dataSource.url:}")
  public String authDataSourceUrl;

  @Value("${security.auth.dataSource.username:}")
  public String authDataSourceUsername;

  @Value("${security.auth.dataSource.password:}")
  public String authDataSourcePassword;

  @Value("${security.auth.usersByUsernameQuery:select username,password,enabled from users where username = ?}")
  public String usersByUsernameQuery;

  @Value("${security.auth.authoritiesEnabled:true}")
  public boolean authoritiesEnabled;

  @Value("${security.auth.authoritiesByUsernameQuery:select username,authority from authorities where username = ?}")
  public String authoritiesByUsernameQuery;

  @Value("${security.auth.groupAuthoritiesEnabled:false}")
  public boolean groupAuthoritiesEnabled;

  @Value("${security.auth.groupAuthoritiesByUsernameQuery:select g.id, g.group_name, ga.authority from groups g, group_members gm, group_authorities ga where gm.username = ? and g.id = ga.group_id and g.id = gm.group_id}")
  public String groupAuthoritiesByUsernameQuery;

  @Value("${security.cas.accessDeniedUrl:/accessDenied}")
  public String accessDeniedUrl;

  @Value("${security.cas.authProviderKey:casAuthProviderKey}")
  public String casAuthProviderKey;

  @Value("${security.cas.defaultSuccessUrl:/}")
  public String defaultSuccessUrl;

  @Value("${security.cas.filterProcessesUrl:/login/cas}")
  public String securityFilterProcessesUrl;

  @Value("${security.cas.useProxyReceptor:false}")
  public boolean useProxyReceptor;

  @Value("${security.cas.proxyReceptorUrl:/proxyreceptor}")
  public String proxyReceptorUrl;

  @Value("${security.cas.service:}")
  public String casService;

  @Value("${security.logout.invalidateSession:true}")
  public boolean logoutSessionInvalidate;

  @Value("${security.logout.url:/logout/cas}")
  public String logoutUrl;

  @Value("${security.logout.successUrl:}")
  public String logoutSuccessUrl;

  @Value("${security.session.expireUrl:/expiredWarn}")
  public String sessionExpireUrl;

  @Value("${security.session.maximum:1}")
  public int sessionMaximum;

  @Value("${security.filterChainDefinitions:/logout=logoutFilter\\n/callback=callbackFilter\\n/**=securityFilter}")
  public String filterChainDefinitions;
}
