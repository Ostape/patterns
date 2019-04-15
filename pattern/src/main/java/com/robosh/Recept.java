package com.robosh;

public class Recept implements Copyable {

    private int year;
    private int month;
    private int day;

    private String doctorName;
    private String patientName;


    public Recept(int year, int month, int day, String doctorName, String patientName) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.doctorName = doctorName;
        this.patientName = patientName;
    }

    @Override
    public String toString() {
        return "Recept{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", doctorName='" + doctorName + '\'' +
                ", patientName='" + patientName + '\'' +
                '}';
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void changeDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Object copy() {
        return (Recept)new Recept(year,month,day,doctorName,patientName);
    }


}