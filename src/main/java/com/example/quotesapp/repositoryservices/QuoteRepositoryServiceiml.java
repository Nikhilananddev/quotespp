package com.example.quotesapp.repositoryservices;


import org.modelmapper.ModelMapper;

import javax.inject.Provider;

import com.example.quotesapp.Dto.Quote;
import com.example.quotesapp.model.QuoteEntity;
import com.example.quotesapp.repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class QuoteRepositoryServiceiml implements QuoteRepositoryService{

@Autowired
 private QuoteRepository quoteRepository;

    @Autowired
    private Provider<ModelMapper> modelMapperProvider;
    @Override
    public List<Quote> findAllQuotes() {
        ModelMapper modelMapper = modelMapperProvider.get();

        List<Quote> quotes = new ArrayList<Quote>();

        List<QuoteEntity> allQuotes = quoteRepository.findAll();

        System.out.println("allQuotes"+allQuotes);
        for (QuoteEntity restaurant : allQuotes) {

                quotes.add(modelMapper.map(restaurant, Quote.class));

        }
        return quotes;
    }

    @Override
    public Quote addQuote(QuoteEntity quoteEntity) {
        ModelMapper modelMapper = modelMapperProvider.get();
        System.out.println("quoteEntity"+quoteEntity);
        quoteRepository.save(quoteEntity);
        Quote quote= new Quote( );
        quote=modelMapper.map(quoteEntity, Quote.class);
        System.out.println("quote"+quote);
        return quote;
    }

    @Override
    public Boolean checkDuplicateMeme(QuoteEntity quoteEntity) {
        List<Quote> m = quoteRepository.findByQuotesTypeAndQuotesTitleAndAuthorNameAndImageUrl(quoteEntity.getQuotesType(),quoteEntity.getQuotesTitle(),quoteEntity.getAuthorName(),quoteEntity.getImageUrl());

        return !m.isEmpty();
    }
//    @Override
//    public Quote addQuote(String id, String quoteId, String quotesTitle, String authorName, String imageUrl) {
//
//
//        QuoteEntity quoteEntity= new QuoteEntity(id,quoteId,quotesTitle,authorName,imageUrl);
//
//        quoteRepository.save(quoteEntity);
//        Quote quote= new Quote( );
//        quote=modelMapper.map(quoteEntity, Quote.class);
//        return quote;
//    }


}
