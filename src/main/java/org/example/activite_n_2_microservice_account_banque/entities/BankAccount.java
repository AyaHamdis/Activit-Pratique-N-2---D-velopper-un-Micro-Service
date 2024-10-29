package org.example.activite_n_2_microservice_account_banque.entities;

import jakarta.persistence.*;
import org.example.activite_n_2_microservice_account_banque.enums.AccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data @AllArgsConstructor
@NoArgsConstructor
@Builder
public class BankAccount {
    @Id
    private String id;
    private double balance;
    @Enumerated(EnumType.STRING)
    private AccountType type;
    private String currency;
    private Date createdAt;
    @ManyToOne
    private Customer customer;
}
