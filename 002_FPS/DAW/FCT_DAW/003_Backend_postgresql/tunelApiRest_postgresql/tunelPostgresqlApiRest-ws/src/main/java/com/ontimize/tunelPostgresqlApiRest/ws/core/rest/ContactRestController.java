package com.ontimize.tunelPostgresqlApiRest.ws.core.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.ontimize.jee.server.rest.ORestController;
import com.ontimize.tunelPostgresqlApiRest.api.core.service.IContactService;
import com.ontimize.tunelPostgresqlApiRest.api.core.service.IMaterialService;

@RestController
@RequestMapping("/contact")
public class ContactRestController extends ORestController<IContactService> {

 @Autowired
 private IContactService contactService;

 @Override
 public IContactService getService() {
  return this.contactService;
 }
}