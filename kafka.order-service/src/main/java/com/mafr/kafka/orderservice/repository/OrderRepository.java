package com.mafr.kafka.orderservice.repository;

import com.mafr.kafka.orderservice.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
    @Transactional
    @Modifying
    @Query(value = "Update orders Set status_user = :statusUser Where id = :idUser", nativeQuery = true)
    void setStatusUser(@Param("idUser") Long id, @Param("statusUser") String status);

//    @Modifying
//    @Query("Update orders Set status_order = ?2 Where id = ?1")
//    Long setStatusOrder(Long id, String status);
}
