package com.example.avma1997.du;

/**
 * Created by Avma1997 on 8/7/2017.
 */

class Course {
    String title;
    String year1tutionfees;
    String year2tutionfees;
    String year3tutionfees;
    String year1admissionfees;
    String year2admissionfees;
    String year3admissionfees;
    String year1other;
    String year2other;
    String year3other;
    String year1total;
    String year2total;
    String year3total;
    String grandtotal;

    public Course(String title, String year1tutionfees, String year2tutionfees, String year3tutionfees, String year1admissionfees, String year2admissionfees, String year3admissionfees, String year1other, String year2other, String year3other, String year1total, String year2total, String year3total, String grandtotal) {
        this.title = title;
        this.year1tutionfees = year1tutionfees;
        this.year2tutionfees = year2tutionfees;
        this.year3tutionfees = year3tutionfees;
        this.year1admissionfees = year1admissionfees;
        this.year2admissionfees = year2admissionfees;
        this.year3admissionfees = year3admissionfees;
        this.year1other = year1other;
        this.year2other = year2other;
        this.year3other = year3other;
        this.year1total = year1total;
        this.year2total = year2total;
        this.year3total = year3total;
        this.grandtotal = grandtotal;
    }
}
