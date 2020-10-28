package com.test.kafkasagapattern.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.test.kafkasagapattern.model.dto.OrderResponseDTO;
import com.test.kafkasagapattern.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderQuery implements GraphQLQueryResolver {

    @Autowired
    private OrderService orderService;

    public List<OrderResponseDTO> getOrdenes() {
        return this.orderService.getAll();
    }


}
