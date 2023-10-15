package com.emeraldhieu.vinci.order.logic;

import com.emeraldhieu.vinci.order.logic.OrderResponse;
import com.emeraldhieu.vinci.order.logic.OrderRequest;

public interface OrderService {

    OrderResponse create(OrderRequest orderRequest);
}