package com.example.avma1997.du;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Avma1997 on 8/24/2017.
 */

 public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.CollegeViewHolder>  {

 private Context mContext;
 private ArrayList<College> mColleges;
 private CollegesClickListener mListener;



    public interface CollegesClickListener {
  void onItemClick(View view, int position);
 }





 public RecyclerAdapter(Context context, ArrayList<College> colleges,CollegesClickListener listener){
  mContext = context;
  mColleges = colleges;
  mListener = listener;
 }


 public CollegeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
  View itemView = LayoutInflater.from(mContext).inflate(R.layout.collegelayout,parent,false);
       return new CollegeViewHolder(itemView,mListener);
 }

 public void onBindViewHolder(CollegeViewHolder holder, int position) {
  College c = mColleges.get(position);
     String a="Facilities: ";
ArrayList<String> facilities=c.amenities;
     for(int i=0;i<facilities.size();i++){
         a=a+facilities.get(i)+", ";

     }
     holder.amenitiesTextView.setText(a.substring(0,a.length()-2));
String b="Recruiters: ";
     ArrayList<String> recruiters=c.recruiters;
     for(int i=0;i<recruiters.size();i++){
         b=b+recruiters.get(i)+", ";

     }
     holder.placementsTextView.setText(b.substring(0,b.length()-2));
     holder.ratingTextView.setText(c.rating);
     holder.titleTextView.setText(c.title);
     holder.addressTextView.setText(c.address);
     holder.phoneNoTextView.setText(c.phoneNo);
     holder.emailIdTextView.setText(c.emailId);
     holder.feesTextView.setText(c.fees);
     holder.coursesTextView.setText(c.noOfCourses);
     Picasso.with(mContext).load(c.imageUrls.get(0)).into(holder.collegeImageView);
     Picasso.with(mContext).load(c.imageUrls.get(1)).into(holder.img);
     Picasso.with(mContext).load(c.logoUrl).into(holder.logoImageView);









 }

 @Override
 public int getItemCount() {
  return mColleges.size();
 }

 public static class CollegeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

  TextView amenitiesTextView;
  TextView placementsTextView;
  TextView ratingTextView;
     TextView titleTextView;
     TextView addressTextView;
     TextView phoneNoTextView;
     TextView emailIdTextView;
     TextView feesTextView;
     TextView coursesTextView;
ImageView img;
     ImageView collegeImageView;
  ImageView logoImageView;
     Button fmd;
  CollegesClickListener mCollegesClickListener;

  public CollegeViewHolder(View itemView,CollegesClickListener listener) {
   super(itemView);
   itemView.setOnClickListener(this);
   mCollegesClickListener = listener;
   titleTextView = (TextView)itemView.findViewById(R.id.title);
   amenitiesTextView = (TextView)itemView.findViewById(R.id.amenities);
   placementsTextView=(TextView)itemView.findViewById(R.id.placements);
   ratingTextView=(TextView)itemView.findViewById(R.id.rating);
      addressTextView = (TextView)itemView.findViewById(R.id.address);
      phoneNoTextView = (TextView)itemView.findViewById(R.id.phone_no);
      emailIdTextView=(TextView)itemView.findViewById(R.id.email_id);
      feesTextView=(TextView)itemView.findViewById(R.id.fees);
      coursesTextView=(TextView)itemView.findViewById(R.id.courses);
      collegeImageView=(ImageView)itemView.findViewById(R.id.imageView);
      logoImageView=(ImageView)itemView.findViewById(R.id.logo);
      img=(ImageView)itemView.findViewById(R.id.imagefold);
      fmd=(Button)itemView.findViewById(R.id.explore_button);

  }

  @Override
  public void onClick(View view) {
   int id = view.getId();
   int position = getAdapterPosition();
   if(position != RecyclerView.NO_POSITION){
    if(id == R.id.college_layout){
     mCollegesClickListener.onItemClick(view,position);
    }



























   }

  }
 }


}



