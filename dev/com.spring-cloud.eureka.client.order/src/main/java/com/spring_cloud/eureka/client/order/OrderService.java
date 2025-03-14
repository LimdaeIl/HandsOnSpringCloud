package com.spring_cloud.eureka.client.order;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

// Product-service 호출 후 서비스에서 처리!

@RequiredArgsConstructor
@Service
public class OrderService {

  private final ProductClient productClient;

  // FeignClient 호출!
  public String getProductInfo(String productId) {
    return productClient.getProduct(productId);
  }

  public String getOrder(String orderId) {
    if (orderId.equals("1")) {
      String productId = "2";
      String productInfo = getProductInfo(productId);
      return "Your Order Id: " + orderId + " Product Info: " + productInfo;
    }
    return "Not Exist Order Id: " + orderId;
  }

}
