package com.SpringBootMicroservice.stockApplication.dbservice.repository;

import com.SpringBootMicroservice.stockApplication.dbservice.model.Quote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 *  JPA handles most of the complexity of JDBC-based database access and object-relational mappings.
 *  On top of that, Spring Data JPA reduces the amount of boilerplate code required by JPA.
 */

public interface QuotesRepository extends JpaRepository<Quote, Integer> {

    List<Quote> findByUserName(String username);
}
