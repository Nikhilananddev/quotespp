package com.example.quotesapp.exchanges;


import com.example.quotesapp.Dto.Quote;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetQuotesResponse {

    private List<Quote> quotes;
}
