package com.spring_cloud.eureka.client.order;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// product 호출하기 위해 인터페이스에서!
@FeignClient(name = "product-service")
public interface ProductClient {

  @GetMapping("/product/{id}")
  String getProduct(@PathVariable("id") String id);
}
