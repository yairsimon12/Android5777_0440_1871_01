package com.yair.travelagencies.EazyTour.model.entities;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Yair on 06/12/2016.
 */
public class Attraction {

    public enum AttractionEnum{hotelDeal, travelAgency, entertainmentShow, airline};


    protected AttractionEnum typeOfAttractions;
    protected String stateName;
    protected Calendar dateOfStartAttraction;
    protected Calendar dateOfEndAttraction;
    protected float costOfAttraction;
    protected String attractionSummery;
    protected long idAgency;
    protected Calendar cal;

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public Calendar getDateOfEndAttraction() {
        return dateOfEndAttraction;
    }

    public void setDateOfEndAttraction(String stringDateOfEndAttraction) {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        // dateOfEndAttraction  = Calendar.getInstance();
        //dateOfEndAttraction.setTime(df.parse(stringDateOfEndAttraction));
    }

    public Calendar getDateOfStartAttraction() {
        return dateOfStartAttraction;
    }

    public void setDateOfStartAttraction(String DateOfStartAttraction) {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        // dateOfStartAttraction = Calendar.getInstance();
        // dateOfStartAttraction.setTime(df.parse(DateOfStartAttraction));
    }

    public float getCostOfAttraction() {
        return costOfAttraction;
    }

    public void setCostOfAttraction(float costOfAttraction) {
        this.costOfAttraction = costOfAttraction;
    }

    public String getAttractionSummery() {
        return attractionSummery;
    }

    public void setAttractionSummery(String attractionSummery) {
        this.attractionSummery = attractionSummery;
    }

    public long getIdAgency() {
        return idAgency;
    }

    public void setIdAgency(long idAgency) {
        this.idAgency = idAgency;
    }

    public Calendar getCal() {
        return cal;
    }

    public void setCal(Calendar cal) {
        this.cal = cal;
    }

    public AttractionEnum getTypeOfAttractions() {
        return typeOfAttractions;
    }

    public void setTypeOfAttractions(AttractionEnum attractions) {
        this.typeOfAttractions = attractions;
    }
}

