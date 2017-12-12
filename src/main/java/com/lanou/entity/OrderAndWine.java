package com.lanou.entity;

/**
 * Created by lanou on 2017/12/11.
 */
public class OrderAndWine {
    private int order_id;
    private int wine_id;
    private int wine_count;

    public OrderAndWine(int order_id, int wine_id, int wine_count) {
        this.order_id = order_id;
        this.wine_id = wine_id;
        this.wine_count = wine_count;
    }

    @Override
    public String toString() {
        return "OrderAndWine{" +
                "order_id=" + order_id +
                ", wine_id=" + wine_id +
                ", wine_count=" + wine_count +
                '}';
    }

    public int getWine_count() {
        return wine_count;
    }

    public void setWine_count(int wine_count) {
        this.wine_count = wine_count;
    }

    public OrderAndWine() {
        super();
    }


    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getWine_id() {
        return wine_id;
    }

    public void setWine_id(int wine_id) {
        this.wine_id = wine_id;
    }
}
