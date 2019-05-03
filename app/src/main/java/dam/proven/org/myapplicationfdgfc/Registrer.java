package dam.proven.org.myapplicationfdgfc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class Registrer extends AppCompatActivity {

    EditText et_username,et_password,et_email;
    Button btn_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        et_username = findViewById(R.id.user);
        et_password = findViewById(R.id.password);
        et_email = findViewById(R.id.email);
        btn_register = findViewById(R.id.reg);
    }
}
