package br.com.itb.caixadedialogoimagemviewradiobutton;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    RadioButton rbChocolate, rbAipim, rbLimao;
    Button btnQuemSomos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        inicializarComponentes();





    }





    public void caixaDialog(String titulo,String info) {
        AlertDialog.Builder quemSomos = new AlertDialog.Builder(MainActivity.this);

        quemSomos.setTitle(titulo);
        quemSomos.setTitle(info);

        quemSomos.setCancelable(false);





        /*quemSomos.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });*/





        quemSomos.setNegativeButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
                Toast.makeText(MainActivity.this, "Compra Iniciada", Toast.LENGTH_SHORT).show();
            }
        });

        quemSomos.setPositiveButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
                Toast.makeText(MainActivity.this, "Fechou", Toast.LENGTH_SHORT).show();
            }
        });







        quemSomos.create().show();

        btnQuemSomos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                caixaDialog("Q u e m   S o m o s",

                        "Nós fazemos os melhores BOLOS da região\n" +
                        "Venha conferir\nFazemos entregas\nExperimente nossa degustação\n" +
                        "Aceitamos todos os cartões\n\nApós selecionar um  bolo clique na imagem");
            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rbChocolate.isChecked()){
                    caixaDialog("BOLO DE CHOCOLATE", "Bolo com Chocolate Derretido\n" +
                            "Sempre cpmbina com Café!!!!");
                }else if (rbLimao.isChecked()){
                    caixaDialog("BOLO DE LIMÃO", "Delicioso bolo com raspas de Limão\n" +
                            "Experimente e não vai fazer cara Feia!!!!");
                }else if (rbAipim.isChecked()){
                    caixaDialog("BOLO DE AIPIM'ssss", "O fabuloso bolo de Mandioca!!!!");
                }
            }
        });

        rbChocolate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.swede_cakes_2123191_640);
            }
        });

        rbLimao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.lemon_cake_715944_640);
            }
        });

        rbAipim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.muffin_3510308_1920_cupcake);
            }
        });


    }












    private void inicializarComponentes() {
        imageView = findViewById(R.id.imageView);
        rbChocolate = findViewById(R.id.rbChocolate);
        rbAipim = findViewById(R.id.rbAipim);
        rbLimao = findViewById(R.id.rbLimao);
        btnQuemSomos = findViewById(R.id.btnQuemSomos);

        rbChocolate.setChecked(true);
        imageView.setImageResource(R.drawable.swede_cakes_2123191_640);



    }

}