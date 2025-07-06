package com.example.demo.repository;

import com.example.demo.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country, String> {

    @Query("SELECT c FROM Country c WHERE c.name LIKE %:keyword%")
    List<Country> findByNameContainingHQL(String keyword);

    @Query(value = "SELECT * FROM country WHERE name LIKE %:keyword%", nativeQuery = true)
    List<Country> findByNameContainingNative(String keyword);
}
