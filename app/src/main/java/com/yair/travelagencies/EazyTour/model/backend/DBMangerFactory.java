package com.yair.travelagencies.EazyTour.model.backend;

        import com.yair.travelagencies.EazyTour.model.datasource.List_DBManager;

/**
 * Created by Yair on 12/12/2016.
 */

public class DBMangerFactory
{
    static DB_manager manager = null;

    public static DB_manager getManager() {
        if (manager == null)
            manager = new List_DBManager();
        return manager;
    }
}
