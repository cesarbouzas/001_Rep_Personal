package com.ontimize.tunelPostgresqlApiRest.api.core.service;

import java.util.List;
import java.util.Map;

import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;

public interface IPlantService {
	
	public EntityResult plantQuery(Map<String,Object> keyMap,List<String> attrList) throws OntimizeJEERuntimeException;
	public EntityResult plantInsert(Map<String , Object> attrMap) throws OntimizeJEERuntimeException;
	public EntityResult plantUpdate(Map<String , Object> attrMap , Map<String , Object> keyMap) throws OntimizeJEERuntimeException;
	public EntityResult plantDelete(Map<String , Object> keyMap) throws OntimizeJEERuntimeException;
	

}
