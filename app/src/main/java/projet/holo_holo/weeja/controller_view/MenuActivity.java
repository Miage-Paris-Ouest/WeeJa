package projet.holo_holo.weeja.controller_view;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import projet.holo_holo.weeja.R;

public class MenuActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private Toolbar toolbar;
    private DrawerLayout drawer;
    private NavigationView navigationView;
    String email;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        context = getApplicationContext();

        email =  this.getIntent().getStringExtra("EMAIL");


        Bitmap notificationLargeIconBitmap = BitmapFactory.decodeResource(
                context.getResources(),
                R.drawable.avionclef);


        NotificationManager notif;
        notif = (NotificationManager) getApplicationContext().getSystemService(getApplicationContext().NOTIFICATION_SERVICE);

        //Notification notification = new Notification(R.drawable.avion, "OFFRE SPECIALE!!!", System.currentTimeMillis());
        Intent intent = new Intent(getApplicationContext(),PackageWeekend.class);
        PendingIntent contentIntent = PendingIntent.getActivity(this, 0,
                intent, 0);

        Notification.Builder builder = new Notification.Builder(getApplicationContext());
        builder
                .setSmallIcon(R.drawable.avionclef)
                //.setLargeIcon(notificationLargeIconBitmap)
                .setContentTitle("OFFRE SPECIALE WEEJA")
                .setContentText("Profitez-en dès maintenant !!!")
                .setContentIntent(contentIntent)
                .setAutoCancel(true);


        NotificationManager notificationManager =
                (NotificationManager) getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            notificationManager.notify(1, builder.build());
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_weekend) {
            Intent i_weekend = new Intent(getApplicationContext(),WeekendActivity.class);
            i_weekend.putExtra("EMAIL",email);
            startActivity(i_weekend);
        } else if (id == R.id.nav_compte) {
            Intent i_acc = new Intent(getApplicationContext(),AccountActivity.class);
            i_acc.putExtra("EMAIL",email);
            startActivity(i_acc);
        } else if (id == R.id.nav_favoris) {
            Intent i_fav = new Intent(getApplicationContext(),FavoriteActivity.class);
            i_fav.putExtra("EMAIL",email);
            startActivity(i_fav);
        } else if (id == R.id.nav_historique) {
            Intent i_histo = new Intent(getApplicationContext(),HistoryActivity.class);
            i_histo.putExtra("EMAIL",email);
            startActivity(i_histo);
        }else if (id == R.id.nav_deconnection) {
            Intent i_accueil = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(i_accueil);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
