package com.ontimize.tunelPostgresqlApiRest.ws.core.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.ontimize.jee.server.rest.ORestController;
import com.ontimize.tunelPostgresqlApiRest.api.core.service.IMaterialService;
import com.ontimize.tunelPostgresqlApiRest.api.core.service.IPlantService;

@RestController
@RequestMapping("/plant")
public class PlantRestController extends ORestController<IPlantService> {

 @Autowired
 private IPlantService plantService;

 @Override
 public IPlantService getService() {
  return this.plantService;
 }
}