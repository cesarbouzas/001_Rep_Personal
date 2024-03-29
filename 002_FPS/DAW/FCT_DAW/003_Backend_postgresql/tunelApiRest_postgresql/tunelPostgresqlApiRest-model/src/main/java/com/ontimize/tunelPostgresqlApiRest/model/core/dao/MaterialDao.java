package com.ontimize.tunelPostgresqlApiRest.model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository("MaterialDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/MaterialDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class MaterialDao extends OntimizeJdbcDaoSupport {

 public static final String TAG="mat_";	
 public static final String ATTR_ID = TAG+"id";
 public static final String ATTR_UNIT = TAG+"unit";
 public static final String ATTR_NAME = TAG+"name";
 public static final String ATTR_PRICE = TAG+"price";
 public static final String ATTR_DESCRIPTION=TAG+"description";

}