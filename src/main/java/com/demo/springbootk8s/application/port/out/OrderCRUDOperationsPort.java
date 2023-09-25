package com.demo.springbootk8s.application.port.out;

import com.demo.springbootk8s.application.domain.model.OrderRequest;
import com.demo.springbootk8s.application.domain.model.OrderResponse;

import java.util.List;

public interface OrderCRUDOperationsPort {
    OrderResponse findById(Long id);

    OrderResponse orderInsert(OrderRequest o);

    void insertAll(List<OrderRequest> o);

    boolean delete(Long id);

    boolean update(OrderRequest o, Long id);
}
