package com.example.d1;

// Student Name : Ridhwan Salahuddin
// This Lab was done individually

public class BMIModel {

    public static double toDouble(String s)
    {
        return Double.parseDouble(s);
    }

    public static double getBMI(double weight, double height)
    {
        double result = weight / (height * height);
        return result;
    }

    public static String formatBMI(double bmi)
    {
        return String.format("%.1f", bmi);
    }
}
