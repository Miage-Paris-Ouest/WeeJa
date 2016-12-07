package projet.holo_holo.weeja.controller_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

import projet.holo_holo.weeja.R;

public class FavoriteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);
        ListView listeHistorique = (ListView) findViewById(R.id.listViewFavorite);

        ArrayList<HashMap<String, String>> listItem = new ArrayList<HashMap<String, String>>();

        HashMap<String, String> map;

        map = new HashMap<String, String>();

        map.put("Date", "01/12/2016");
        map.put("Destination", "à  Boston");
        map.put("Image", String.valueOf(R.drawable.favoriok));

        listItem.add(map);

        map = new HashMap<String, String>();

        map.put("Date", "23/09/2016");
        map.put("Destination", "à  New York");
        map.put("Image", String.valueOf(R.drawable.favoriok));

        listItem.add(map);

        map = new HashMap<String, String>();

        map.put("Date", "23/12/2015");
        map.put("Destination", "à  Helsinki");
        map.put("Image", String.valueOf(R.drawable.favoriok));

        listItem.add(map);

        SimpleAdapter mSchedule = new SimpleAdapter(this.getBaseContext(), listItem, R.layout.favorite_rows,
                new String[] {"Date", "Destination", "Image"}, new int[] {R.id.textViewDateFavorite, R.id.textViewDestinationFavorite, R.id.imageViewFavorite});


        listeHistorique.setAdapter(mSchedule);
    }
}
