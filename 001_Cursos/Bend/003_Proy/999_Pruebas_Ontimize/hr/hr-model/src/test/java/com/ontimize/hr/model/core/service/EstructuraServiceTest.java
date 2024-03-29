package com.ontimize.hr.model.core.service;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.ArgumentMatchers.anyMap;
import static org.mockito.Mockito.doReturn;


import java.sql.Types;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;



import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;


import com.ontimize.hr.model.core.dao.EstructuraDao;
import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.dto.EntityResultMapImpl;
import com.ontimize.jee.server.dao.DefaultOntimizeDaoHelper;



@ExtendWith(MockitoExtension.class)

public class EstructuraServiceTest {
	
	@Mock
	DefaultOntimizeDaoHelper daoHelper;
	@Spy 
	EstructuraService spyService;
	@InjectMocks
	EstructuraService service;
	@Autowired
	EstructuraDao estructuraDao;
	
	
	@Nested
	@DisplayName("Test para Consultas de Estructuras")
	@TestInstance(TestInstance.Lifecycle.PER_CLASS)
	public class EstructurasQuery{
	
		@Test	
		@DisplayName("Obten todos los datos de la tabla estructuras ")
		void cuando_se_consulta_devuelve_todoslosdatos() {
			doReturn(getEstructurasAllData()).when(daoHelper).query(any(), anyMap(), anyList());
			EntityResult entityResult=service.estructuraQuery(new HashMap<>(), new ArrayList<>());
			assertEquals(EntityResult.OPERATION_SUCCESSFUL,entityResult.getCode());
			assertEquals(3,entityResult.calculateRecordNumber());
			}	
			
		}

	public EntityResult getEstructurasAllData() {
		List<String> columnList = Arrays.asList(EstructuraDao.ATTR_ID,EstructuraDao.ATTR_TIPO, EstructuraDao.ATTR_NOMBRE,EstructuraDao.ATTR_EJE ,EstructuraDao.ATTR_UBICACION,EstructuraDao.ATTR_ANCHO,EstructuraDao.ATTR_ALTO);
		EntityResult bd = new EntityResultMapImpl(columnList);
		bd.addRecord(new HashMap<String, Object>() {
			{
				put(EstructuraDao.ATTR_ID, 1);
				put(EstructuraDao.ATTR_TIPO, "Paso Superior");
				put(EstructuraDao.ATTR_NOMBRE,"PS 0+600 v44");
				put(EstructuraDao.ATTR_EJE,"Camino servico cs 0+200");
				put(EstructuraDao.ATTR_UBICACION,"Pk 0+632");
				put(EstructuraDao.ATTR_ANCHO,12);
				put(EstructuraDao.ATTR_ALTO,10);
			}
		});
		bd.addRecord(new HashMap<String, Object>() {
				{
					put(EstructuraDao.ATTR_ID, 1);
					put(EstructuraDao.ATTR_TIPO, "Paso Inferior");
					put(EstructuraDao.ATTR_NOMBRE,"PI 0+230 v2");
					put(EstructuraDao.ATTR_EJE,"Glorieta");
					put(EstructuraDao.ATTR_UBICACION,"Pk 0+220");
					put(EstructuraDao.ATTR_ANCHO,12);
					put(EstructuraDao.ATTR_ALTO,5.50);
				}
			});
		
		bd.addRecord(new HashMap<String, Object>() {
				{
					put(EstructuraDao.ATTR_ID, 1);
					put(EstructuraDao.ATTR_TIPO, "Paso Inferior");
					put(EstructuraDao.ATTR_NOMBRE,"PI 0+230 v2");
					put(EstructuraDao.ATTR_EJE,"Glorieta");
					put(EstructuraDao.ATTR_UBICACION,"Pk 0+220");
					put(EstructuraDao.ATTR_ANCHO,12);
					put(EstructuraDao.ATTR_ALTO,5.50);
				}
			});
		bd.setCode(EntityResult.OPERATION_SUCCESSFUL);
		bd.setColumnSQLTypes(new HashMap<String, Number>() {
			{
				put(EstructuraDao.ATTR_ID, Types.INTEGER);
				put(EstructuraDao.ATTR_TIPO, Types.VARCHAR);
				put(EstructuraDao.ATTR_NOMBRE, Types.VARCHAR);
				put(EstructuraDao.ATTR_EJE,Types.VARCHAR);
				put(EstructuraDao.ATTR_UBICACION,Types.VARCHAR);
				put(EstructuraDao.ATTR_ANCHO,Types.DECIMAL);
				put(EstructuraDao.ATTR_ALTO,Types.DECIMAL);
			}
		});
		return bd;
	}


	
}
