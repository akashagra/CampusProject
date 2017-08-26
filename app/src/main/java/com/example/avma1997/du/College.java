package com.example.avma1997.du;

import java.util.ArrayList;

/**
 * Created by Avma1997 on 8/7/2017.
 */

public class College {
    String title;
    String logoUrl;
    ArrayList<String> imageUrls;
    ArrayList<Course> courses;
    ArrayList<String> amenities;
    ArrayList<Faculty> faculties;
    ArrayList<String> recruiters;
    ArrayList<Alumni> alumnis;
    String rating;
    String address;
    String phoneNo;
    String emailId;
    String fees;
    String noOfCourses;

    public College(String title, String logoUrl, ArrayList<String> imageUrls, ArrayList<Course> courses, ArrayList<String> amenities, ArrayList<Faculty> faculties, ArrayList<String> recruiters, ArrayList<Alumni> alumnis, String rating, String address, String phoneNo, String emailId, String fees, String noOfCourses) {
        this.title = title;
        this.logoUrl = logoUrl;
        this.imageUrls = imageUrls;
        this.courses = courses;
        this.amenities = amenities;
        this.faculties = faculties;
        this.recruiters = recruiters;
        this.alumnis = alumnis;
        this.rating = rating;
        this.address = address;
        this.phoneNo = phoneNo;
        this.emailId = emailId;
        this.fees = fees;
        this.noOfCourses = noOfCourses;
    }




}
