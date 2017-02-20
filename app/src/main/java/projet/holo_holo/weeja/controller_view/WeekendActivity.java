package projet.holo_holo.weeja.controller_view;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import projet.holo_holo.weeja.R;

public class WeekendActivity extends AppCompatActivity {

    String email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weekend);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        email = this.getIntent().getStringExtra("EMAIL");

        ImageView imageWeekend = (ImageView) findViewById(R.id.cadeau);

        imageWeekend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WeekendActivity.this,PackageWeekend.class);
                intent.putExtra("EMAIL",email);
                startActivity(intent);
            }
        });
    }

}
