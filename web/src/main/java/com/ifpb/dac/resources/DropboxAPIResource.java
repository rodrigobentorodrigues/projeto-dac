package com.ifpb.dac.resources;

import com.ifpb.dac.interfaces.DropboxAPI;
import com.ifpb.dac.servicelocater.ServiceLocator;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;

/**
 *
 * @author ifpb
 */
@ApplicationScoped
public class DropboxAPIResource {
    
    private static final String RESOURCE = "java:global/core/DropboxAPIImpl!com.ifpb.dac.interfaces.DropboxAPI";
    
    @Dependent
    @Produces
    @Default
    public static DropboxAPI getAulaDao(){
        return ServiceLocator.lookup(RESOURCE);
    }
    
}
