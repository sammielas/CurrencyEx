package com.example.sammie.currencyex;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by sammie on 10/26/2017.
 */

public class CurrencyAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private List<Currency> currencyList;
    private CurrencyItemClickListener currencyItemClickListener;

    public CurrencyAdapter(Context context, List<Currency> currencyList, CurrencyItemClickListener currencyItemClickListener) {
        this.context = context;
        this.currencyList = currencyList;
        this.currencyItemClickListener = currencyItemClickListener;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return currencyList.size();
    }

    @Override
    public Object getItem(int i) {
        return currencyList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View currencyItemView = layoutInflater.inflate(R.layout.list_activity, null);
        TextView tvName = (TextView) currencyItemView.findViewById(R.id.tvName);
        TextView tvRate = (TextView) currencyItemView.findViewById(R.id.tvRate);

        final Currency c = currencyList.get(i);
        tvName.setText(c.getName());
        tvRate.setText(Double.toString(c.getETH()));

        currencyItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currencyItemClickListener.onCurrencyItemClick(c);
            }
        });
        return currencyItemView;
    }
}

