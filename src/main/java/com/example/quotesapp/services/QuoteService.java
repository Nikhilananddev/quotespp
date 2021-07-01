package com.example.quotesapp.services;


import com.example.quotesapp.exchanges.GetQuotesResponse;
import com.example.quotesapp.exchanges.PostQuoteResponse;
import com.example.quotesapp.model.QuoteEntity;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

public interface QuoteService {
    GetQuotesResponse findAllQuotes();

    PostQuoteResponse addQuote(QuoteEntity quoteEntity);

    public boolean alreadyExist(QuoteEntity quoteEntity);
}