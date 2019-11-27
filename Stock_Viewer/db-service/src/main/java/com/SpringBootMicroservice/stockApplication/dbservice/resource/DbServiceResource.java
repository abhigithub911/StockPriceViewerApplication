package com.SpringBootMicroservice.stockApplication.dbservice.resource;

//The rest endpoint which will be exposed, so that other MicroServices can use it.

import com.SpringBootMicroservice.stockApplication.dbservice.model.Quote;
import com.SpringBootMicroservice.stockApplication.dbservice.model.Quotes;
import com.SpringBootMicroservice.stockApplication.dbservice.repository.QuotesRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
//RequestMapping is used to map web requests onto specific handler classes and/or handler methods.
//@RequestMapping can be applied to the controller class as well as methods.
@RequestMapping("/rest/db")
public class DbServiceResource {

    private QuotesRepository quotesRepository;

    //Autowiring
    //Constructor injection
    public DbServiceResource(QuotesRepository quotesRepository) {
        this.quotesRepository = quotesRepository;
    }

    //@GetMapping is specialized version of @RequestMapping annotation that acts as a shortcut for @RequestMapping(method = RequestMethod.GET).
    // @GetMapping annotated methods handle the HTTP GET requests matched with given URI expression.
    @GetMapping("/{username}")
    public List<String> getQuotes(@PathVariable("username") final String username) {
        return getQuotesByUserName(username);
    }

    @PostMapping("/add")
    public List<String> add(@RequestBody final Quotes quotes) {
        quotes.getQuotes()
                .stream()
                .map(quote -> new Quote(quotes.getUsername(), quote))
                .forEach(quote -> quotesRepository.save(quote));

        return getQuotesByUserName(quotes.getUsername());
    }

    @PostMapping("/delete/{username}")
    public List<String> delete(@PathVariable("username") final String username) {
        List<Quote> quotes = quotesRepository.findByUserName(username);
        quotesRepository.deleteAll(quotes);

        return getQuotesByUserName(username);
    }

    private List<String> getQuotesByUserName(@PathVariable("username") String username) {
        return quotesRepository.findByUserName(username)
                .stream()
                .map(Quote::getQuote)
                .collect(Collectors.toList());
    }

}
