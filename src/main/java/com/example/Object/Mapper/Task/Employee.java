package com.example.Object.Mapper.Task;

import lombok.Data;

import jakarta.persistence.*;

@Entity
@Table
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String username;
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;
}
