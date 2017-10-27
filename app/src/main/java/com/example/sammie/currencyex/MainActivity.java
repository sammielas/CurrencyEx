package com.example.sammie.currencyex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements Callback<ExchangeRate>, CurrencyItemClickListener {

    private ListView lvCurrency;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvCurrency = (ListView) findViewById(R.id.lvCurrency);
    }

    @Override
    protected void onStart() {
        super.onStart();
        loadCurrencyExchangeData();
    }

    private void loadCurrencyExchangeData(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://min-api.cryptocompare.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ExchangeService service = retrofit.create(ExchangeService.class);
        Call<ExchangeRate> call = service.loadExchangeRate();
        call.enqueue(this);
    }

    @Override
    public void onResponse(Call<ExchangeRate> call, Response<ExchangeRate> response) {
        //Toast.makeText(this, response.body().getBase(), Toast.LENGTH_LONG).show();
        ExchangeRate currencyExchange = response.body();
        lvCurrency.setAdapter(new CurrencyAdapter(this, currencyExchange.getCurrencyList(), this));
    }

    @Override
    public void onFailure(Call<ExchangeRate> call, Throwable t) {
        Toast.makeText(this, t.getMessage(), Toast.LENGTH_LONG).show();
    }

    @Override
    public void onCurrencyItemClick(Currency c) {
        //Toast.makeText(this, c.getName(), Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("currency_name", c.getName());
        intent.putExtra("currency_rate", c.getETH());

        startActivity(intent);
    }
}
