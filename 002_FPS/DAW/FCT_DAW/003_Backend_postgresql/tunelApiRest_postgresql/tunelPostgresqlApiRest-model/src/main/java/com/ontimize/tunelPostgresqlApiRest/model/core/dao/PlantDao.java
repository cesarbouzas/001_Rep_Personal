package com.ontimize.tunelPostgresqlApiRest.model.core.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.ontimize.jee.server.dao.common.ConfigurationFile;
import com.ontimize.jee.server.dao.jdbc.OntimizeJdbcDaoSupport;

@Repository("PlantDao")
@Lazy
@ConfigurationFile(configurationFile = "dao/PlantDao.xml", configurationFilePlaceholder = "dao/placeholders.properties")
public class PlantDao extends OntimizeJdbcDaoSupport {

 public static final String TAG="plant_";	
 public static final String ATTR_ID = TAG+"id";
 public static final String ATTR_TYPE = TAG+"type";
 public static final String ATTR_NAME = TAG+"name";
 public static final String ATTR_PRODUCTIVITY = TAG+"productivity";
 public static final String ATTR_PRICE=TAG+"price";
 public static final String ATTR_SPENT=TAG+"spent";
 public static final String ATTR_PRICE_GASOIL=TAG+"price_gasoil";
 public static final String ATTR_PRICE_KW=TAG+"price_kw";
 public static final String ATTR_PRICE_LUBRICANT=TAG+"price_lubircant";
 public static final String ATTR_PRICE_OPERATOR=TAG+"price_operator";
 public static final String ATTR_PRICE_SUBOPERATOR=TAG+"price_suboperator";
 public static final String ATTR_PRICE_DIET_OPERATOR=TAG+"price_diet_operator";
 public static final String ATTR_PRICE_INCREMNET_HOLIDAYS=TAG+"price_increment_holidays";
 public static final String ATTR_PRICE_INCREMNET_NOCTURNALITY=TAG+"price_increment_nocturnality";
 public static final String ATTR_PRICE_ARID_WEAR=TAG+"price_arid_wear";
 public static final String ATTR_PRICE_CRANE_70_TON=TAG+"price_crane_70_ton";
 public static final String ATTR_PRICE_CRANE_100_TON=TAG+"price_crane_100_ton";
 public static final String ATTR_PRICE_CRANE_EXIT=TAG+"price_crane_exit";
 public static final String ATTR_PRICE_ELEVATOR=TAG+"price_elevator";
 public static final String ATTR_PRICE_TRANSPORT_DEPARTURE=TAG+"price_transport_departure";
 public static final String ATTR_PRICE_TRANSPORT_RETURN=TAG+"price_transport_return";
 public static final String ATTR_PRICE_INSURANCE=TAG+"price_insurance";
 public static final String ATTR_PRICE_LOADER=TAG+"price_loader";
}