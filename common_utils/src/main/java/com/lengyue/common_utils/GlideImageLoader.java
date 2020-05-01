package com.lengyue.common_utils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class GlideImageLoader {

    public static void displayImage(Context context, Object path, ImageView imageView, int placeHolderImageId) {
        Glide.with(context).load(path).placeholder(placeHolderImageId)
                .error(placeHolderImageId)
                .centerCrop().into(imageView);
    }

    public static void displayImage(Context context, Object path, ImageView imageView, int placeHolderImageId, int errorImageId) {
        Glide.with(context).load(path).placeholder(placeHolderImageId)
                .error(errorImageId)
                .centerCrop().into(imageView);
    }
}
