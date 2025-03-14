package com.spring_cloud.resilience4j.sample.products;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ProductController {

  private final ProductService productService;

  @GetMapping("/product/{id}")
  public Product getProduct(@PathVariable("id") String id) {
    return productService.getProductDetails(id);
  }

}
