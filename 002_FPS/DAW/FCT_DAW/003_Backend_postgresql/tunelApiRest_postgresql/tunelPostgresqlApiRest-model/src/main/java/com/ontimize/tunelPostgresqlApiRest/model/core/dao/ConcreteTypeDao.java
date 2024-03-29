package com.ontimize.tunelPostgresqlApiRest.model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository("ConcreteTypeDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/ConcreteTypeDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class ConcreteTypeDao extends OntimizeJdbcDaoSupport {

 public static final String TAG="con_";	
 public static final String ATTR_ID = TAG+"id";
 public static final String ATTR_EHE_NAME = TAG+"ehe_name";
 public static final String ATTR_DESCRIPTION=TAG+"description";
 public static final String ATTR_RC=TAG+"rc";

}