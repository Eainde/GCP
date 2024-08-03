package com.eainde.cloud.run.service;

import com.eainde.cloud.run.entity.Order;
import com.eainde.cloud.run.repository.OrderRepository;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
  private final OrderRepository repository;

  OrderService(final OrderRepository repository) {
    this.repository = repository;
  }

  public Order findById(int id) {
    return repository.findById(id);
  }

  public List<Order> findAll() {
    return repository.findAll();
  }

  public void add(Order order) {
    repository.add(order);
  }

  public Order update(Order order) {
    return repository.update(order);
  }
}
