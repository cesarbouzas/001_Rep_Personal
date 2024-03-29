package com.ontimize.tunelPostgresqlApiRest.ws.core.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.ontimize.jee.server.rest.ORestController;
import com.ontimize.tunelPostgresqlApiRest.api.core.service.ICategoryService;


@RestController
@RequestMapping("/category")
public class CategoryRestController extends ORestController<ICategoryService> {

 @Autowired
 private ICategoryService categoryService;

 @Override
 public ICategoryService getService() {
  return this.categoryService;
 }
}