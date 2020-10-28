package com.test.kafkasagapattern.model.dto;

import com.test.kafkasagapattern.model.enums.OrderStatus;
import java.io.Serializable;
import lombok.Data;

@Data
public class OrderResponseDTO implements Serializable{

    private Integer id;
    private Integer userId;
    private Integer productId;
    private Integer price;
    private OrderStatus status;

}
