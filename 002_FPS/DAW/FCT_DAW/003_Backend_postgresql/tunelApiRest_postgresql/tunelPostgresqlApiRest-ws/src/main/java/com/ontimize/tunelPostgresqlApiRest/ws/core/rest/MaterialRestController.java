package com.ontimize.tunelPostgresqlApiRest.ws.core.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.ontimize.jee.server.rest.ORestController;
import com.ontimize.tunelPostgresqlApiRest.api.core.service.IMaterialService;

@RestController
@RequestMapping("/material")
public class MaterialRestController extends ORestController<IMaterialService> {

 @Autowired
 private IMaterialService materialService;

 @Override
 public IMaterialService getService() {
  return this.materialService;
 }
}