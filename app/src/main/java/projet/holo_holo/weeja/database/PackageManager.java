package projet.holo_holo.weeja.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import projet.holo_holo.weeja.model.User;

import static projet.holo_holo.weeja.database.UserManager.EMAIL;

/**
 * Created by Alex on 01/12/2016.
 */

public class PackageManager {

    private static final String TABLE_NAME = "package";
    public static final String ID ="id";
    public static final String USER="user";
    public static final String DATE = "date";
    public static final String CREATE_TABLE_PACKAGE = "CREATE TABLE "+TABLE_NAME+
            " (" +
            " "+ID+" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
            " "+DATE+" DATETIME," +
            " "+USER+" VARCHAR" +
            ");";
    private MySQLite maBaseSQLite; // notre gestionnaire du fichier SQLite
    private SQLiteDatabase db;

    // Constructeur
    public PackageManager(Context context)
    {
        maBaseSQLite = MySQLite.getInstance(context);
    }

    public void open()
    {
        //on ouvre la table en lecture/écriture
        db = maBaseSQLite.getWritableDatabase();
    }

    public void close()
    {
        //on ferme l'accès à la BDD
        db.close();
    }

    public long AddPackage(User user) {
        // Ajout d'un enregistrement dans la table

        DateFormat date = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Date dateActuelle = Calendar.getInstance().getTime();

        String dateString = date.format(dateActuelle);

        ContentValues values = new ContentValues();
        values.put(USER, user.getEmail());
        values.put(DATE, dateString);

        // insert() retourne l'id du nouvel enregistrement inséré, ou -1 en cas d'erreur
        return db.insert(TABLE_NAME,null,values);
    }



    public Cursor getPackages() {
        // sélection de tous les enregistrements de la table
        return db.rawQuery("SELECT * FROM "+TABLE_NAME, null);
    }
}
