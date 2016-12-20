package com.yair.travelagencies.EazyTour.model.backend;

import android.net.Uri;

/**
 * Created by Yair on 12/12/2016.
 */

public class TravelAgenciesContract
{
    /**
     * The authority for the contacts provider
     */
    public static final String AUTHORITY = "com.yair.travelagencies";
    /**
     * A content:// style uri to the authority for the contacts provider
     */
    public static final Uri AUTHORITY_URI = Uri.parse("content://" + AUTHORITY);

    public static class User {
        public static final String USER_ID = "_id";
        public static final String USER_NAME = "name";
        public static final String USER_PASSWORD = "password";
        /**
         * The content:// style URI for this table
         */
        public static final Uri URI_AUTHORIZATION = Uri.withAppendedPath(AUTHORITY_URI, "users");
    }

    public static class Agency
    {
        public static final String AGENCY_ID = "_id";
        public static final String AGENCY_NAME = "name";
        public static final String AGENCY_ADDRESS = "address";
        public static final String AGENCY_POHNE = "phone";
        public static final String AGENCY_EMAIL = "email";
        public static final String AGENCY_URL = "url";

        public static final Uri AGENCY_URI = Uri.withAppendedPath(AUTHORITY_URI, "agencies");
    }

    public static class Attraction
    {
        public static final String AGENCY_ID = "_id";
        public static final String ATTRACTION_TYPE = "attractionType";
        public static final String ATTRACTION_START_DATE = "startDate";
        public static final String ATTRACTION_FINISH_DATE = "finishDate";
        public static final String ATTRACTION_COST = "cost";
        public static final String ATTRACTION_SUMMERY = "summery";
        public static final String ATTRACTION_STATE = "state";

        public static final Uri ATTRACTION_URI= Uri.withAppendedPath(AUTHORITY_URI, "attractions");
    }
}

