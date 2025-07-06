package com.example.demo.controller;

import com.example.demo.model.Country;
import com.example.demo.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/countries")
@RequiredArgsConstructor
public class CountryController {

    private final CountryService countryService;

    @PostMapping
    public Country createCountry(@RequestBody Country country) {
        return countryService.addCountry(country);
    }

    @GetMapping
    public List<Country> fetchAllCountries() {
        return countryService.getAllCountries();
    }

    @GetMapping("/{code}")
    public Country fetchByCode(@PathVariable String code) {
        return countryService.getCountryByCode(code);
    }
}
