package com.test.kafkasagapattern.model.dto;

import java.io.Serializable;
import lombok.Data;

@Data
public class OrderRequestDTO implements Serializable{

    private Integer userId;
    private Integer productId;

}
