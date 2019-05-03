package dam.proven.org.myapplicationfdgfc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button tv_register;
    View.OnClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        tv_register = findViewById(R.id.angry_btn2);
        prepareListener();
        tv_register.setOnClickListener(listener);
    }

    public void prepareListener() {

        listener = new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (view.getId() == R.id.angry_btn2) {
                    obreRegister();
                }
            }
        };
    }

    public void obreRegister() {
        startActivity(new Intent(MainActivity.this, Registrer.class));
    }
}
