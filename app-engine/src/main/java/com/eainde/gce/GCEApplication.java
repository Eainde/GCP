package com.eainde.gce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.eainde.order"})
public class GCEApplication {
  public static void main(String[] args) {
    SpringApplication.run(GCEApplication.class, args);
  }
}
