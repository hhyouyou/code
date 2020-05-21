package com.example.code.effective.article33;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author dong jing xi
 * @date 2020/5/19 21:27
 **/
public class Favorites {
    private Map<Class<?>, Object> favorites = new HashMap<>();

    public <T> void putFavorite(Class<T> type, T instance) {
        favorites.put(Objects.requireNonNull(type), instance);
    }

    public <T> T getFavorite(Class<T> type) {
        return type.cast(favorites.get(type));
    }
}
