package org.example.store2.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import java.util.*;

@Data
@Component
@SessionScope
@RequiredArgsConstructor
public class Basket {
    private final List<Integer> goods = new ArrayList<>();

    public Integer add (Integer id) {
        goods.add(id);
        return id;
    }
    public List<Integer> getAll() {
        return new ArrayList<>(goods);
    }
}
