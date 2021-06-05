package org.example;

public class PersonInfo {
    private int numberOfDrinks;
    private float alcoholVolume;
    private float bodyWeight;
    private String gender;
    private  int timeElapsed;

    public PersonInfo(int numberOfDrinks, float alcoholVolume, float bodyWeight, String gender, int timeElapsed) {
        this.numberOfDrinks = numberOfDrinks;
        this.alcoholVolume = alcoholVolume;
        this.bodyWeight = bodyWeight;
        this.gender = gender;
        this.timeElapsed = timeElapsed;
    }

    public int getNumberOfDrinks() {
        return numberOfDrinks;
    }

    public void setNumberOfDrinks(int numberOfDrinks) {
        this.numberOfDrinks = numberOfDrinks;
    }

    public float getAlcoholVolume() {
        return alcoholVolume;
    }

    public void setAlcoholVolume(float alcoholVolume) {
        this.alcoholVolume = alcoholVolume;
    }

    public float getBodyWeight() {
        return bodyWeight;
    }

    public void setBodyWeight(float bodyWeight) {
        this.bodyWeight = bodyWeight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getTimeElapsed() {
        return timeElapsed;
    }

    public void setTimeElapsed(int timeElapsed) {
        this.timeElapsed = timeElapsed;
    }
}
