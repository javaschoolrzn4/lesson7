package ru.rzn.sbt.javaschool.lesson6.map;

import java.util.Map;

public class CountMapImpl<T> implements CountMap<T> {

    private Map store;

    @Override
    public void add(T o) {
        Set s = this.store.keySet();
    }

    @Override
    public int getCount(T o) {
        return 0;
    }

    @Override
    public int remove(T o) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void addAll(CountMap source) {

    }

    @Override
    public Map toMap() {
        return null;
    }

    @Override
    public void toMap(Map destination) {

    }
}
