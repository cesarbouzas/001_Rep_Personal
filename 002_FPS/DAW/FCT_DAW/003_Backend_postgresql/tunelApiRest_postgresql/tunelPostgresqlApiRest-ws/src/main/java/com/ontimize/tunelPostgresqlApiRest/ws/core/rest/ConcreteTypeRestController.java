package com.ontimize.tunelPostgresqlApiRest.ws.core.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.ontimize.jee.server.rest.ORestController;
import com.ontimize.tunelPostgresqlApiRest.api.core.service.IConcreteTypeService;


@RestController
@RequestMapping("/concreteType")
public class ConcreteTypeRestController extends ORestController<IConcreteTypeService> {

 @Autowired
 private IConcreteTypeService concretetypeService;

 @Override
 public IConcreteTypeService getService() {
  return this.concretetypeService;
 }
}