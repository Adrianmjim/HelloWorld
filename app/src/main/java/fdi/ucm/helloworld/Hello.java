package fdi.ucm.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.view.View.*;

public class Hello extends AppCompatActivity {

    private Button button;
    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        button = (Button) findViewById(R.id.button);
        texto = (TextView) findViewById(R.id.textView);

        button.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                texto.append("holaaaa");

               lanzar();

            }
        });
    }
    private void lanzar() {
        Intent intento = new Intent(this, hello2.class);
        startActivity(intento);
    }

}
