package com.example.demo.controller;

import com.example.demo.model.Country;
import com.example.demo.repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/countries")
@RequiredArgsConstructor
public class CountryController {

    private final CountryRepository countryRepository;

    @PostMapping
    public Country addCountry(@RequestBody Country country) {
        return countryRepository.save(country);
    }

    @GetMapping("/by-name")
    public Country getByName(@RequestParam String name) {
        return countryRepository.findByName(name);
    }

    @GetMapping("/search")
    public List<Country> searchByKeyword(@RequestParam String keyword) {
        return countryRepository.findByNameContaining(keyword);
    }

    @GetMapping("/prefix")
    public List<Country> findByPrefix(@RequestParam String prefix) {
        return countryRepository.findByNameStartingWith(prefix);
    }

    @GetMapping("/ignorecase")
    public List<Country> findIgnoreCase(@RequestParam String name) {
        return countryRepository.findByNameIgnoreCase(name);
    }
}
