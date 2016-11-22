package projet.holo_holo.weeja.controller_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
    }
}
