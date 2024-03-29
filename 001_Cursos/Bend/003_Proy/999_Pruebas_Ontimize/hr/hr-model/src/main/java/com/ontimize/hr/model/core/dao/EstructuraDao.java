package com.ontimize.hr.model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;
import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

	
	@Repository("EstructuraDao")
	@Lazy
	@ConfigurationFile(configurationFile = "dao/EstructuraDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")

	public class EstructuraDao extends OntimizeJdbcDaoSupport{
		 public static final String TAG="str_";
		 public static final String ATTR_ID = TAG+"id";
		 public static final String ATTR_TIPO=TAG+"tipo";
		 public static final String ATTR_NOMBRE = TAG+"nombre";
		 public static final String ATTR_EJE = TAG+"eje";
		 public static final String ATTR_UBICACION = TAG+"ubicacion";
		 public static final String ATTR_ANCHO = TAG+"ancho";
		 public static final String ATTR_ALTO = TAG+"alto";
	}
