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
    public Country addCountry(@RequestBody Country country) {
        return countryService.save(country);
    }


    @GetMapping("/search/hql")
    public List<Country> searchByHQL(@RequestParam String keyword) {
        return countryService.searchHQL(keyword);
    }

    @GetMapping("/search/native")
    public List<Country> searchByNative(@RequestParam String keyword) {
        return countryService.searchNative(keyword);
    }
}
