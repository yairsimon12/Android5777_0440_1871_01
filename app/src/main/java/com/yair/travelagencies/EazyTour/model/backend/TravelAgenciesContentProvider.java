package com.yair.travelagencies.EazyTour.model.backend;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;

public class TravelAgenciesContentProvider extends ContentProvider {
    public TravelAgenciesContentProvider() {
    }

    DB_manager manager = DBMangerFactory.getManager();
    final String TAG = "HolyDayAdviserContent";


    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        return 0;
    }

    @Override
    public String getType(Uri uri) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public Uri insert(Uri uri, ContentValues values) {
        Log.d(TAG, "insert" + uri.toString());

        String listName = uri.getLastPathSegment();
        long id = -1;
        switch (listName){
            case "users":
                id = manager.addUser(values);
                return ContentUris.withAppendedId(uri, id);
            case "agencies":
                id = manager.addAgency(values);
                return ContentUris.withAppendedId(uri, id);
            case "attractions":
                id = manager.addAttraction(values);
                return ContentUris.withAppendedId(uri, id);
        }
        return null;
    }

    @Override
    public boolean onCreate() {
        return false;
    }

    @Override
    public Cursor query(Uri uri, String[] projection, String selection,
                        String[] selectionArgs, String sortOrder) {
        Log.d(TAG, "query" + uri.toString());

        String listName = uri.getLastPathSegment();
        long id = -1;
        switch (listName) {
            case "users":
                return manager.getUsers();
            case "agencies":
                return manager.getAgencies();
            case "attractions":
                return manager.getAttractions();
        }
        return null;
    }

    @Override
    public int update(Uri uri, ContentValues values, String selection,
                      String[] selectionArgs) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public boolean isUpdateAgency()
    {
        return manager.isUpdateAgency();
    }

    public boolean isUpdateAttraction()
    {
        return manager.isUpdateAttraction();
    }
}
