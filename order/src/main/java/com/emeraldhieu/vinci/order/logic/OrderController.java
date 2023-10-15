package com.emeraldhieu.vinci.order.logic;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequiredArgsConstructor
public class OrderController implements OrdersApi {

    @Override
    public ResponseEntity<OrderResponse> createOrder(OrderRequest orderRequest) {
        return null;
    }
}
