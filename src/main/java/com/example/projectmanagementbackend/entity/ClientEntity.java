package com.example.projectmanagementbackend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "client")
@Getter
@Setter
public class ClientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "client_name", nullable = false, length = 30)
    private String clientName;

    @Column(name = "post_code",length = 20)
    private String postCode;

    @Column(name = "phone",length = 20)
    private Integer phone;

    @Column(name = "fax",length = 20)
    private Integer fax;

    @Column(name = "address",length = 100)
    private String address;

    @Column(name = "note",length = 200)
    private String note;
}
