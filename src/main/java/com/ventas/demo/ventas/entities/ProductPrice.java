package com.ventas.demo.ventas.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product_price",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"product_id","minquantity","maxquantity", "price"})})
public class ProductPrice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @NotBlank
    private Double minQuantity;

    @NotBlank
    private Double maxQuantity;

    @NotBlank
    private Double price;
}
