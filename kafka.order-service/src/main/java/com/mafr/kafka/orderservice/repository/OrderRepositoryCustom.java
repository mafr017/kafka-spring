package com.mafr.kafka.orderservice.repository;

import com.mafr.kafka.orderservice.entity.OrderEntity;

public interface OrderRepositoryCustom {
    void setStatusUser(OrderEntity order);
}
