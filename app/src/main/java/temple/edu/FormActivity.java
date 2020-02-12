package temple.edu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final View name = findViewById(R.id.editTextName);
        final View email = findViewById(R.id.editTextEmail);
        final View password = findViewById(R.id.editTextPassword);
        final View passwordConf = findViewById(R.id.editTextPasswordConf);

        findViewById(R.id.buttonSave).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name_val = ((EditText) name).getText().toString().trim();
                String email_val = ((EditText) email).getText().toString().trim();
                String pass_val = ((EditText) password).getText().toString().trim();
                String pass_conf_val = ((EditText) passwordConf).getText().toString().trim();

                if( name_val.isEmpty() ||
                        email_val.isEmpty() ||
                        pass_val.isEmpty() ||
                        pass_conf_val.isEmpty() )
                {
                    Toast.makeText(v.getContext(), "Please enter all information.", Toast.LENGTH_SHORT).show();
                    return;
                }

                if( ! pass_val.equals(pass_conf_val) )
                {
                    Toast.makeText(v.getContext(), "Password and Confirm Password do not match.", Toast.LENGTH_SHORT).show();
                    return;
                }

                Toast.makeText(v.getContext(), "Welcome, " + name_val + ", to the SignUpForm App", Toast.LENGTH_LONG).show();

            }
        });
    }
    }


