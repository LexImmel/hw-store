package org.example.store2.service;

import lombok.RequiredArgsConstructor;
import org.example.store2.model.Basket;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor


public class BasketService {
    private final Basket basket;

    public void addAll(List<Integer> ids) {
        ids.forEach(basket::add);
    }

    public List<Integer> get() {
        return basket.getAll();
    }
}