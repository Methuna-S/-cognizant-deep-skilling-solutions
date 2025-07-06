package com.example.demo.repository;

import com.example.demo.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country, String> {

    Country findByName(String name);

    List<Country> findByNameContaining(String keyword);

    List<Country> findByNameStartingWith(String prefix);

    List<Country> findByNameEndingWith(String suffix);

    List<Country> findByNameIgnoreCase(String name);
}