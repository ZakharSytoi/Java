package com.example.tacocloud.repository;

import com.example.tacocloud.tacoOrder.TacoOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository
        extends CrudRepository<TacoOrder, Long> {
}

