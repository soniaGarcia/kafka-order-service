package com.test.kafkasagapattern.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.test.kafkasagapattern.model.dto.OrderRequestDTO;
import com.test.kafkasagapattern.orderservice.entity.PurchaseOrder;
import com.test.kafkasagapattern.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class OrdenMutation implements GraphQLMutationResolver {

    @Autowired
    private OrderService orderService;

    public PurchaseOrder createOrder(final String userId, final String productId) {
        OrderRequestDTO req  = new OrderRequestDTO();
        req.setProductId(Integer.parseInt(productId));
        req.setUserId(Integer.parseInt(userId));
        PurchaseOrder exito = this.orderService.createOrder(req);
        return exito;
    }
}
