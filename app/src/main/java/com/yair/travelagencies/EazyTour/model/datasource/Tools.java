package com.yair.travelagencies.EazyTour.model.datasource;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;

import com.yair.travelagencies.EazyTour.model.backend.TravelAgenciesContract;
import com.yair.travelagencies.EazyTour.model.entities.Agency;
import com.yair.travelagencies.EazyTour.model.entities.Attraction;
import com.yair.travelagencies.EazyTour.model.entities.User;

import java.util.List;

/**
 * Created by Yair on 19/12/2016.
 */

public class Tools
{
    public static ContentValues AgencyToContentValues(Agency agency) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(TravelAgenciesContract.Agency.AGENCY_ID, agency.getIdAgency());
        contentValues.put(TravelAgenciesContract.Agency.AGENCY_NAME, agency.getNameAgency());
        contentValues.put(TravelAgenciesContract.Agency.AGENCY_ADDRESS, String.valueOf(agency.getAddressAgency()));
        contentValues.put(TravelAgenciesContract.Agency.AGENCY_EMAIL, agency.getEmailAgency());
        contentValues.put(TravelAgenciesContract.Agency.AGENCY_POHNE, String.valueOf(agency.getPhoneAgency()));
        contentValues.put(TravelAgenciesContract.Agency.AGENCY_URL, String.valueOf(agency.getUrlAgency()));

        return contentValues;
    }

    public static ContentValues AttractionsToContentValues(Attraction attraction) {

        ContentValues contentValues = new ContentValues();
        contentValues.put(TravelAgenciesContract.Attraction.AGENCY_ID, attraction.getIdAgency());
        contentValues.put(TravelAgenciesContract.Attraction.ATTRACTION_COST, attraction.getCostOfAttraction());
        contentValues.put(TravelAgenciesContract.Attraction.ATTRACTION_START_DATE, String.valueOf(attraction.getDateOfStartAttraction()));
        contentValues.put(TravelAgenciesContract.Attraction.ATTRACTION_FINISH_DATE, String.valueOf(attraction.getDateOfEndAttraction()));
        contentValues.put(TravelAgenciesContract.Attraction.ATTRACTION_TYPE, String.valueOf(attraction.getTypeOfAttractions()));
        contentValues.put(TravelAgenciesContract.Attraction.ATTRACTION_SUMMERY, attraction.getAttractionSummery());
        contentValues.put(TravelAgenciesContract.Attraction.ATTRACTION_STATE, attraction.getStateName());

        return contentValues;
    }

    public static ContentValues usersToContentValues(User user) {

        ContentValues contentValues = new ContentValues();
        contentValues.put(TravelAgenciesContract.User.USER_ID, user.getUserId());
        contentValues.put(TravelAgenciesContract.User.USER_NAME, user.getUserName());
        contentValues.put(TravelAgenciesContract.User.USER_PASSWORD, user.getPassword());
        return contentValues;
    }

    public static User ContentValuesToUser(ContentValues contentValues) {

        User user = new User();
        user.setUserId(contentValues.getAsLong(TravelAgenciesContract.User.USER_ID));
        user.setUserName(contentValues.getAsString(TravelAgenciesContract.User.USER_NAME));
        user.setPassword(contentValues.getAsString(TravelAgenciesContract.User.USER_PASSWORD));

        return user;
    }

    public static Agency ContentValuesToAgency(ContentValues values) {
        Agency agency = new Agency();
        agency.setIdAgency(values.getAsLong(TravelAgenciesContract.Agency.AGENCY_ID));
        agency.setNameAgency(values.getAsString(TravelAgenciesContract.Agency.AGENCY_NAME));
        agency.setAddressAgency((Agency.Address)values.get(TravelAgenciesContract.Agency.AGENCY_ADDRESS));
        agency.setEmailAgency(values.getAsString(TravelAgenciesContract.Agency.AGENCY_EMAIL));
        agency.setPhoneAgency(Long.parseLong(values.getAsString(TravelAgenciesContract.Agency.AGENCY_POHNE)));
        agency.setUrlAgency(values.getAsString(TravelAgenciesContract.Agency.AGENCY_URL));

        return agency;
    }

    public static Attraction ContentValuesToAttraction(ContentValues values) {
        Attraction attraction = new Attraction();
        attraction.setIdAgency(values.getAsLong(TravelAgenciesContract.Attraction.AGENCY_ID));
        attraction.setTypeOfAttractions((Attraction.AttractionEnum)values.get(TravelAgenciesContract.Attraction.ATTRACTION_TYPE));
        attraction.setAttractionSummery(values.getAsString(TravelAgenciesContract.Attraction.ATTRACTION_SUMMERY));
        attraction.setCostOfAttraction(Long.parseLong(values.getAsString(TravelAgenciesContract.Attraction.ATTRACTION_COST)));
        attraction.setDateOfEndAttraction(values.getAsString(TravelAgenciesContract.Attraction.ATTRACTION_FINISH_DATE));
        attraction.setDateOfStartAttraction(values.getAsString(TravelAgenciesContract.Attraction.ATTRACTION_START_DATE));
        attraction.setStateName(values.getAsString(TravelAgenciesContract.Attraction.ATTRACTION_STATE));

        return attraction;
    }


    public static Cursor AgenciesListToCursor(List<Agency> agencies) {
        String[] columns = new String[]
                {
                        TravelAgenciesContract.Agency.AGENCY_ID,
                        TravelAgenciesContract.Agency.AGENCY_NAME,
                        TravelAgenciesContract.Agency.AGENCY_ADDRESS,
                        TravelAgenciesContract.Agency.AGENCY_EMAIL,
                        TravelAgenciesContract.Agency.AGENCY_POHNE,
                        TravelAgenciesContract.Agency.AGENCY_URL
                };

        MatrixCursor matrixCursor = new MatrixCursor(columns);

        for (Agency a : agencies) {
            matrixCursor.addRow(new Object[]{a.getIdAgency(), a.getNameAgency(), a.getAddressAgency(),
                    a.getEmailAgency(), a.getPhoneAgency(), a.getUrlAgency()});
        }
        return matrixCursor;
    }

    public static Cursor AttractionsListToCursor(List<Attraction> attractions) {
        String[] columns = new String[]
                {
                        TravelAgenciesContract.Attraction.AGENCY_ID,
                        TravelAgenciesContract.Attraction.ATTRACTION_TYPE,
                        TravelAgenciesContract.Attraction.ATTRACTION_START_DATE,
                        TravelAgenciesContract.Attraction.ATTRACTION_FINISH_DATE,
                        TravelAgenciesContract.Attraction.ATTRACTION_STATE,
                        TravelAgenciesContract.Attraction.ATTRACTION_COST,
                        TravelAgenciesContract.Attraction.ATTRACTION_SUMMERY,
                };

        MatrixCursor matrixCursor = new MatrixCursor(columns);

        for (Attraction a : attractions) {
            matrixCursor.addRow(new Object[]{a.getIdAgency(), a.getTypeOfAttractions(),
                    a.getDateOfStartAttraction(), a.getDateOfEndAttraction(), a.getStateName(),
                    a.getCostOfAttraction(), a.getAttractionSummery()});
        }

        return matrixCursor;
    }

    public static Cursor UsersListToCursor(List<User> users) {
        String[] columns = new String[]
                {
                        TravelAgenciesContract.User.USER_ID,
                        TravelAgenciesContract.User.USER_NAME,
                        TravelAgenciesContract.User.USER_PASSWORD
                };

        MatrixCursor matrixCursor = new MatrixCursor(columns);

        for (User u : users) {
            matrixCursor.addRow(new Object[]{u.getUserId(), u.getUserName(), u.getPassword()});
        }

        return matrixCursor;
    }
}
