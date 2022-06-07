/*
package com.me.listener;

import com.alibaba.fastjson.JSON;
import com.netflix.discovery.EurekaClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.embedded.tomcat.TomcatWebServer;
import org.springframework.boot.web.server.WebServer;
import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext;
import org.springframework.cloud.context.scope.refresh.RefreshScopeRefreshedEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KkbRefreshScopeListener {

    @Autowired(required = false)
    private EurekaClient eurekaClient;

    @Autowired
    private ApplicationContext applicationContext;


    @EventListener(RefreshScopeRefreshedEvent.class)
    public void onApplicationEvent(RefreshScopeRefreshedEvent event) {
        //This will force the creation of the EurkaClient bean if not already created
        //to make sure the client will be reregistered after a refresh event
        AnnotationConfigServletWebServerApplicationContext annotationApplicationContext =(AnnotationConfigServletWebServerApplicationContext)applicationContext;
        TomcatWebServer webServer = (TomcatWebServer)annotationApplicationContext.getWebServer();
        log.info("KkbRefreshScopeListener:{}", JSON.toJSON(event));
        if(eurekaClient != null) {
            eurekaClient.getApplications();
        }
    }
}
*/
