package com.pribus.driver.ui.rating;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pribus.driver.ui.rating.placeholder.PlaceholderContent.PlaceholderItem;
import com.pribus.driver.databinding.FragmentRateEntryBinding;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link PlaceholderItem}.
 * TODO: Replace the implementation with code for your data type.
 */
public class RatingFragmentViewModel extends RecyclerView.Adapter<RatingFragmentViewModel.ViewHolder> {

    private final List<PlaceholderItem> mValues;

    public RatingFragmentViewModel(List<PlaceholderItem> items) {
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(FragmentRateEntryBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mDateView.setText(mValues.get(position).date);
        holder.mTrasaView.setText(mValues.get(position).trasa);
        holder.mPojazdView.setText(mValues.get(position).pojazd);
        holder.mInView.setText(mValues.get(position).in);
        holder.mOutView.setText(mValues.get(position).out);
        holder.mOcenaView.setText(mValues.get(position).ocena);
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView mDateView;
        public final TextView mTrasaView;
        public final TextView mPojazdView;
        public final TextView mInView;
        public final TextView mOutView;
        public final TextView mOcenaView;
        public PlaceholderItem mItem;

        public ViewHolder(FragmentRateEntryBinding binding) {
            super(binding.getRoot());
            mDateView = binding.date;
            mTrasaView = binding.trasa;
            mPojazdView = binding.pojazd;
            mInView = binding.in;
            mOutView = binding.out;
            mOcenaView = binding.ocena;
        }
    }
}