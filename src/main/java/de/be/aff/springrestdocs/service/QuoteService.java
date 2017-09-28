package de.be.aff.springrestdocs.service;

import de.be.aff.springrestdocs.domain.Quote;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class QuoteService {


    public Quote getQuote()
    {
        return new RestTemplate()
                .getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);

    }


}
