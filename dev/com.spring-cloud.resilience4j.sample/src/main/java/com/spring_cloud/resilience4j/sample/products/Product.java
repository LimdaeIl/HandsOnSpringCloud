package com.spring_cloud.resilience4j.sample.products;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

  private String id;
  private String title;
}
