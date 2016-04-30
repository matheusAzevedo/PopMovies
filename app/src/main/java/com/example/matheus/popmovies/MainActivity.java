package com.example.matheus.popmovies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView filme1, filme2, filme3, filme4, filme5, filme6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        filme1 = (ImageView) findViewById(R.id.imageView1);
        filme2 = (ImageView) findViewById(R.id.imageView2);
        filme3 = (ImageView) findViewById(R.id.imageView3);
        filme4 = (ImageView) findViewById(R.id.imageView4);
        filme5 = (ImageView) findViewById(R.id.imageView5);
        filme6 = (ImageView) findViewById(R.id.imageView6);

        filme1.setImageResource(R.drawable.hp);
        filme2.setImageResource(R.drawable.toystory);
        filme3.setImageResource(R.drawable.cargaexplosiva);
        filme4.setImageResource(R.drawable.girlsandglory);
        filme5.setImageResource(R.drawable.malditasorte);
        filme6.setImageResource(R.drawable.silencio);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                if (v.getId() == R.id.imageView1) {
                    Bundle bundle = new Bundle();
                    bundle.putString("Titulo", "Harry Potter e o enigma do príncipe");
                    bundle.putString("Ano", "2009");
                    bundle.putString("Duracao", "2h 33min");
                    bundle.putString("Nota", "7,5");
                    bundle.putString("Descricao", "As Harry Potter begins his sixth year at Hogwarts, he discovers an old book marked as \"the property of the Half-Blood Prince\" and begins to learn more about Lord Voldemort's dark past.");
                    bundle.putString("Trailer", "https://www.youtube.com/watch?v=wgkHfUaG1nI");
                    bundle.putInt("Poster", R.drawable.hp);
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(intent.putExtras(bundle));
                }
                if (v.getId() == R.id.imageView2) {
                    Bundle bundle = new Bundle();
                    bundle.putString("Titulo", "Toy story 3");
                    bundle.putString("Ano", "2010");
                    bundle.putString("Duracao", "1h 43min");
                    bundle.putString("Nota", "8,3");
                    bundle.putString("Descricao", "The toys are mistakenly delivered to a day-care center instead of the attic right before Andy leaves for college, and it's up to Woody to convince the other toys that they weren't abandoned and to return home.");
                    bundle.putString("Trailer", "https://www.youtube.com/watch?v=JcpWXaA2qeg");
                    bundle.putInt("Poster", R.drawable.toystory);
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(intent.putExtras(bundle));
                }
                if (v.getId() == R.id.imageView3) {
                    Bundle bundle = new Bundle();
                    bundle.putString("Titulo", "Carga explosiva 1");
                    bundle.putString("Ano", "2002");
                    bundle.putString("Duracao", "1h 32min");
                    bundle.putString("Nota", "6,8");
                    bundle.putString("Descricao", "Frank is hired to \"transport\" packages for unknown clients and has made a very good living doing so. But when asked to move a package that begins moving, complications arise.");
                    bundle.putString("Trailer", "https://www.youtube.com/watch?v=0poXFSvX0_4");
                    bundle.putInt("Poster", R.drawable.cargaexplosiva);
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(intent.putExtras(bundle));
                }
                if (v.getId() == R.id.imageView4) {
                    Bundle bundle = new Bundle();
                    bundle.putString("Titulo", "Pelas garotas e pela glória");
                    bundle.putString("Ano", "2009");
                    bundle.putString("Duracao", "1h 30min");
                    bundle.putString("Nota", "6,2");
                    bundle.putString("Descricao", "The two most popular guys in high school decide to ditch football camp for cheerleader camp. For the girls and for the glory." );
                    bundle.putString("Trailer", "https://www.youtube.com/watch?v=BVUJS196CdQ");
                    bundle.putInt("Poster", R.drawable.girlsandglory);
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(intent.putExtras(bundle));
                }
                if (v.getId() == R.id.imageView5) {
                    Bundle bundle = new Bundle();
                    bundle.putString("Titulo", "Maldita sorte");
                    bundle.putString("Ano", "2007");
                    bundle.putString("Duracao", "1h 36min");
                    bundle.putString("Nota", "5,6");
                    bundle.putString("Descricao", "In order to keep the woman of his dreams from falling for another guy, Charlie Logan has to break the curse that has made him wildly popular with single women: Sleep with Charlie once, and the next man you meet will be your true love.");
                    bundle.putString("Trailer", "https://www.youtube.com/watch?v=bYo6j9RQ_W0");
                    bundle.putInt("Poster", R.drawable.malditasorte);
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(intent.putExtras(bundle));
                }
                if (v.getId() == R.id.imageView6) {
                    Bundle bundle = new Bundle();
                    bundle.putString("Titulo", "O silêncio dos inocentes");
                    bundle.putString("Ano", "1991");
                    bundle.putString("Duracao", "1h 58min");
                    bundle.putString("Nota", "8,6");
                    bundle.putString("Descricao", "A young F.B.I. cadet must confide in an incarcerated and manipulative killer to receive his help on catching another serial killer who skins his victims.");
                    bundle.putString("Trailer","https://www.youtube.com/watch?v=yPd2oMTmmbo");
                    bundle.putInt("Poster", R.drawable.silencio);
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(intent.putExtras(bundle));
                }
            }
        };

        filme1.setOnClickListener(listener);
        filme2.setOnClickListener(listener);
        filme3.setOnClickListener(listener);
        filme4.setOnClickListener(listener);
        filme5.setOnClickListener(listener);
        filme6.setOnClickListener(listener);

    }
}

