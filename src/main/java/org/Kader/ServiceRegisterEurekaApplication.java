package org.Kader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@EnableDiscoveryClient
@SpringBootApplication
public class ServiceRegisterEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegisterEurekaApplication.class, args);
	}

}
