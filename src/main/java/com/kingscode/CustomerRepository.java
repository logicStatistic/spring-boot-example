package com.kingscode;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository
        extends JpaRepository<Customer, Integer> {
        void deleteAllById(Integer id);
}
