package com.example.recetario;


import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyHolder> {

    private Context mContext;
    private List<Recetas> mData;

    public RecyclerViewAdapter(Context mContext, List<Recetas> mData){
        this.mContext = mContext;
        this.mData = mData;
    }



    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view ;
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        view = layoutInflater.inflate(R.layout.cardview_recetario,viewGroup,false);
        return  new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyHolder myHolder, final int i) {

        myHolder.tituloReceta.setText(mData.get(i).getNombreReceta());
        myHolder.img_receta_thumbnail.setImageResource(mData.get(i).getThumbnail());
        myHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, RecetasActivity.class);

                intent.putExtra("RecipeName",mData.get(i).getNombreReceta());
                intent.putExtra("RecipeIngredients",mData.get(i).getingredientesRecetas());
                intent.putExtra("RecipeMethodTitle",mData.get(i).getPreparacion());
                intent.putExtra("Recipe",mData.get(i).getReceta());
                intent.putExtra("Thumbnail",mData.get(i).getThumbnail());

                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {

        TextView tituloReceta;
        CardView cardView;
        ImageView img_receta_thumbnail;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            tituloReceta = (TextView)itemView.findViewById(R.id.receta_text);
            img_receta_thumbnail = (ImageView)itemView.findViewById(R.id.receta_img_id);
            cardView = (CardView)itemView.findViewById(R.id.cardview_id);


        }
    }
}
