package com.bmw.ms.business.base;

import io.swagger.jaxrs.config.BeanConfig;
import java.util.HashSet;
import java.util.Set;
import javax.faces.application.Resource;
import javax.ws.rs.core.Application;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author UNGERW
 */
public class SwaggerApplication /*extends Application*/ {

    public SwaggerApplication() {
        System.out.println("Swagger App");
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0");
        beanConfig.setSchemes(new String[]{"http"});
        beanConfig.setTitle("My API");
        beanConfig.setBasePath("/sample");
        beanConfig.setResourcePackage("com.bmw.ms");
        beanConfig.setScan(true);
    }

  //  @Override
    public Set<Class<?>> getClasses() {
                System.out.println("Swagger App get Classes");
        HashSet<Class<?>> set = new HashSet<Class<?>>();
        set.add(Resource.class);
        set.add(io.swagger.jaxrs.listing.ApiListingResource.class);
        set.add(io.swagger.jaxrs.listing.SwaggerSerializers.class);
        return set;
    }

}
