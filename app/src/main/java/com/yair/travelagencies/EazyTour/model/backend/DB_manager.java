package com.yair.travelagencies.EazyTour.model.backend;

import android.content.ContentValues;
import android.database.Cursor;

/**
 * Created by Yair on 12/12/2016.
 */

public interface DB_manager
{
    long addUser(ContentValues values);

    long addAgency(ContentValues values);

    long addAttraction(ContentValues values);

    boolean isUpdateAgency();

    boolean isUpdateAttraction();

    Cursor getAgencies();

    Cursor getAttractions();

    Cursor getUsers();

}
