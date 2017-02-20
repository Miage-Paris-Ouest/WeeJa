package projet.holo_holo.weeja.controller_view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import projet.holo_holo.weeja.R;
import projet.holo_holo.weeja.database.UserManager;
import projet.holo_holo.weeja.model.User;

public class AccountActivity extends AppCompatActivity {

    EditText nbEnfants,budget,destination;
    RadioButton celib,couple;
    Button sauvegarder;
    String email;
    UserManager um = new UserManager(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        couple = (RadioButton) findViewById(R.id.radioButtonCouple);
        celib = (RadioButton) findViewById(R.id.radioButtonCelib);
        sauvegarder = (Button) findViewById(R.id.buttonMesParametres);
        nbEnfants = (EditText) findViewById(R.id.editTextNbEnfants);
        budget = (EditText) findViewById(R.id.editTextBudget);
        destination = (EditText) findViewById(R.id.editTextDestination);

        email = this.getIntent().getStringExtra("EMAIL");

        um.open();

        User u = new User();
        u = um.getUserParams(email);

        if(u.getEmail()!=null){
            nbEnfants.setText(String.valueOf(u.getNbEnfants()));
            budget.setText(String.valueOf(u.getBudget()));
            destination.setText(u.getDestinatioFavorite());

            if(u.getCelibataire() == 1){
                couple.setChecked(true);
            }else{
                celib.setChecked(true);
            }
        }

        um.close();

        couple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               couple.setChecked(true);
                celib.setChecked(false);
            }
        });

        celib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                celib.setChecked(true); couple.setChecked(false);
            }
        });

        sauvegarder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int enfant = Integer.parseInt(nbEnfants.getText().toString());
                int finance = Integer.parseInt(budget.getText().toString());
                String desti = destination.getText().toString();
                Boolean enCouple = true;
                int coupleConversion = 0;

                if(enCouple == true){
                    coupleConversion = 1;
                }else{
                    coupleConversion = 0;
                }

                if(celib.isChecked()){
                    enCouple = false;
                }

                um.open();

                User user = new User();
                user.setEmail(email);
                user.setBudget(finance);
                user.setCelibataire(coupleConversion);
                user.setNbEnfants(enfant);
                user.setDestinatioFavorite(desti);
                um.UpdateUser(user);

                um.close();

                Toast.makeText(getApplicationContext(), "Paramètres enregistrés",
                        Toast.LENGTH_LONG).show();

                Intent intent = new Intent(AccountActivity.this,MenuActivity.class);
                intent.putExtra("EMAIL",email);
                startActivity(intent);
            }
        });
    }
}
