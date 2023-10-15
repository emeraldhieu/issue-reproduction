package com.emeraldhieu.vinci.order.logic.graphql;

import com.emeraldhieu.vinci.order.logic.graphql.types.Order;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import lombok.RequiredArgsConstructor;

@DgsComponent
@RequiredArgsConstructor
public class OrderDataFetcher {

    @DgsQuery
    public Order get(@InputArgument String id) {
        return null;
    }
}
