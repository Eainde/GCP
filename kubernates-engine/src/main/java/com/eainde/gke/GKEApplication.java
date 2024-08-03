package com.eainde.gke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.eainde.gke"})
public class GKEApplication {
  public static void main(String[] args) {
    SpringApplication.run(GKEApplication.class, args);
  }
}
