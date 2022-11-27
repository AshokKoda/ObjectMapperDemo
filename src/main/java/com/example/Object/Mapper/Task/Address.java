package com.example.Object.Mapper.Task;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String street;
    private String city;
    private String zipcode;
}
