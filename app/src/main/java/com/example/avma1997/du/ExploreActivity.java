package com.example.avma1997.du;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;


import com.ramotion.foldingcell.FoldingCell;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class ExploreActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    RecyclerAdapter mAdapter;
    int noOfTasks = 4;
    int noOfTasksHansraj=1;
    int noOfcolleges=3;
    ArrayList<Course> coursesArrayList;
    String hindutitle;
    String srccUrl;
    ArrayList<String> hinduimageUrls;
    ArrayList<Course> hinducourses;
    ArrayList<String> hinduamenities;
    ArrayList<Faculty> hindufaculties;
    ArrayList<String> hindurecruiters;
    ArrayList<Alumni> hindualumnis;
    String hinduaddress;
    String hinduphoneNo;
    String hinduemailId;
    ArrayList<Faculty> hansrajfaculties;
    String hansrajtitle;
    ArrayList<String> hansrajImages;
    ArrayList<String> hansrajamenities;
    ArrayList<String> hansrajrecruiters;
    ArrayList<Alumni> hansrajalumnis;
    String hansrajaddress;
    String hansrajphoneNo;
    String hansrajemailId;
    String srccTitle;
    ArrayList<String> srccImages;
    String srccaddress;
    String srccphoneNo;
    String srccemailId;
    ArrayList<Faculty> srccfaculty;
    ArrayList<String> srccAmenities;
    ArrayList<String> srccrecruiters;
    ArrayList<Alumni> srccAlumni;
    int noOfTasksSrcc=3;
    String drcTitle;
    ArrayList<String> drcImages;
    String drcAddress;
    String drcContactno;
    String drcEmailId;
    ArrayList<String> drcAmenities;
    ArrayList<College> colleges;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);
        Log.i("reach","coming");
        colleges = new ArrayList<>();
        
        String[] titles = new String[]{"st-stephens-college-delhi", "hindu-college-delhi", "shri-ram-college-of-commerce-srcc-delhi", "daulat-ram-college-delhi", "indraprastha-college-for-women-delhi", "kirori-mal-college-delhi", "ramjas-college-delhi", "hansraj-college", "miranda-house-delhi", "shivaji-college"};
//        HinducollegeDetails();
 mRecyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        mAdapter = new RecyclerAdapter(this, colleges, new RecyclerAdapter.CollegesClickListener() {
            @Override

            public void onItemClick(View view, int position) {
                final FoldingCell foldingCell = (FoldingCell)view.findViewById(R.id.folding_cell);
                foldingCell.toggle(false);


            }


        });


        mRecyclerView.setAdapter(mAdapter);


        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        DividerItemDecoration decoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        mRecyclerView.addItemDecoration(decoration);

        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        SRCCcollegeDetails();
        HinducollegeDetails();
      HansrajcollegeDetails();


    }
//    private void DaulatRamCollegeDetails() {
//        drcTitle="Daulat Ram College";
//        drcImages=new ArrayList<>();
//        drcImages.add("http://dr.du.ac.in/data0/images/main_block.jpg");
//        drcImages.add("http://dr.du.ac.indata0/images/rangshala.jpg");
//        drcImages.add("http://dr.du.ac.indata0/images/Sports_Complex.jpg");
//        drcImages.add("http://dr.du.ac.indata0/images/sadhbhaawna_bhawan.jpg");
//        drcImages.add("http://dr.du.ac.indata0/images/hostel.jpg");
//        drcAddress="4, Patel Marg, Maurice Nagar  Delhi 110007";
//        drcContactno="011 - 27667863";
//        drcEmailId="daulatramcollegedu@gmail.com";
//
//
//        drcAmenities=new ArrayList<>();
//        drcAmenities.add("Library And Reading Room");
//        drcAmenities.add("Laborataries");
//        drcAmenities.add("Computer Labs");
//        drcAmenities.add("Seminar Room");
//        drcAmenities.add("Ampitheatre(Rangshala)");
//        drcAmenities.add("College Auditorium -Sadbhavana Bhawan");
//        drcAmenities.add("Medical Aid");
//        drcAmenities.add("College Canteen");
//        drcAmenities.add("Bank");
//        drcAmenities.add("Placement Cell");
//        drcAmenities.add("Hostel");
//
//      College daulatRam=new College(drcTitle,"http://dr.du.ac.in/img/logo.png",drcImages,null,drcAmenities,null,null,null,drcAddress,drcContactno,drcEmailId);
//
//
//
//
//
//
//
//    }
    private void onResponseCollegesFinal()
    {
        noOfcolleges--;
        if(noOfcolleges==0)
        { Log.i("r","complete");
       mAdapter.notifyDataSetChanged();
        }

    }

    private void SRCCcollegeDetails() {
        srccTitle="ShriRam College Of Commerce";
        srccUrl="http://www.srcc.edu/sites/all/themes/srcc/images/logo.png";
        srccImages=new ArrayList<>();
        srccImages.add("http://www.srcc.edu/sites/default/files/banner/banner-new1.jpg");

        srccImages.add("http://www.srcc.edu/sites/default/files/banner/banner2_new.jpg");
        srccImages.add("http://www.srcc.edu/sites/default/files/banner/banner3_new.jpg");
        srccImages.add("http://www.srcc.edu/sites/default/files/GMS4.PNG");
        srccImages.add("http://www.srcc.edu/sites/default/files/md_desk_banner1.jpg");
        srccImages.add("http://www.srcc.edu/sites/default/files/studentsBanner.jpg");
        srccImages.add("http://www.srcc.edu/sites/default/files/gallery/CR_1.jpg");
        srccImages.add("http://www.srcc.edu/sites/default/files/gallery/CR_2.jpg");
        srccImages.add("http://www.srcc.edu/sites/default/files/gallery/CR_3.jpg");
        srccImages.add("http://www.srcc.edu/sites/default/files/gallery/CR_4.jpg");
        srccaddress="Maurice Nagar, New Delhi, Delhi 110007";
        srccphoneNo="01127662319";
        srccemailId="principaloffice@srcc.du.ac.in";
        new AsyncTask<Void,Void,Void>(){

            @Override
            protected Void doInBackground(Void... params) {


                try {
                    Document document = Jsoup.connect("https://www.srcc.edu/student-zone/faculty").get();

                    srccfaculty=new ArrayList<>();
                    Elements facultydetails = document.select("tr");
                    for(int i=1;i<facultydetails.size();i++)
                    { Element element=facultydetails.get(i);
                        Elements el=element.getElementsByTag("p");
                        String name=el.get(1).text();
                        String designation=el.get(2).text();
                        String subject=el.get(3).text();
                        Faculty f=new Faculty("",name,subject,designation);
                        srccfaculty.add(f);



                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }



                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid) {
                onResponseSrccFinal();
            }
        }.execute();
        srccAmenities=new ArrayList<>();
        srccAmenities.add("ClassRooms");
        srccAmenities.add("Faculty/Tutorial Rooms");
        srccAmenities.add("IT Centers");
        srccAmenities.add("Libraries");
        srccAmenities.add("Boys Hostel");
        srccAmenities.add("Girls Hostel");
        srccAmenities.add("Differently Abled Friendly Campus");
        srccAmenities.add("Resource Center");
        srccAmenities.add("Auditorium");
        srccAmenities.add("Seminar Room");
        srccAmenities.add("Sports Complex");
        srccAmenities.add("Swimming Pool");
        srccAmenities.add("PhysioTherapy Unit");
        srccAmenities.add("Fitness Center/Gynasium");
        srccAmenities.add("Basic HealthCare Unit");
        srccAmenities.add("Wifi");
        srccAmenities.add("Canteen");
        srccAmenities.add("Bank");
        srccAmenities.add("Books And Photocopier Outlet");
        srccAmenities.add("Parking");
        srccrecruiters=new ArrayList<>();
        new AsyncTask<Void, Void, Void>() {
            protected Void doInBackground(Void... params) {
                try {
                    Document document = Jsoup.connect("https://www.collegesearch.in/colleges/shri-ram-college-of-commerce-srcc-delhi").get();
                    Elements recruiters = document.select("img.lazyOwl");

                    for (int i = 0; i < recruiters.size(); i++) {
                        Element e = recruiters.get(i);
                        String recruiter = e.attr("data-src");
                        srccrecruiters.add(recruiter);


                    }


                } catch (IOException e) {
                    e.printStackTrace();
                }
                return null;
            }

            protected void onPostExecute(Void aVoid) {

                onResponseSrccFinal();

            }
        }.execute();
        srccAlumni=new ArrayList<>();
        new AsyncTask<Void, Void, Void>() {
            protected Void doInBackground(Void... params) {
                try {
                    Document document = Jsoup.connect("https://www.collegesearch.in/colleges/shri-ram-college-of-commerce-srcc-delhi").get();
                    Elements famousalumni = document.select("div.famous_alu");

                    for (int i = 0; i < famousalumni.size(); i++) {
                        Element e = famousalumni.get(i);
                        Elements data = e.getElementsByTag("p");
                        Element e1 = data.get(0);
                        String title = e1.text();
                        Element e2 = data.get(1);
                        String attr = e2.attr("style");
                        String imageurl = "https://www.collegesearch.in" + attr.substring(29);

                        Log.i("imageurl", imageurl);
                        Element e3 = data.get(2);
                        String desc = e3.text();
                        Alumni al = new Alumni(imageurl, title, desc);
                        srccAlumni.add(al);


                    }


                } catch (IOException e) {
                    e.printStackTrace();
                }
                return null;
            }

            protected void onPostExecute(Void aVoid) {

                onResponseSrccFinal();

            }

        }.execute();





    }

    private void onResponseSrccFinal() {
        noOfTasksSrcc--;

        if (noOfTasksSrcc == 0) {
            Log.i("t", "processfinished");
            College srcc=new College(srccTitle,"http://www.srcc.edu/sites/all/themes/srcc/images/logo.png",srccImages,null,srccAmenities,srccfaculty,srccrecruiters,srccAlumni,"10",srccaddress,srccphoneNo,srccemailId,"20,0000","15");
            colleges.add(srcc);
            onResponseCollegesFinal();
        }


    }

    private void HansrajcollegeDetails() {
        hansrajtitle="Hansraj College";
        hansrajImages=new ArrayList<>();
        hansrajImages.add("http://www.hansrajcollege.ac.in/images/top-banner.jpg");
        hansrajImages.add("http://www.hansrajcollege.ac.in/images/foundationday.jpg");
        hansrajImages.add("http://www.hansrajcollege.ac.in/images/top-banner2.jpg");
        hansrajImages.add("http://www.hansrajcollege.ac.in/images/foundationday2.jpg");
        hansrajImages.add("http://www.hansrajcollege.ac.in/images/top-banner3.jpg");
        hansrajImages.add("http://www.hansrajcollege.ac.in/images/foundationday3.jpg");
        hansrajImages.add("http://www.hansrajcollege.ac.in/images/top-banner4.jpg");
        hansrajImages.add("http://www.hansrajcollege.ac.in/images/foundationday4.jpg");
        hansrajImages.add("http://www.hansrajcollege.ac.in/images/top-banner5.jpg");
        hansrajaddress="C-1 Block, Mahatma Hans Raj Marg, Malka Ganj, Delhi, 110007";
        hansrajemailId="principal@hansrajcollege.co.in";
        hansrajphoneNo="27667458";

//        new AsyncTask<Void,Void,Void>(){
//            protected Void doInBackground(Void... params) {
//                try {
//                    Log.i("reach","cominginTry");
//                    Document document = Jsoup.connect("http://hansrajcollege.ac.in/faculty-list.php").get();
//                    Log.i("reach","faculty");
//                    Elements facultydetails = document.select("li.facultyList_By_custom");
//                    Log.i("size",facultydetails.size()+"");
//                    hansrajfaculties=new ArrayList<>();
//                    int a=1;
//                    for (int i = 0; i < facultydetails.size(); i++) {
//                        Log.i("reach","facultyDetails");
//                        Element e = facultydetails.get(i);
//
//
//                        Elements img=e.getElementsByTag("img");
//                        String image=  img.get(0).attr("src");
//                        Elements title=e.getElementsByTag("h2");
//                        String name=title.get(0).text();
//                        Elements el=e.getElementsByTag("p");
//                        String designation=el.get(0).text();
//                        String subj="";
//                        if(a<=13)
//                        { subj="Botany";}
//                        else if(a<=26)
//                        {subj="Computer Science";}
//                        else if(a<=54)
//                        {subj="Chemistry";}
//                        else if(a<=59)
//                        {subj="Electronics";}
//                        else if(a<=73)
//                        {subj="Mathematics";}
//                        else if(a<=89)
//                        {subj="Physics";}
//                        else if(a<=101)
//                        {subj="Zoology";}
//                        else if(a<=123)
//                        {subj="Commerce";}
//                        else if(a<=141)
//                        {subj="Economics";}
//                        else if(a<=157)
//                        {subj="English";}
//                        else if(a<=168)
//                        {subj="Hindi";}
//                        else if(a<=179)
//                        {subj="History";}
//                        else if(a<=182)
//                        {subj="Philosphy";}
//                        else if(a<=188)
//                        {subj="Sanskrit";}
//                        else if(a<=190)
//                        {subj="Physical Education";}
//
//
//                        Faculty f=new Faculty(image,name,subj,designation);
//                        hansrajfaculties.add(f);
//                        a++;
//                    }
//
//
//
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//                return null;
//
//
//            }
//
//            @Override
//            protected void onPostExecute(Void aVoid) {
//
//                onResponseFinalHansraj();
//
//            }
//        }.execute();
        hansrajamenities= new ArrayList<>();
        hansrajamenities.add("Library");
        hansrajamenities.add("Canteen");
        hansrajamenities.add("Sports");
        hansrajamenities.add("Amphitheatre");
        hansrajamenities.add("Auditorium");
        hansrajamenities.add("Laboratories");
        hansrajamenities.add("Seminar Room");
        hansrajamenities.add("Common Room");
        hansrajamenities.add("Yoga Room");
        hansrajamenities.add("Yagyashala");
        hansrajamenities.add("Hostel");
        hansrajamenities.add("Medical Facilities");
        hansrajamenities.add("Enabling Unit");
        hansrajamenities.add("Computer Facility");

        hansrajrecruiters=new ArrayList<>();
        hansrajrecruiters.add("https://www.collegesearch.in/upload/top_recruiter/deloitte.gif");
        hansrajrecruiters.add("https://www.collegesearch.in/upload/top_recruiter/samsung.gif");
        hansrajrecruiters.add("https://www.collegesearch.in/upload/top_recruiter/airtel.png");
        hansrajrecruiters.add("https://www.collegesearch.in/upload/top_recruiter/151026041624_download_(3).png");
        hansrajrecruiters.add("https://www.collegesearch.in/upload/top_recruiter/130314111604_KPMG_-_IN.png");
        hansrajrecruiters.add("https://www.collegesearch.in/upload/top_recruiter/130225042007_images_(10).jpg");
        hansrajalumnis=new ArrayList<>();
        new AsyncTask<Void, Void, Void>() {
            protected Void doInBackground(Void... params) {
                try {
                    Document document = Jsoup.connect("https://www.collegesearch.in/colleges/hansraj-college").get();
                    Elements famousalumni = document.select("div.famous_alu");

                    for (int i = 0; i < famousalumni.size(); i++) {
                        Element e = famousalumni.get(i);
                        Elements data = e.getElementsByTag("p");
                        Element e1 = data.get(0);
                        String title = e1.text();
                        Element e2 = data.get(1);
                        String attr = e2.attr("style");
                        String imageurl="";
                        if(i!=2)
                        {   imageurl = "https://www.collegesearch.in" + attr.substring(29);}
                        else
                        { imageurl="https://alberts.ac.in/vocational/files/2015/07/contact-person-icon.png";}
                        Log.i("imageurl", imageurl);
                        Element e3 = data.get(2);
                        String desc = e3.text();
                        Alumni al = new Alumni(imageurl, title, desc);
                        hansrajalumnis.add(al);


                    }


                } catch (IOException e) {
                    e.printStackTrace();
                }
                return null;
            }

            protected void onPostExecute(Void aVoid) {

                onResponseFinalHansraj();

            }

        }.execute();



    }
    private void onResponseFinalHansraj() {
        noOfTasksHansraj--;
        Log.i("tasks",noOfTasks+"");
        if (noOfTasksHansraj == 0) {
            Log.i("t", "processfinished");
            College hansraj=new College(hansrajtitle,"http://www.hansrajcollege.ac.in/images/logo.png",hansrajImages,null,hansrajamenities,hansrajfaculties,hansrajrecruiters,hansrajalumnis,"9.5",hansrajaddress,hansrajphoneNo,hansrajemailId,"25,000","12");
            colleges.add(hansraj);
            onResponseCollegesFinal();
        }

    }

    private void onResponseFinal() {
        noOfTasks--;
        Log.i("tasks",noOfTasks+"");
        if (noOfTasks == 0) {
            Log.i("t", "processfinished");
            College hindu=new College(hindutitle,"http://www.hinducollege.ac.in/images/logo.png",hinduimageUrls,null,hinduamenities,hindufaculties,hindurecruiters,hindualumnis,"9.4",hinduaddress,hinduphoneNo,hinduemailId,"22,500","18");
            colleges.add(hindu);
            onResponseCollegesFinal();
        }

    }

    private void HinducollegeDetails() {


         hinduimageUrls = new ArrayList<>();
        hinduimageUrls.add("http://dubeat.com/wp-content/uploads/Delhi-University-Hindu-College-Pardaphash-79641-660x400.gif");
        for (int x = 1; x < 10; x++) {
            hinduimageUrls.add("http://www.hinducollege.ac.in/images/slides/Found-" + x + ".gif");
        }
        hinduimageUrls.add("http://www.hinducollege.ac.in/images/hostel-inn-main.gif");
        hindutitle = "Hindu College";
        hindufaculties = new ArrayList<>();
        new AsyncTask<Void, Void, Void>() {
            // invoked in background thread
            protected Void doInBackground(Void... params) {
                try {
                    Document document = Jsoup.connect("http://www.hinducollege.ac.in/faculty_profiles.aspx").get();
                    Elements facultydetails = document.select("div.thumbnail.wcnt");

                    for (int i = 0; i < facultydetails.size(); i++) {
                        Element e = facultydetails.get(i);
                        Element t = e.getElementById("rpt_Label1_" + i);
                        String title = t.text();
                        Element s = e.getElementById("rpt_Label3_" + i);
                        String subject = s.text();
                        Element d = e.getElementById("rpt_Label2_" + i);
                        String designation = d.text();
                        Elements images = e.getElementsByTag("img");
                        String Image = "";
                        for (Element image : images) {
                            Image = image.attr("src");
                        }
                        Faculty f = new Faculty(Image, title, subject, designation);
                        hindufaculties.add(f);

                    }

                    Log.i("r","reachfaculty");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return null;


            }

            @Override
            protected void onPostExecute(Void aVoid) {

                onResponseFinal();

            }
        }.execute();
        //invoked in ui thread


        hinduamenities = new ArrayList<>();
        new AsyncTask<Void, Void, Void>() {


            @Override
            protected Void doInBackground(Void... params) {
                try {
                    Document document = Jsoup.connect("http://www.hinducollege.ac.in/amenities.aspx").get();
                    Elements amenities = document.select("h4");
                    for (Element amenity : amenities) {
                        String title = amenity.text();
                        hinduamenities.add(title);


                    }
                    Log.i("r","reachamen");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid) {
                onResponseFinal();
            }
        }.execute();

        hinduaddress = "University Enclave, New Delhi, Delhi 110007";
        hinduphoneNo = "011 2766 7184";
        hinduemailId = "hinducol@del3.vsnl.net.in";
        hindurecruiters = new ArrayList<>();
        new AsyncTask<Void, Void, Void>() {
            protected Void doInBackground(Void... params) {
                try {
                    Document document = Jsoup.connect("https://www.collegesearch.in/colleges/hindu-college-delhi").get();
                    Elements recruiters = document.select("img.lazyOwl");

                    for (int i = 0; i < recruiters.size(); i++) {
                        Element e = recruiters.get(i);
                        String recruiter = e.attr("data-src");
                        hindurecruiters.add(recruiter);


                    }
            Log.i("r","reachrecruiters");

                } catch (IOException e) {
                    e.printStackTrace();
                }
                return null;
            }

            protected void onPostExecute(Void aVoid) {

                onResponseFinal();

            }
        }.execute();
        //invoked in ui thread
        hindualumnis = new ArrayList<>();
        new AsyncTask<Void, Void, Void>() {
            protected Void doInBackground(Void... params) {
                try {
                    Document document = Jsoup.connect("https://www.collegesearch.in/colleges/hindu-college-delhi").get();
                    Elements famousalumni = document.select("div.famous_alu");

                    for (int i = 0; i < famousalumni.size(); i++) {
                        Element e = famousalumni.get(i);
                        Elements data = e.getElementsByTag("p");
                        Element e1 = data.get(0);
                        String title = e1.text();
                        Element e2 = data.get(1);
                        String attr = e2.attr("style");
                        String imageurl = "https://www.collegesearch.in" + attr.substring(29);
                        Log.i("imageurl", imageurl);
                        Element e3 = data.get(2);
                        String desc = e3.text();
                        Alumni al = new Alumni(imageurl, title, desc);
                        hindualumnis.add(al);


                    }
                    Log.i("r","reachalumni");


                } catch (IOException e) {
                    e.printStackTrace();
                }
                return null;
            }

            protected void onPostExecute(Void aVoid) {

                onResponseFinal();

            }

        }.execute();


//                                        final   int courses[] = {56, 57, 63, 64, 68, 70, 80, 83, 167, 4042, 4043, 4056, 4061, 4063, 4065, 3993, 4008, 4117, 1, 3739, 1505, 4316, 4056, 4061, 4521, 4543, 9383, 304, 338, 344, 376, 398, 402, 425, 3793};
//                                         Log.i("size",courses.length+"");
//                                      final int[] i={0};
//                                       coursesArrayList=new ArrayList<>();
//
//                                        for(; i[0]<courses.length; i[0]++){
//                                            new AsyncTask<Void,Void,Course>(){
//
//                                                @Override
//                                                protected Course doInBackground(Void... params) {
//                                                    try {
//
//                                                        Document document = Jsoup.connect("https://collegedunia.com/college/1904-hindu-college-new-delhi/courses-fees?course_id="+courses[i[0]]).get();
//                                                        Elements e=document.getElementsByTag("h2");
//                                                        String title=e.get(0).text();
//                                                        Elements el=document.getElementsByTag("td");
//                                                        String year1tutionfees=el.get(1).text();
//                                                        String year2tutionfees=el.get(2).text();
//                                                        String year3tutionfees=el.get(3).text();
//                                                        String year1admissionfees=el.get(5).text();
//                                                        String year2admissionfees=el.get(6).text();
//                                                        String year3admissionfees=el.get(7).text();
//                                                        String year1other=el.get(9).text();
//                                                        String year2other=el.get(10).text();
//                                                        String year3other=el.get(11).text();
//                                                        String year1total=el.get(13).text();
//                                                        String year2total=el.get(14).text();
//                                                        String year3total=el.get(15).text();
//                                                        String total=el.get(17).text();
//                                                        Course c=new Course(title,year1tutionfees,year2tutionfees,year3tutionfees,year1admissionfees,year2admissionfees,year3admissionfees,year1other,year2other,year3other,year1total,year2total,year3total,total);
//
//
//                                                       return c;
//
//                                                    } catch (IOException e) {
//                                                        e.printStackTrace();
//                                                    }
//                                                    return null;
//
//                                                }
//                                                protected void onPostExecute(Course c) {
//                                                     coursesArrayList.add(c);
//                                                    onResponseFinal();
//
//                                                }
//
//
//                                            }.execute();
//
//                                        }
//
//                                    }
//
//
//
//                                }
//
//

    }


}

