package com.example.full_stack_assessment.Recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.full_stack_assessment.Data.Forecast.Period;
import com.example.full_stack_assessment.ForecastActivity;
import com.example.full_stack_assessment.R;


import java.util.List;

public class PeriodAdapter extends RecyclerView.Adapter<PeriodViewHolder>{
    private final List<Period> periods;
    private final ForecastActivity forecastActivity;


    public PeriodAdapter(List<Period> list, ForecastActivity f) {
        this.periods = list;
        forecastActivity = f;
    }

    @NonNull
    @Override
    public PeriodViewHolder onCreateViewHolder(@NonNull final ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.forecast_card, parent, false);
        return new PeriodViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull PeriodViewHolder holder, int position) {

        holder.time.setText( periods.get(position).getName());
        holder.temp.setText( String.valueOf(periods.get(position).getTemperature()));

        int rId = forecastActivity.forecastToIcon(periods.get(position).getShortForecast());
        if(rId > 0){
            holder.icon.setImageResource(rId);
        }

    }

    @Override
    public int getItemCount() {
        return periods.size();
    }

}