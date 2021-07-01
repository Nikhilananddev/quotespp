package com.example.quotesapp.Dto;


//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

//@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor

public class Quote {
    private String  id ;
    public String quotesType;
   public String quotesTitle;
    public  String authorName;
    public String imageUrl;

}
