package org.example.activite_n_2_microservice_account_banque.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.activite_n_2_microservice_account_banque.enums.AccountType;

import java.util.Date;
@Data @AllArgsConstructor
@NoArgsConstructor @Builder
public class BankAccountResponseDTO {
    private String id;
    private double balance;
    private AccountType type;
    private String currency;
    private Date createdAt;
}
