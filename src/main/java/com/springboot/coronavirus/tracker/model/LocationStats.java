package com.springboot.coronavirus.tracker.model;

public class LocationStats {

    private String state;
    private String country;
    private int totalCase;
    private int diffFromPreviousDay;

    public LocationStats(String state, String country, int totalCase, int diffFromPreviousDay) {
        this.state = state;
        this.country = country;
        this.totalCase = totalCase;
        this.diffFromPreviousDay = diffFromPreviousDay;
    }

    public int getDiffFromPreviousDay() {
        return diffFromPreviousDay;
    }

    public void setDiffFromPreviousDay(int diffFromPreviousDay) {
        this.diffFromPreviousDay = diffFromPreviousDay;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getTotalCase() {
        return totalCase;
    }

    public void setTotalCase(int totalCase) {
        this.totalCase = totalCase;
    }
}
