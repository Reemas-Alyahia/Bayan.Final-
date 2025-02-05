package com.example.bayan.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private LocalDate startDate=LocalDate.now();


    private Integer numberOfOrder;

    private BigDecimal totalPrice;

    private BigDecimal supPrice;

    @Pattern(regexp = "^(Active|Cancelled|Completed)$", message = "Rental Status must be either 'Active', 'Cancelled, or 'Completed'")
    private String status = "Active";

    private BigDecimal priceDelivery;

    private Boolean hasDelivery;

// Relations **

    @ManyToOne
    @JsonIgnore
    private CustomsBroker broker;

    @ManyToOne
    @JsonIgnore
    private Customer customer;


}
