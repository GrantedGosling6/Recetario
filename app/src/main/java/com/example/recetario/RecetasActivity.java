package com.example.recetario;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;

public class RecetasActivity extends AppCompatActivity {


    private TextView mNombreReceta;
    private TextView mIngredientesReceta;
    private TextView mRecetaMethodTitle;
    private TextView mReceta;
    Button btnCamara;
    ImageView imageView;



    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==101){
            Bitmap bitmap= (Bitmap) data.getExtras().get("data");
            imageView.setImageBitmap(bitmap);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recetario);
        imageView=findViewById(R.id.imgView);

        btnCamara = (Button)findViewById(R.id.btnCamara);

        if(ContextCompat.checkSelfPermission(RecetasActivity.this, Manifest.permission.CAMERA) !=
                PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(RecetasActivity.this, new String[]{Manifest.permission.CAMERA},101);

        }


        btnCamara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, 101 );

              /*  try{
                    Intent intent = new Intent();
                    intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
                    startActivity(intent);

                }catch (Exception e){
                    e.printStackTrace();
                }*/


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
