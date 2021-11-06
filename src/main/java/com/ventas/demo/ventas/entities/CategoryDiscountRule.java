package com.ventas.demo.ventas.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "category_discount_rule",
        uniqueConstraints = {@UniqueConstraint(
                columnNames = {"product_category_id", "minquantity", "maxquantity", "discountpercentage"})})
public class CategoryDiscountRule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    @ManyToOne
    @JoinColumn(name = "product_category_id")
    private ProductCategory category;

    @NotBlank
    private Double minQuantity;

    @NotBlank
    private Double maxQuantity;

    @NotBlank
    private Double discountPercentage;
}