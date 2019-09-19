package com.example.testrecycler;

import android.content.Intent;
import android.icu.text.Transliterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Size;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>{

     ArrayList<String> mylist;
     RecyclerAdapter(ArrayList<String>list){
         mylist = list;
     }
    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item,parent,false);
        RecyclerViewHolder holder = new RecyclerViewHolder(v);
        return  holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, final int position) {

      String name = mylist.get(position);
      holder.btnd.setText(name);
      final Button btnd = holder.btnd;


       btnd.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
            switch (position){
                case 0:
                    Intent intentp = new Intent(btnd.getContext(),ProfileActivity.class);
                    btnd.getContext().startActivity(intentp);
                    break;

                case 1:
                    Intent intentd = new Intent(btnd.getContext(),DialActivity.class);
                    btnd.getContext().startActivity(intentd);
                    break;

            }


           }
       });
    }

    @Override
    public int getItemCount() {
        int listSize = mylist.size();

        return listSize ;
    }

    class RecyclerViewHolder extends RecyclerView.ViewHolder{
        Button btnd;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);

            btnd = itemView.findViewById(R.id.btnitem);
            int potision =getAdapterPosition();


        }
    }



}
