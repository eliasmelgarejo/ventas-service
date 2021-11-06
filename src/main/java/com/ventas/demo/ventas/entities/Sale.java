package com.ventas.demo.ventas.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private Date postingDate;

    @NotBlank
    @Size(max = 15)
    @Column(nullable = false, length = 15, unique = true)
    private String number;

    @NotBlank
    @Size(max = 50)
    @Column(nullable = false, length = 50, unique = true)
    private String customer;

    @NotBlank
    private Double totalAmount;

    @OneToMany(mappedBy = "sale", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<SaleDetail> details;

}
