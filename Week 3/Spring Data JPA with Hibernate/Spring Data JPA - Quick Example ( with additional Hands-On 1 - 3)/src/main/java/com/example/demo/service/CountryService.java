package com.example.demo.service;

import com.example.demo.model.Country;
import com.example.demo.repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CountryService {
    private final CountryRepository countryRepository;

    public Country addCountry(Country country) {
        return countryRepository.save(country);
    }

    public Country getCountryByCode(String code) {
        return countryRepository.findById(code.toUpperCase())
                .orElseThrow(() -> new RuntimeException("Country not found: " + code));
    }
}
