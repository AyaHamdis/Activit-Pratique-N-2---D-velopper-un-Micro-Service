package org.example.activite_n_2_microservice_account_banque.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.activite_n_2_microservice_account_banque.enums.AccountType;


@Data @AllArgsConstructor
@NoArgsConstructor @Builder
public class BankAccountRequestDTO {
    private double balance;
    private AccountType type;
    private String currency;
}
