package com.brijesh.ProductService.entity;import jakarta.persistence.*;import lombok.*;@Entity@Table(name = "productEntities")@Getter@Setter@ToString@AllArgsConstructor@NoArgsConstructorpublic class Product {    @Id    @GeneratedValue(strategy = GenerationType.AUTO)    private long id;    private String name;    private String description;    private long price;    private long quantity;}