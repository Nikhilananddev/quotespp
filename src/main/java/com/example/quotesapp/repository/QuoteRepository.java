package com.example.quotesapp.repository;


import com.example.quotesapp.Dto.Quote;
import com.example.quotesapp.model.QuoteEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.repository.MongoRepository;

import javax.validation.constraints.NotNull;
import java.util.List;

public interface QuoteRepository extends MongoRepository<QuoteEntity, String> {
    public List<Quote> findByQuotesTypeAndQuotesTitleAndAuthorNameAndImageUrl(String quotesType, String quotesTitle, String authorName, String imageUrl);

//
//    @Id
//    private String  id ;
//    @NotNull
//    private String quotesType;
//    @NotNull
//
//    private String quotesTitle;
//    @NotNull
//
//    private  String authorName;
//    @NotNull
//
//    private String imageUrl;
}
