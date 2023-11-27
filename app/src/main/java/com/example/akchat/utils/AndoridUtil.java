package com.example.akchat.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.akchat.model.UserModel;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class AndoridUtil {
    public  static  void ShowToast(Context context  , String message){
        Toast.makeText(context.getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
    public  static void  passUserModalAsIntent(Intent intent  , UserModel model){
        intent.putExtra("username"  , model.getUsername());
        intent.putExtra("phone"  , model.getPhone());
        intent.putExtra("userId"  , model.getUserId());
        intent.putExtra("fcmToken"  , model.getFcmToken());
    }

    public static UserModel getUserModelFromIntend(Intent intent){

        UserModel userModel = new UserModel();
        userModel.setUsername(intent.getStringExtra("username"));
        userModel.setPhone(intent.getStringExtra("phone"));
        userModel.setUserId(intent.getStringExtra("userId"));
        userModel.setFcmToken(intent.getStringExtra("fcmToken"));
        return userModel;
    }
    public static void setProfilePic(Context context, Uri imageUri, ImageView imageView){
        Glide.with(context).load(imageUri).apply(RequestOptions.circleCropTransform()).into(imageView);
    }



}
