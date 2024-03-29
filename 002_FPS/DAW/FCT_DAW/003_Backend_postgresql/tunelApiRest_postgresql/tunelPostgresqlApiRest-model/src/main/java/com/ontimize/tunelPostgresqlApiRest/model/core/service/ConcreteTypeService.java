package com.ontimize.tunelPostgresqlApiRest.model.core.service;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;


import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;
import com.ontimize.tunelPostgresqlApiRest.api.core.service.IConcreteTypeService;

import com.ontimize.tunelPostgresqlApiRest.model.core.dao.ConcreteTypeDao;


@Service("ConcreteTypeService")
@Lazy
public class ConcreteTypeService implements IConcreteTypeService{

 @Autowired private ConcreteTypeDao Dao;
 @Autowired private DefaultOntimizeDaoHelper daoHelper;
 
 @Override
 public EntityResult concreteTypeQuery(Map<String, Object> keyMap, List<String> attrList)
   throws OntimizeJEERuntimeException {
  return this.daoHelper.query(this.Dao, keyMap, attrList);
 }

 @Override
 public EntityResult concreteTypeInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
  return this.daoHelper.insert(this.Dao, attrMap);
 }

 @Override
 public EntityResult concreteTypeUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
   throws OntimizeJEERuntimeException {
  return this.daoHelper.update(this.Dao, attrMap, keyMap);
 }

 @Override
 public EntityResult concreteTypeDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
  return this.daoHelper.delete(this.Dao, keyMap);
 }

}