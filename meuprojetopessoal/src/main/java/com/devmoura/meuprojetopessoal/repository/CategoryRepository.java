package com.devmoura.meuprojetopessoal.repository;
import com.devmoura.meuprojetopessoal.entities.Category;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Component
public class CategoryRepository {
    private static Map<Long, Category> map = new HashMap<>();
    public void save(Category obj) {
        map.put(obj.getId(), obj);

    }

    public Category findId(Long id) {
        return map.get(id);
    }

        public static List<Category> findAll() {
        return new ArrayList<Category>(map.values());
    }
}
