package com.example.code.effective.article44;

import java.util.Map;

/**
 * @author dong jing xi
 * @date 2020/5/22 17:25
 **/
@FunctionalInterface
public interface EldestEntryRemovalFunction<K, V> {

    boolean remove(Map<K, V> map, Map.Entry<K, V> eldest);
}
