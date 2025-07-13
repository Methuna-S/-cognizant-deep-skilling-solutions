package com.cognizant.spring_learn;

import com.cognizant.spring_learn.model.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.logging.Logger;

public class SpringLearnApplication {

    private static final Logger LOGGER = Logger.getLogger(SpringLearnApplication.class.getName());

    public static void main(String[] args) {
        LOGGER.info("START");
        displayCountries();
        LOGGER.info("END");
    }

    public static void displayCountries() {
        LOGGER.info("START - displayCountries");

        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        List<Country> countries = (List<Country>) context.getBean("countryList");

        for (Country country : countries) {
            LOGGER.info(country.toString());
        }

        LOGGER.info("END - displayCountries");
    }
}
