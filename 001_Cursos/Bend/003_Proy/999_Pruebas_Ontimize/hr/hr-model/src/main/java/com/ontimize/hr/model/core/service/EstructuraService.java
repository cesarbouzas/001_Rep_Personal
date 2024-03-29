package com.ontimize.hr.model.core.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.ontimize.hr.api.core.service.IEstructuraService;
import com.ontimize.hr.model.core.dao.EstructuraDao;
import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;


@Service("CandidateService")
@Lazy

public class EstructuraService implements IEstructuraService {
	 @Autowired private EstructuraDao estructuraDao;
	 @Autowired private DefaultOntimizeDaoHelper daoHelper;

	@Override
	public EntityResult estructuraQuery(Map<String, Object> keyMap, List<String> attrList)
			throws OntimizeJEERuntimeException {
		return this.daoHelper.query(this.estructuraDao, keyMap, attrList);
	}

	@Override
	public EntityResult estructuraInsert(Map<String, Object> attrMap) throws OntimizeJEERuntimeException {
		
		return this.daoHelper.insert(this.estructuraDao, attrMap);
	}

	@Override
	public EntityResult estructuraUpdate(Map<String, Object> attrMap, Map<String, Object> keyMap)
			throws OntimizeJEERuntimeException {
		
		return this.daoHelper.update(this.estructuraDao, attrMap, keyMap);
	}

	@Override
	public EntityResult estructuraDelete(Map<String, Object> keyMap) throws OntimizeJEERuntimeException {
	return this.daoHelper.delete(this.estructuraDao, keyMap);
	}

}
