package com.ontimize.tunelPostgresqlApiRest.api.core.service;

import java.util.List;
import java.util.Map;

import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;

public interface IMaterialService {
	
	public EntityResult materialQuery(Map<String,Object> keyMap,List<String> attrList) throws OntimizeJEERuntimeException;
	public EntityResult materialInsert(Map<String , Object> attrMap) throws OntimizeJEERuntimeException;
	public EntityResult materialUpdate(Map<String , Object> attrMap , Map<String , Object> keyMap) throws OntimizeJEERuntimeException;
	public EntityResult materialDelete(Map<String , Object> keyMap) throws OntimizeJEERuntimeException;
	

}
