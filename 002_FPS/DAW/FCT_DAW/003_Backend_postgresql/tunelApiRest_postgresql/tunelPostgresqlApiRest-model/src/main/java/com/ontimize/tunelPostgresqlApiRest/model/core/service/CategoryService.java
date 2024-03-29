package com.ontimize.tunelPostgresqlApiRest.model.core.service;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;


import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;
import com.ontimize.tunelPostgresqlApiRest.api.core.service.ICategoryService;

import com.ontimize.tunelPostgresqlApiRest.model.core.dao.CategoryDao;
import com.ontimize.tunelPostgresqlApiRest.model.core.dao.ContactDao;
import com.ontimize.tunelPostgresqlApiRest.model.core.dao.PlantDao;

@Service("CategoryService")
@Lazy
public class CategoryService implements ICategoryService{

 @Autowired private CategoryDao Dao;
 @Autowired private DefaultOntimizeDaoHelper daoHelper;
 
 @Override
 public EntityResult categoryQuery(Map<String, Object> keyMap, List<String> attrList)
   throws OntimizeJEERuntimeException {
  return this.daoHelper.query(this.Dao, keyMap, attrList);
 }

 @Override
 public EntityResult categoryInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
  return this.daoHelper.insert(this.Dao, attrMap);
 }

 @Override
 public EntityResult categoryUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
   throws OntimizeJEERuntimeException {
  return this.daoHelper.update(this.Dao, attrMap, keyMap);
 }

 @Override
 public EntityResult categoryDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
  return this.daoHelper.delete(this.Dao, keyMap);
 }

}