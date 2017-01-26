package projet.holo_holo.weeja.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import projet.holo_holo.weeja.model.User;

/**
 * Created by Alex on 09/11/2016.
 */

public class UserManager {

    private static final String TABLE_NAME = "user";
    public static final String EMAIL ="email";
    public static final String PASSWORD="password";
    public static final String CREATE_TABLE_USER = "CREATE TABLE "+TABLE_NAME+
            " (" +
            " "+EMAIL+" VARCHAR primary key," +
            " "+PASSWORD+" TEXT" +
            ");";
    private MySQLite maBaseSQLite; // notre gestionnaire du fichier SQLite
    private SQLiteDatabase db;

    // Constructeur
    public UserManager(Context context)
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

    public long AddUser(User user) {
        // Ajout d'un enregistrement dans la table

        ContentValues values = new ContentValues();
        values.put(EMAIL, user.getEmail());
        values.put(PASSWORD, user.getPassword());

        // insert() retourne l'id du nouvel enregistrement inséré, ou -1 en cas d'erreur
        return db.insert(TABLE_NAME,null,values);
    }

    public int UpdateUser (User user) {
        // modification d'un enregistrement
        // valeur de retour : (int) nombre de lignes affectées par la requête

        ContentValues values = new ContentValues();
        values.put(PASSWORD, user.getPassword());

        String where = EMAIL+" = ?";
        String[] whereArgs = {user.getEmail()+""};

        return db.update(TABLE_NAME, values, where, whereArgs);
    }

    public int DeleteUser(User user) {
        // suppression d'un enregistrement
        // valeur de retour : (int) nombre de lignes affectées par la clause WHERE, 0 sinon

        String where = EMAIL+" = ?";
        String[] whereArgs = {user.getEmail()+""};

        return db.delete(TABLE_NAME, where, whereArgs);
    }

    public User getUser(String email) {

        User u = new User();

        Cursor c = db.rawQuery("SELECT * FROM "+TABLE_NAME+" WHERE "+EMAIL+" LIKE "+"'"+email+"'", null);
        if (c.moveToFirst()) {
            u.setEmail(c.getString(c.getColumnIndex(EMAIL)));
            u.setPassword(c.getString(c.getColumnIndex(PASSWORD)));
            c.close();
        }

        return u;
    }

    public Cursor getUsers() {
        // sélection de tous les enregistrements de la table
        return db.rawQuery("SELECT * FROM "+TABLE_NAME, null);
    }

}
