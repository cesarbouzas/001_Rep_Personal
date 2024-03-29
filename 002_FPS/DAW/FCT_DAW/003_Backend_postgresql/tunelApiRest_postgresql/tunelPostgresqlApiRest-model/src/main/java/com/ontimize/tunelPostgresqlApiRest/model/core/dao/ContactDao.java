package com.ontimize.tunelPostgresqlApiRest.model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository("ContactDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/ContactDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class ContactDao extends OntimizeJdbcDaoSupport {

 public static final String TAG="cto_";	
 public static final String ATTR_ID = TAG+"id";
 public static final String ATTR_CATEGORY = TAG+"category";
 public static final String ATTR_COMPANY = TAG+"company";
 public static final String ATTR_CONTACT_NAME = TAG+"contact_name";
 public static final String ATTR_PHONE=TAG+"phone";
 public static final String ATTR_EMAIL=TAG+"email";
 public static final String ATTR_OBSERVATIONS=TAG+"observations";
}