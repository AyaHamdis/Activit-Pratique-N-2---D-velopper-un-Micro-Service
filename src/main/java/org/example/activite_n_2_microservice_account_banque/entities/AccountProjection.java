package org.example.activite_n_2_microservice_account_banque.entities;

import org.example.activite_n_2_microservice_account_banque.enums.AccountType;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = BankAccount.class, name = "p1")
public interface AccountProjection {
    public String getId();
    public AccountType getType();
    public double getBalance();
}
