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
                columnNames = {"product_category_id", "min_quantity", "max_quantity"})})
public class CategoryDiscountRule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_category_id")
    private ProductCategory category;

    @Column(name = "min_quantity")
    private Double minQuantity;

    @Column(name = "max_quantity")
    private Double maxQuantity;

    @Column(name = "discount_percentage")
    private Double discountPercentage;
}
