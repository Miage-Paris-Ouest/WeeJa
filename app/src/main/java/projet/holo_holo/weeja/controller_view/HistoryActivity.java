package projet.holo_holo.weeja.controller_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

import projet.holo_holo.weeja.R;

public class HistoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        ListView listeHistorique = (ListView) findViewById(R.id.listViewHistory);

        ArrayList<HashMap<String, String>> listItem = new ArrayList<HashMap<String, String>>();

        HashMap<String, String> map;

        map = new HashMap<String, String>();

        map.put("Date", "01/12/2016");
        map.put("Destination", "à  Boston");
        map.put("Image", String.valueOf(R.drawable.favoriko));

        listItem.add(map);

        map = new HashMap<String, String>();

        map.put("Date", "06/11/2016");
        map.put("Destination", "à  Paris");
        map.put("Image", String.valueOf(R.drawable.favoriko));

        listItem.add(map);

        map = new HashMap<String, String>();

        map.put("Date", "23/09/2016");
        map.put("Destination", "à  New York");
        map.put("Image", String.valueOf(R.drawable.favoriko));

        listItem.add(map);

        map = new HashMap<String, String>();

        map.put("Date", "03/06/2016");
        map.put("Destination", "à  Quito");
        map.put("Image", String.valueOf(R.drawable.favoriko));

        listItem.add(map);

        map = new HashMap<String, String>();

        map.put("Date", "02/03/2016");
        map.put("Destination", "à  Marrakech");
        map.put("Image", String.valueOf(R.drawable.favoriko));

        listItem.add(map);

        map = new HashMap<String, String>();

        map.put("Date", "23/12/2015");
        map.put("Destination", "à  Helsinki");
        map.put("Image", String.valueOf(R.drawable.favoriko));

        listItem.add(map);

        SimpleAdapter mSchedule = new SimpleAdapter(this.getBaseContext(), listItem, R.layout.history_rows,
                new String[] {"Date", "Destination", "Image"}, new int[] {R.id.textViewDate, R.id.textViewDestination, R.id.imageViewHistory});


        listeHistorique.setAdapter(mSchedule);

    }


}
