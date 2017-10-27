package com.example.sammie.currencyex;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by sammie on 10/25/2017.
 */

public interface ExchangeService {
    @GET("/data/pricemulti?fsyms=ETH&tsyms=BTC,USD,EUR,GBP,NGN,ZAR,SEK,KRW,INR,JPY,NOK,AUD,CAD,CNY,GHS,NZD,QAR,RUB,TRY,JMD,AED")
    Call<ExchangeRate> loadExchangeRate();
}
