package com.example.lab11.lab12.task3;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByStatusAndOrderDateBetween(String status, LocalDate startDate, LocalDate endDate);
}