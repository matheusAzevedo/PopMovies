package com.example.matheus.popmovies;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity{

    ImageView poster, trailer;
    TextView titulo, duracao, nota, descricao, ano;
    Button favorito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final Bundle bundle = getIntent().getExtras();

        poster = (ImageView) findViewById(R.id.poster);
        titulo = (TextView) findViewById(R.id.titulo);
        duracao = (TextView) findViewById(R.id.duracao);
        nota = (TextView) findViewById(R.id.nota);
        ano = (TextView) findViewById(R.id.ano);
        trailer = (ImageView) findViewById(R.id.trailer);
        favorito = (Button) findViewById(R.id.favorito);
        descricao = (TextView) findViewById(R.id.descricao);

        poster.setImageResource(bundle.getInt("Poster"));
        titulo.setText(bundle.getString("Titulo"));
        duracao.setText(bundle.getString("Duracao"));
        nota.setText(bundle.getString("Nota"));
        descricao.setText(bundle.getString("Descricao"));
        ano.setText(bundle.getString("Ano"));
        trailer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(bundle.getString("Trailer")));
                startActivity(intent);
            }
        });
        favorito.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!favorito.isSelected()){
                    favorito.setSelected(true);
                }
                else {
                    favorito.setSelected(false);
                }
            }
        });

    }
}
