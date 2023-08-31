package com.example.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Unit")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Unit_model {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id",nullable = false)
    private long id;

    @Column(name = "Unit_name" , nullable = false)
    private String unit_name;
}
