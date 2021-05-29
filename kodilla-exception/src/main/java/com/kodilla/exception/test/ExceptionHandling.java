package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge challenge = new SecondChallenge();

        try{
            String task = challenge.probablyIWillThrowException(2, 5);
        } catch(Exception e){
            System.out.println("Something went wrong");
        } finally {
            System.out.println("finally block");
        }
    }
}
