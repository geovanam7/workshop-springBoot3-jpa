package com.project.course.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.project.course.entities.enums.OrderStatus;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "tb-order")
@JsonPropertyOrder({ "id", "moment", "orderStatus", "client", "items", "payment", "total" })
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

@JsonFormat(shape = JsonFormat.Shape.STRING,pattern =  "yyyy-MM-dd 'T' HH:mm:ss 'Z'" , timezone = "GMT")
    private Instant moment;

 private Integer orderStatus;


    @ManyToOne
    @JoinColumn (name = "client_id")
    private Users client ;

    @OneToMany(mappedBy = "id.order")
    private Set<OrderItem> items = new HashSet<>();
    // colecao de itens associado a order

    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL)//mapeando as entidades para ter o mesmo id
    private Payment payment;


    public Order() {
    }

    public Order(Long id, Instant moment, OrderStatus orderStatus, Users client) {
        this.id = id;
        this.moment=moment;
        setOrderStatus(orderStatus);
        this.client=client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public OrderStatus getOrderStatus() {
        return OrderStatus.valueOf(orderStatus);
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        if (orderStatus != null) {
            this.orderStatus = orderStatus.getCode();
        }
    }

    public Users getClient() {
        return client;
    }

    public void setClient(Users client) {
        this.client = client;
    }



    public Set<OrderItem> getItems() {
        return items;
    }

    public void setItems(Set<OrderItem> items) {
        this.items = items;
    }

    public Payment getPaymenyt() {
        return payment;
    }

    public void setPaymenyt(Payment paymenyt) {
        this.payment = paymenyt;
    }


    @JsonProperty("total")

    public Double getTotal(){
        double sum = 0;
        for (OrderItem x: items){
            sum+= x.getSubTotal();
        }
     return sum;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order order)) return false;
        return Objects.equals(getId(), order.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

}
