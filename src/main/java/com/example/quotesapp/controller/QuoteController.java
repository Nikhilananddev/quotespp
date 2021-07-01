package com.example.quotesapp.controller;

import com.example.quotesapp.exchanges.GetQuotesResponse;
import com.example.quotesapp.exchanges.PostQuoteResponse;
import com.example.quotesapp.model.QuoteEntity;
import com.example.quotesapp.services.QuoteService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Log4j2
@RequestMapping(QuoteController.Quotes_API_ENDPOINT)
public class QuoteController {


    public static final String Quotes_API_ENDPOINT = "/Quotes/v1";
    public static final String Quotes_API = "/Quotes";
    public static final String Add_Quotes = "/addQuotes";

    public static final String Quotes_API_KEY = "de1964b7-5004-4fe3-aeaa-27bec5bdbebc";



    @Autowired
    private QuoteService quoteService;
    @GetMapping(Quotes_API)
    public ResponseEntity<GetQuotesResponse> GetQuotes(@RequestParam String key
      ) {
        System.out.println(key);

if(!key.equals(Quotes_API_KEY))
{
              return ResponseEntity.badRequest().body(null);

}
        try{
            GetQuotesResponse getQuotesResponse;
            getQuotesResponse =  quoteService.findAllQuotes();
            return ResponseEntity.ok().body(getQuotesResponse);


        }catch (Exception e)
        {
            return ResponseEntity.badRequest().body(null);
        }
//        log.info("getRestaurants called with {}", getRestaurantsRequest);


        //CHECKSTYLE:OFF






//if(HttpStatus.values())




//            return ResponseEntity.badRequest().body(null);















    }

//    @GetMapping()
//    public ResponseEntity<Object>print(){
//        return ResponseEntity.ok().body("Hello world");
//    }

    @PostMapping(QuoteController.Add_Quotes)
    public ResponseEntity<Object>addQuotes ( @RequestBody QuoteEntity quote)
    {

        if (quoteService.alreadyExist(quote)) {
            return ResponseEntity.status(409).body("content already exists");
        }
//        System.out.println("Controller");
//        System.out.println("Controller"+quote);
        PostQuoteResponse postQuoteResponse;
        postQuoteResponse =quoteService.addQuote(quote);
        return ResponseEntity.ok().body(postQuoteResponse);
    }




}
