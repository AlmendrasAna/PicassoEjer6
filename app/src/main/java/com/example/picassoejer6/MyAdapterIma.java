package com.example.picassoejer6;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.picassoejer6.databinding.ItemBinding;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MyAdapterIma extends RecyclerView.Adapter<MyAdapterIma.ViewHolder> {
    private List<Fruit> fruitList = new ArrayList<>();

    public void setData(List<Fruit> data) {

        this.fruitList = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemBinding binding = ItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Fruit itemFruit = fruitList.get(position);
        holder.getInfo(itemFruit);
    }

    @Override
    public int getItemCount() {
        return this.fruitList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ItemBinding itemBinding;

        public ViewHolder(ItemBinding binding) {
            super(binding.getRoot());
            itemBinding = binding;
            itemView.setOnClickListener(this);

        }

        public void getInfo(Fruit fruit) {
           Picasso.get()
                    .load(fruit.getUrl())
                   .resize(250, 190)
                    .centerCrop()
                    .into(itemBinding.imageFruit);
             itemBinding.dataTxt.setText(fruit.getName());
            Log.e(TAG, "hola2");
        }

        @Override
        public void onClick(View v) {

            int position = getLayoutPosition();

            Log.e(TAG, "onClick: ");

            Fruit itemFruit = fruitList.get(position);

            Bundle bundle = new Bundle();
            bundle.putString("name", itemFruit.getName());
            bundle.putString("url", itemFruit.getUrl());
            bundle.putString("info", itemFruit.getInfo());

            Navigation.findNavController(itemBinding.getRoot()).navigate(R.id.action_recycleFragment_to_infoFragment, bundle);
        }
    }
}
