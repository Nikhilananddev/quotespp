package com.example.quotesapp.exchanges;


import com.example.quotesapp.Dto.Quote;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostQuoteResponse
{


    private Quote quote;

}
