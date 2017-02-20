package projet.holo_holo.weeja.controller_view;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

import projet.holo_holo.weeja.R;

public class PackageWeekend extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_package_weekend);
        Button buttonPayer = (Button) findViewById(R.id.buttonValidateWeekend);
        ListView listePackage = (ListView) findViewById(R.id.listViewPackage);

        ArrayList<HashMap<String, String>> listItem = new ArrayList<HashMap<String, String>>();

        HashMap<String, String> map;

        map = new HashMap<String, String>();

        map.put("Nom", "The Inn at Longwood Medical");
        map.put("Adresse", "342 Longwood Avenue, Boston");
        map.put("Rating","Rating: 4.0");
        map.put("Ranking","Ranking: 42 out of 77");
        map.put("Image", String.valueOf(R.drawable.hotel));

        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("Nom", "Chacho's Pizza & Subs");
        map.put("Adresse", "1502 Tremont St, Boston");
        map.put("Rating","Rating: 4.0");
        map.put("Ranking","Ranking: 50 out of 82");
        map.put("Image", String.valueOf(R.drawable.restaurant));

        listItem.add(map);

        map = new HashMap<String, String>();
        map.put("Nom", "Diablo Glass School");
        map.put("Adresse", "123 Terrace Street, Boston");
        map.put("Rating","Rating: 5.0");
        map.put("Ranking","Ranking: 95 out of 139");
        map.put("Image", String.valueOf(R.drawable.activite));

        listItem.add(map);

        SimpleAdapter mSchedule = new SimpleAdapter(this.getBaseContext(), listItem, R.layout.package_weekend_rows,
                new String[] {"Nom", "Adresse", "Rating", "Ranking", "Image"}, new int[] {R.id.textViewNom, R.id.textViewAdresse, R.id.textViewRating, R.id.textViewRanking, R.id.imageViewPackage});


        listePackage.setAdapter(mSchedule);

        listePackage.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {

                if(position == 0){
                    Uri uri = Uri.parse("http://www.tripadvisor.com/Hotel_Review-g60745-d77638-Reviews-mMCID-The_Inn_at_Longwood_Medical-Boston_Massachusetts.html");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else if(position == 1){
                    Uri uri = Uri.parse("http://www.tripadvisor.com/Restaurant_Review-g60745-d4225110-Reviews-mMCID-Chacho_s_Pizza_Subs-Boston_Massachusetts.html");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else if(position == 2){
                    Uri uri = Uri.parse("http://www.tripadvisor.com/Attraction_Review-g60745-d3546275-Reviews-mMCID-Diablo_Glass_School-Boston_Massachusetts.html");
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }

            }
        });

        buttonPayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PackageWeekend.this,PaymentActivity.class);
                startActivity(intent);
            }
        });

    }

}

