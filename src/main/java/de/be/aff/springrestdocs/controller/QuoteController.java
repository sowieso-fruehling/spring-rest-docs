package de.be.aff.springrestdocs.controller;

import de.be.aff.springrestdocs.domain.Quote;
import de.be.aff.springrestdocs.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteController {


    @Autowired
    private QuoteService service;


    @GetMapping("/quote")
    public Quote getQuote()
    {
        Quote quote = service.getQuote();
        return quote;

    }
}
