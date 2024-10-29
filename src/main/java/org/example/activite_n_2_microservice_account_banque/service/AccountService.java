package org.example.activite_n_2_microservice_account_banque.service;


import org.example.activite_n_2_microservice_account_banque.dto.BankAccountRequestDTO;
import org.example.activite_n_2_microservice_account_banque.dto.BankAccountResponseDTO;


public interface AccountService {
    BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);

    BankAccountResponseDTO updateAccount(String id, BankAccountRequestDTO bankAccountDTO);
}
