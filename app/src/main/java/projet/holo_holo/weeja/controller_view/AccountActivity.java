package projet.holo_holo.weeja.controller_view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import projet.holo_holo.weeja.R;

public class AccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        final RadioButton radioButtonCouple = (RadioButton) findViewById(R.id.radioButtonCouple);
        final RadioButton radioButtonCelib = (RadioButton) findViewById(R.id.radioButtonCelib);
        Button buttonSauvegarder = (Button) findViewById(R.id.buttonMesParametres);

        radioButtonCouple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioButtonCelib.setChecked(false);
            }
        });

        radioButtonCelib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioButtonCouple.setChecked(false);
            }
        });

        buttonSauvegarder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AccountActivity.this,MenuActivity.class);
                startActivity(intent);
            }
        });
    }
}
