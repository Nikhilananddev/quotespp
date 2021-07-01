package com.example.quotesapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

@Data
@Document(collection = "Quotes")
@NoArgsConstructor
@AllArgsConstructor
public class QuoteEntity {
    @Id
    private String  id ;
    @NotNull
    private String quotesType;
    @NotNull

    private String quotesTitle;
    @NotNull

    private  String authorName;
    @NotNull

    private String imageUrl;
}
