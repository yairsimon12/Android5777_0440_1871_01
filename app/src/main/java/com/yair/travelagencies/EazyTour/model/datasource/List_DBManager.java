package com.yair.travelagencies.EazyTour.model.datasource;

import android.content.ContentValues;
import android.database.Cursor;

import com.yair.travelagencies.EazyTour.model.backend.DB_manager;
import com.yair.travelagencies.EazyTour.model.entities.Agency;
import com.yair.travelagencies.EazyTour.model.entities.Attraction;
import com.yair.travelagencies.EazyTour.model.entities.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yair on 12/12/2016.
 */

public class List_DBManager implements DB_manager {

    static List<Agency> agencies = new ArrayList<>();
    static List<Attraction> attractions = new ArrayList<>();
    static List<User> users = new ArrayList<>();

    static boolean isAgenciesAdded = false;
    static boolean isAttractionsAdded = false;

    @Override
    public long addAgency(ContentValues values)
    {
        Agency agency = Tools.ContentValuesToAgency(values);
        agencies.add(agency);
        return agency.getIdAgency();
    }

    @Override
    public long addAttraction(ContentValues values)
    {
        Attraction attraction = Tools.ContentValuesToAttraction(values);
        attractions.add(attraction);
        return attraction.getIdAgency();
    }

    public long addUser(ContentValues values)
    {
        User user = Tools.ContentValuesToUser(values);
        users.add(user);
        return user.getUserId();
    }

    @Override
    public boolean isUpdateAgency()
    {
        boolean temp = isAgenciesAdded;
        isAgenciesAdded = false;
        return temp;
    }

    @Override
    public boolean isUpdateAttraction()
    {
        boolean temp = isAttractionsAdded;
        isAttractionsAdded = false;
        return temp;
    }

    @Override
    public Cursor getAgencies() {
        return Tools.AgenciesListToCursor(agencies);
    }

    @Override
    public Cursor getAttractions() {
        return Tools.AttractionsListToCursor(attractions);
    }

    @Override
    public Cursor getUsers() {    return Tools.UsersListToCursor(users);    }


}
