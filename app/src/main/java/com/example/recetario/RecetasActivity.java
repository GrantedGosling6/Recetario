package com.example.recetario;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RecetasActivity extends AppCompatActivity {

    private TextView mNombreReceta;
    private TextView mIngredientesReceta;
    private TextView mRecetaMethodTitle;
    private TextView mReceta;
    Button btnCamara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recetario);

        btnCamara = (Button)findViewById(R.id.btnCamara);
        btnCamara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent();
                    intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
                    startActivity(intent);
                }catch (Exception e){
                    e.printStackTrace();
                }


            }
        });

        mNombreReceta = (TextView)findViewById(R.id.text_receta);
        mIngredientesReceta = (TextView)findViewById(R.id.text_ingredientes);
        mRecetaMethodTitle = (TextView)findViewById(R.id.method);
        mReceta = (TextView)findViewById(R.id.receta);

        Intent intent = getIntent();
        String Title = intent.getExtras().getString("RecipeName");
        String Ingredients = intent.getExtras().getString("RecipeIngredients");
        String MethodTitle = intent.getExtras().getString("RecipeMethodTitle");
        String Recipe = intent.getExtras().getString("Recipe");

        mNombreReceta.setText(Title);
        mIngredientesReceta.setText(Ingredients);
        mRecetaMethodTitle.setText(MethodTitle);
        mReceta.setText(Recipe);

    }
}
