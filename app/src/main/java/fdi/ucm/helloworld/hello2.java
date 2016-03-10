package fdi.ucm.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ProgressBar;
import android.widget.TextView;

public class hello2 extends AppCompatActivity {
    private Button boton2;
    private TextView texto2;
    private Chronometer cr;
    private ProgressBar barra;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello2);
        boton2 = (Button) findViewById(R.id.button2);
        texto2 = (TextView) findViewById(R.id.textView2);
        cr = (Chronometer) findViewById(R.id.chronometer);
        barra = (ProgressBar) findViewById(R.id.progressBar);
        boton2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                texto2.append("Hola amigo");
                cr.start();
                barra.setMax(50);
                barra.setVisibility(View.INVISIBLE);
            }
        });
    }
}
