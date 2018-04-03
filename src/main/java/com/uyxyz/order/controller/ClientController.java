package com.uyxyz.order.controller;

import com.uyxyz.order.config.RestTemplateConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class ClientController {

//    @Autowired
//    private LoadBalancerClient loadBalancerClient ;

    @Autowired
    RestTemplate restTemplate ;

    @GetMapping("/getProductInfo")
    public String getProductInfo(){
        //1.RestTemplate 直接用地址+端口访问
//        RestTemplate restTemplate = new RestTemplate();
//        String resp = restTemplate.getForObject("http://localhost:8080/PI",String.class);

        //2.使用 LoadBalence 选择一个产品服务器，RESTTEMPLATE
//        RestTemplate restTemplate = new RestTemplate();
//        ServiceInstance serviceInstance = loadBalancerClient.choose("PRODUCT");
//        String uri,host;
//        Integer port = 0 ;
//        host = serviceInstance.getHost() ;
//        port = serviceInstance.getPort() ;
//        uri = String.format("http://%s:%s",host,port)+"/PI";
//        log.info("uri:"+uri);
//        log.info("host:"+host);
//        log.info("port:"+String.valueOf(port));
//        String resp = restTemplate.getForObject(uri,String.class);

        //3.用bean 获取resttemplate
        String resp = restTemplate.getForObject("http://PRODUCT/PI",String.class);

        log.info(resp);

        return resp;
    }
}
