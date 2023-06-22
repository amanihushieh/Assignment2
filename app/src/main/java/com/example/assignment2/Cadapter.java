package com.example.assignment2;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

public class Cadapter extends RecyclerView.Adapter<Cadapter.ViewHolder> {


    private int[] imageIds;

    public Cadapter(int[] imageIds) {
        this.imageIds = imageIds;
    }


    @Override
    public Cadapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        CardView v = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card_clocks,
                parent,
                false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        CardView cardView = holder.cardView;
        ImageView imageView = (ImageView) cardView.findViewById(R.id.image);
        Drawable dr = ContextCompat.getDrawable(cardView.getContext(), imageIds[position]);
        imageView.setImageDrawable(dr);

        if(position==0){
            cardView.setOnClickListener( new View.OnClickListener(){
                @Override
                public void onClick(View v){

                    Toast.makeText(v.getContext(), "Oops!,you chose the wrong time,try again", Toast.LENGTH_SHORT).show();

                }
            });
        }
        else if(position==1){
            cardView.setOnClickListener( new View.OnClickListener(){
                @Override
                public void onClick(View v){

                    Toast.makeText(v.getContext(), "Oops!,you chose the wrong time,try again", Toast.LENGTH_SHORT).show();

                }
            });
        }
        else{
            cardView.setOnClickListener( new View.OnClickListener(){
                @Override
                public void onClick(View v){

                    Toast.makeText(v.getContext(), "Excellent you chose the correct time!", Toast.LENGTH_SHORT).show();

                }
            });
        }


    }

    @Override
    public int getItemCount() {
        return imageIds.length;
    }




    public static class ViewHolder extends RecyclerView.ViewHolder{
        private CardView cardView;
        public ViewHolder(CardView cardView){
            super(cardView);
            this.cardView = cardView;
        }

    }
}
