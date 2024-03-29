package com.ontimize.tunelPostgresqlApiRest.api.core.service;

import java.util.List;
import java.util.Map;

import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;

public interface IConcreteTypeService {
	
	public EntityResult concreteTypeQuery(Map<String,Object> keyMap,List<String> attrList) throws OntimizeJEERuntimeException;
	public EntityResult concreteTypeInsert(Map<String , Object> attrMap) throws OntimizeJEERuntimeException;
	public EntityResult concreteTypeUpdate(Map<String , Object> attrMap , Map<String , Object> keyMap) throws OntimizeJEERuntimeException;
	public EntityResult concreteTypeDelete(Map<String , Object> keyMap) throws OntimizeJEERuntimeException;
	

}
