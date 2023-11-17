package com.example.projectmanagementbackend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
//orderは予約語のため
@Table(name = "order_detail")
@Data
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //進行度
    @Column(name = "progress")
    private Integer progress;

    //納品チェック
    @Column(name = "is_delivery")
    private Boolean isDelivery;

    //納品日
    @Column(name = "delivery_at")
    private Date deliveryAt;

    //受付日
    @Column(name = "reception_at")
    private Date receptionAt;

    @Column(name = "is_payment")
    private Boolean isPayment;

    @OneToOne
    @JoinColumn(name = "item_id")
    private ItemEntity item;

    @OneToOne
    @JoinColumn(name = "manager_id")
    private ManagerEntity manager;

    @ManyToOne
    @JoinColumn(name = "client")
    private ClientEntity client;
}
