package com.example.demo.service;

import com.example.demo.model.Country;
import com.example.demo.repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryService {

    private final CountryRepository countryRepository;

    public Country save(Country country) {
        return countryRepository.save(country);
    }

    public List<Country> searchHQL(String keyword) {
        return countryRepository.findByNameContainingHQL(keyword);
    }

    public List<Country> searchNative(String keyword) {
        return countryRepository.findByNameContainingNative(keyword);
    }
}
