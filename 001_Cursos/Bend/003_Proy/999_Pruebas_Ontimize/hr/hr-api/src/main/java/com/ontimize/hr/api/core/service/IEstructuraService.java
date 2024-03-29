package com.ontimize.hr.api.core.service;

import java.util.List;
import java.util.Map;

import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;

public interface IEstructuraService {
	
	 public EntityResult estructuraQuery(Map<String, Object> keyMap, List<String> attrList) throws OntimizeJEERuntimeException;
	 public EntityResult estructuraInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException;
	 public EntityResult estructuraUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap) throws OntimizeJEERuntimeException;
	 public EntityResult estructuraDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException;

	}

