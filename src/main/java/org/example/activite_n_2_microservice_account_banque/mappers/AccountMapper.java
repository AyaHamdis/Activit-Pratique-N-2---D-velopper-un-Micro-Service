package org.example.activite_n_2_microservice_account_banque.mappers;

import org.example.activite_n_2_microservice_account_banque.dto.BankAccountResponseDTO;
import org.example.activite_n_2_microservice_account_banque.entities.BankAccount;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {
    public BankAccountResponseDTO fromBankAccount(BankAccount bankAccount) {
        BankAccountResponseDTO bankAccountResponseDTO = new BankAccountResponseDTO();
        BeanUtils.copyProperties(bankAccount, bankAccountResponseDTO);
        return bankAccountResponseDTO;
    }
}
