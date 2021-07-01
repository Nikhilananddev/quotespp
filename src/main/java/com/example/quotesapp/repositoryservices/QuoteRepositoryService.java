package com.example.quotesapp.repositoryservices;



import com.example.quotesapp.Dto.Quote;
import com.example.quotesapp.model.QuoteEntity;

import java.util.List;

public interface QuoteRepositoryService {

    List<Quote> findAllQuotes();
  Quote addQuote(QuoteEntity quoteEntity);

    Boolean checkDuplicateMeme(QuoteEntity quoteEntity );

}
