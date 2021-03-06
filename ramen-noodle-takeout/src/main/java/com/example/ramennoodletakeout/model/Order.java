package com.example.ramennoodletakeout.model;

import com.fasterxml.jackson.annotation.JsonIgnore;


import javax.persistence.*;

@Entity
@Table(name = "orders")

public class Order {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String orderSize;
    @Column
    private String specialRequest;
    @Column
    private String name;
    @Column
    private boolean addToFavorites;



    //many orders belong to a user
    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnore

    private User user;



    public Order(Long id, String orderSize, String specialRequest, String name, Boolean addToFavorites) {

        this.id = id;
        this.orderSize = orderSize;
        this.specialRequest = specialRequest;
        this.name = name;
    }

    public Order() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrderSize() {
        return orderSize;
    }

    public void setOrderSize(String orderSize) {
        this.orderSize = orderSize;
    }

    public String getSpecialRequest() {
        return specialRequest;
    }

    public void setSpecialRequest(String specialRequest) {
        this.specialRequest = specialRequest;
    }

    public boolean isAddToFavorites() {
        return addToFavorites;
    }

    public void setAddToFavorites(boolean addToFavorites) {
        this.addToFavorites = addToFavorites;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderSize ='" + orderSize + '\'' +
                ", specialRequest='" + specialRequest + '\'' +
                ", name='" + name + '\'' +
                '}';
    }


}
