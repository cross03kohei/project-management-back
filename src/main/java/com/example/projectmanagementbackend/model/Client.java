package com.example.projectmanagementbackend.model;

import lombok.Data;

@Data
public class Client {
    private long id;
    private String clientName;
    private String address;
    private String postCode;
    private Integer fax;
    private Integer phone;
    private String note;
}
