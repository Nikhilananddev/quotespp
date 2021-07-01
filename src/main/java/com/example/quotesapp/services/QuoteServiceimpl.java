package com.example.quotesapp.services;


import com.example.quotesapp.Dto.Quote;
import com.example.quotesapp.exchanges.GetQuotesResponse;
import com.example.quotesapp.exchanges.PostQuoteResponse;
import com.example.quotesapp.model.QuoteEntity;
import com.example.quotesapp.repositoryservices.QuoteRepositoryService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class QuoteServiceimpl implements QuoteService {

    @Autowired
    private QuoteRepositoryService quoteRepositoryService;


    @Override
    public GetQuotesResponse findAllQuotes() {

        List<Quote> Quotes;
        Quotes=quoteRepositoryService.findAllQuotes();

        GetQuotesResponse response= new GetQuotesResponse(Quotes);
        return response;
    }

    @Override
    public PostQuoteResponse addQuote(QuoteEntity quoteEntity) {


        Quote quote=   quoteRepositoryService.addQuote(quoteEntity);

           PostQuoteResponse postQuoteResponse=new PostQuoteResponse(quote);

        return postQuoteResponse;
    }

    @Override
    public boolean alreadyExist(QuoteEntity quoteEntity) {
        return quoteRepositoryService.checkDuplicateMeme(quoteEntity);
    }
}
