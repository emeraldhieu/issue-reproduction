package com.emeraldhieu.vinci.order.logic;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class DefaultOrderService implements OrderService {

    @Override
    public OrderResponse create(OrderRequest orderRequest) {
        return null;
    }
}
