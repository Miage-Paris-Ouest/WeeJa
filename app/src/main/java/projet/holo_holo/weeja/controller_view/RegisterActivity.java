package projet.holo_holo.weeja.controller_view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import projet.holo_holo.weeja.R;
import projet.holo_holo.weeja.database.UserManager;
import projet.holo_holo.weeja.model.User;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        EditText editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        Button buttonRegister = (Button) findViewById(R.id.buttonRegister);

        final String mail = editTextEmail.getText().toString();
        final String password = editTextPassword.getText().toString();

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                User u = new User(mail,password,null);

                if(u.emailValid() && u.passwordValid()){
                    UserManager um = new UserManager(getApplicationContext());
                    um.open();

                    um.AddUser(u);

                    um.close();

                    Toast.makeText(getApplicationContext(), "ACCOUNT RESGISTERED",
                            Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
                    startActivity(intent);
                }
                else if(!u.emailValid() && u.passwordValid()){
                    Toast.makeText(getApplicationContext(), "INVALID EMAIL",
                            Toast.LENGTH_LONG).show();
                }
                else if(u.emailValid()==true && !u.passwordValid()){
                    Toast.makeText(getApplicationContext(), "INVALID PASSWORD",
                            Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "INVALID EMAIL AND PASSWORD",
                            Toast.LENGTH_LONG).show();
                }


            }
        });

    }
}
