package com.ontimize.tunelPostgresqlApiRest.model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository("CategoryDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/CategoryDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class CategoryDao extends OntimizeJdbcDaoSupport {

 public static final String TAG="cat_";	
 public static final String ATTR_ID = TAG+"id";
 public static final String ATTR_NAME = TAG+"name";
 public static final String ATTR_DESCRPTION = TAG+"description";

}