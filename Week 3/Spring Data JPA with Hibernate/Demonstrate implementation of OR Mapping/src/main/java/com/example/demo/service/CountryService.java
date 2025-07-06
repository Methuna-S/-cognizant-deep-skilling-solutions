package com.example.demo.service;

import com.example.demo.model.City;
import com.example.demo.model.Country;
import com.example.demo.repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryService {

    private final CountryRepository countryRepository;

    public Country addCountry(Country country) {
        if (country.getCities() != null) {
            for (City city : country.getCities()) {
                city.setCountry(country);
            }
        }
        return countryRepository.save(country);
    }

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    public Country getCountryByCode(String code) {
        return countryRepository.findById(code).orElse(null);
    }
}
