package org.example.activite_n_2_microservice_account_banque.repositories;

import org.example.activite_n_2_microservice_account_banque.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
