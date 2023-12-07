package com.management.bookmyshow.models;

import com.management.bookmyshow.enums.PaymentMethodType;
import com.management.bookmyshow.enums.PaymentStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Payment extends BaseModel{

    private String reference;   //banking purpose
    private Double amount;

    @Enumerated
    private PaymentMethodType providerType;

    @Enumerated
    private PaymentStatus status;
}
