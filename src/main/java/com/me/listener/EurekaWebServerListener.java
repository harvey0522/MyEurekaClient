/*
package com.me.listener;

import com.netflix.appinfo.ApplicationInfoManager;
import com.netflix.appinfo.InstanceInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.cloud.netflix.eureka.EurekaInstanceConfigBean;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class EurekaWebServerListener {

    @Autowired
    ApplicationInfoManager applicationInfoManager;

    //@Autowired
    //FilteringApplicationEventMulticaster filteringApplicationEventMulticaster;

    @EventListener(WebServerInitializedEvent.class)
    public void onApplicationEvent(WebServerInitializedEvent event) {
        log.info("监听>>>>>>>>>>>:{}", event.toString());
        InstanceInfo info = applicationInfoManager.getInfo();
        info.setStatus(InstanceInfo.InstanceStatus.UP);
        EurekaInstanceConfigBean eurekaInstanceConfig = (EurekaInstanceConfigBean)applicationInfoManager.getEurekaInstanceConfig();
        eurekaInstanceConfig.setInitialStatus(InstanceInfo.InstanceStatus.UP);
        applicationInfoManager.setInstanceStatus(InstanceInfo.InstanceStatus.UP);
        //filteringApplicationEventMulticaster.disable("org.springframework.cloud.netflix.eureka.EurekaDiscoveryClientConfiguration$EurekaClientConfigurationRefresher");
    }
}
*/
