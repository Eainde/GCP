package com.eainde.cloud.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.eainde.cloud.run"})
public class CloudRunApplication {
  public static void main(String[] args) {
    SpringApplication.run(CloudRunApplication.class, args);
  }
}
