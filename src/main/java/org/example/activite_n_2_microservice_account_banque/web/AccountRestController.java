package org.example.activite_n_2_microservice_account_banque.web;

import org.example.activite_n_2_microservice_account_banque.dto.BankAccountRequestDTO;
import org.example.activite_n_2_microservice_account_banque.dto.BankAccountResponseDTO;
import org.example.activite_n_2_microservice_account_banque.entities.BankAccount;
import org.example.activite_n_2_microservice_account_banque.mappers.AccountMapper;
import org.example.activite_n_2_microservice_account_banque.repositories.BankAccountRepository;
import org.example.activite_n_2_microservice_account_banque.service.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class AccountRestController {
    private BankAccountRepository bankAccoutRepository;
    private AccountService accountService;
    private AccountMapper accountMapper;

    public AccountRestController(BankAccountRepository bankAccountRepository, AccountService accountService, AccountMapper accountMapper) {
        this.bankAccoutRepository = bankAccountRepository;
        this.accountService = accountService;
        this.accountMapper = accountMapper;
    }
    @GetMapping("/GetBankAccounts")
    public List<BankAccount> bankAccounts() {
        return bankAccoutRepository.findAll();
    }
    @GetMapping("/GetBankAccounts/{id}")
    public BankAccount bankAccount(@PathVariable String id) {
        return bankAccoutRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(String.format("Account %s not found", id)));
    }
    @PostMapping("/SaveBankAccounts")
    public BankAccountResponseDTO saveAccount(@RequestBody BankAccountRequestDTO requestDTO) {
        return accountService.addAccount(requestDTO);
    }
    @PutMapping("/UpdateBankAccounts/{id}")
    public BankAccount updateAccount(@PathVariable String id, @RequestBody BankAccount bankAccount) {
        BankAccount account =  bankAccoutRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(String.format("Account %s not found", id)));
        if(bankAccount.getBalance() !=0) account.setBalance(bankAccount.getBalance());
        if(bankAccount.getType() !=null) account.setType(bankAccount.getType());
        if(bankAccount.getCurrency() !=null) account.setCurrency(bankAccount.getCurrency());
        if(bankAccount.getCreatedAt() !=null) account.setCreatedAt(bankAccount.getCreatedAt());
        return bankAccoutRepository.save(account);
    }
    @DeleteMapping("/DeleteBankAccounts/{id}")
    public void deleteAccount(@PathVariable String id) {
         bankAccoutRepository.deleteById(id);
    }
}
