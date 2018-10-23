package ua.training.model.entity;

import ua.training.view.View;

import static ua.training.view.TextConstantsForResources.*;

public class Address {
    private String indexOfTheCity;
    private String cityName;
    private String streetName;
    private String houseNumber;
    private String flatNumber;

    public Address(){
        indexOfTheCity = NONE;
        cityName = NONE;
        streetName = NONE;
        houseNumber = NONE;
        flatNumber = NONE;
    }

    public Address(String indexOfTheCity, String cityName, String streetName, String houseNumber, String flatNumber) {
        this.indexOfTheCity = indexOfTheCity;
        this.cityName = cityName;
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
    }

    public String getFullAddressInfo(){
        return INDEX + getIndexOfTheCity() + TAB + CITY + getCityName() + TAB + STREET +
                    getStreetName() + TAB + HOUSE + getHouseNumber() + TAB + FLAT + getFlatNumber() + TAB;
    }

    public String getIndexOfTheCity() {
        return indexOfTheCity;
    }

    public void setIndexOfTheCity(String indexOfTheCity) {
        this.indexOfTheCity = indexOfTheCity;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }
}
