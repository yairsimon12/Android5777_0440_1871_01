package com.yair.travelagencies.EazyTour.model.entities;


/**
 * Created by Yair on 06/12/2016.
 */
public class Agency {
    protected long idAgency;
    protected String nameAgency;
    protected Address addressAgency;
    protected long phoneAgency;
    protected String emailAgency;
    protected String urlAgency;

    public Agency() {    }

    public Agency(long idAgency, String nameAgency, Address addressAgency, long phoneAgency, String urlAgency, String emailAgency) {

        this.idAgency = idAgency;
        this.nameAgency = nameAgency;
        this.addressAgency = addressAgency;
        this.phoneAgency = phoneAgency;
        this.urlAgency = urlAgency;
        this.emailAgency = emailAgency;
    }

    public Address getAddressAgency() {

        return addressAgency;
    }

    public void setAddressAgency(Address addressAgency) {
        this.addressAgency = addressAgency;
    }

    public long getIdAgency() {
        return idAgency;
    }

    public void setIdAgency(long idAgency) {
        this.idAgency = idAgency;
    }

    public String getNameAgency() {
        return nameAgency;
    }

    public void setNameAgency(String nameAgency) {
        this.nameAgency = nameAgency;
    }

    public String getEmailAgency() {
        return emailAgency;
    }

    public void setEmailAgency(String emailAgency) {
        this.emailAgency = emailAgency;
    }

    public long getPhoneAgency() {
        return phoneAgency;
    }

    public void setPhoneAgency(long phoneAgency) {
        this.phoneAgency = phoneAgency;
    }

    public String getUrlAgency() {
        return urlAgency;
    }

    public void setUrlAgency(String urlAgency) {
        this.urlAgency = urlAgency;
    }


    /**
     * Created by Yair on 19/12/2016.
     */

    public class Address
    {
        char state;
        String city;
        String street;
    }
}
