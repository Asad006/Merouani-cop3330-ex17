package org.example;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Asad merouani
 */


import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        App app = new App();

        Boolean k = true;
        int numberOfDrinks=0;
        float alcoholVolume=0;
        float bodyWeight=0;
        String gender="";
        int time=0;

        try {
            bodyWeight = Float.parseFloat(app.getUserInput("Enter your body weight"));
            gender = app.getUserInput("Enter you gender(man or women)");
            numberOfDrinks = Integer.parseInt(app.getUserInput("number of drinks"));
            alcoholVolume = Float.parseFloat(app.getUserInput("the amount of alcohol by volume of the drinks consumed (as a percent)"));
            time = Integer.parseInt(app.getUserInput("the number of hours since your last drink"));

        } catch (Exception e) {
            System.out.println("invalid Entry ");
        }
        PersonInfo person = new PersonInfo(numberOfDrinks,alcoholVolume,bodyWeight,gender,time);

        if (person.getTimeElapsed() != 0) {
            app.getResults(person);
        }
    }

    private void getResults(PersonInfo person) {

        double BAC;
        double r;
        double A;

        A= person.getNumberOfDrinks()* person.getAlcoholVolume()*0.01;

        if(person.getGender().equals("men")){
            r = 0.73;
        }else{
            r= 0.66;
        }
        BAC =(person.getNumberOfDrinks()*5.14/person.getBodyWeight()*r)-0.015*person.getTimeElapsed();

        if (BAC >= 0.08){
            System.out.printf("Your BAC is %.2f\n",BAC);
            System.out.println("It is not legal for you to drive.");
        }
        else {
            System.out.printf("Your BAC is %.2f\n",BAC);
            System.out.println("It is legal for you to drive.");
        }
    }


    public String getUserInput(String s) {
        String input;
        System.out.println(s);
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        return input;
    }
}
