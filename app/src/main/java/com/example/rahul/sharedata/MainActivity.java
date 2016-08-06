package com.example.rahul.sharedata;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
TextView title,description;
    ImageView mfruit,mbook,whatsapp,fb,slack,google,more;
 //   int[] location=new int[2];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title=(TextView)findViewById(R.id.txt_title);
        description=(TextView)findViewById(R.id.txt_description);
        mfruit=(ImageView)findViewById(R.id.img_fruitt);
        mbook=(ImageView)findViewById(R.id.img_bookk);
        whatsapp=(ImageView)findViewById(R.id.img_whatsapp);
        fb=(ImageView)findViewById(R.id.img_fb);
        slack=(ImageView)findViewById(R.id.img_slack);
        google=(ImageView)findViewById(R.id.img_google);
        more=(ImageView)findViewById(R.id.img_more);
        final ArrayList<Uri> Imageuris = new ArrayList<Uri>();
        Uri bmpUri1 = getLocalBitmapUri(mfruit);
        Uri bmpUri2 = getLocalBitmapUri(mbook);
        Imageuris.add(0, bmpUri1);
        Imageuris.add(1, bmpUri2);
//        fb.getLocationOnScreen(location);
//        for(int i=0;i<location.length;i++){
//            Log.d("Cordinator:",String.valueOf(location[i]));
//        }

        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PackageManager pm = v.getContext().getPackageManager();
                Intent shareIntent = new Intent();
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, title.getText().toString());
                shareIntent.putExtra(Intent.EXTRA_TEXT, description.getText().toString());
                shareIntent.putParcelableArrayListExtra(Intent.EXTRA_STREAM, Imageuris);
                shareIntent.setType("*/*");
                shareIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);

                List<ResolveInfo> activityList = pm.queryIntentActivities(shareIntent, 0);
                for (final ResolveInfo app : activityList)
                {
                    if ((app.activityInfo.name).contains("whatsapp"))
                    {
                        final ActivityInfo activity = app.activityInfo;
                        final ComponentName name = new ComponentName(activity.applicationInfo.packageName, activity.name);
                        shareIntent.addCategory(Intent.CATEGORY_LAUNCHER);
                        shareIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED);
                        shareIntent.setComponent(name);
                        v.getContext().startActivity(shareIntent);
                        break;
                    }
                }
            }
        });
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PackageManager pm = v.getContext().getPackageManager();
                Intent shareIntent = new Intent();
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, title.getText().toString());
                shareIntent.putExtra(Intent.EXTRA_TEXT, description.getText().toString());
                shareIntent.putParcelableArrayListExtra(Intent.EXTRA_STREAM, Imageuris);
                shareIntent.setType("*/*");
                shareIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
                List<ResolveInfo> activityList = pm.queryIntentActivities(shareIntent, 0);
                for (final ResolveInfo app : activityList)
                {
                    if ((app.activityInfo.name).contains("facebook"))
                    {
                        final ActivityInfo activity = app.activityInfo;
                        final ComponentName name = new ComponentName(activity.applicationInfo.packageName, activity.name);
                        shareIntent.addCategory(Intent.CATEGORY_LAUNCHER);
                        shareIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED);
                        shareIntent.setComponent(name);
                        v.getContext().startActivity(shareIntent);
                        break;
                    }
                }
            }
        });
        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PackageManager pm = v.getContext().getPackageManager();
                Intent shareIntent = new Intent();
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, title.getText().toString());
                shareIntent.putExtra(Intent.EXTRA_TEXT, description.getText().toString());
                shareIntent.putParcelableArrayListExtra(Intent.EXTRA_STREAM, Imageuris);
                shareIntent.setType("*/*");
                shareIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);

                List<ResolveInfo> activityList = pm.queryIntentActivities(shareIntent, 0);
                for (final ResolveInfo app : activityList)
                {
                    if ((app.activityInfo.name).contains("hangout"))
                    {
                        final ActivityInfo activity = app.activityInfo;
                        final ComponentName name = new ComponentName(activity.applicationInfo.packageName, activity.name);
                        shareIntent.addCategory(Intent.CATEGORY_LAUNCHER);
                        shareIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED);
                        shareIntent.setComponent(name);
                        v.getContext().startActivity(shareIntent);
                        break;
                    }
                }
            }
        });
        slack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PackageManager pm = v.getContext().getPackageManager();
                Intent shareIntent = new Intent();
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, title.getText().toString());
                shareIntent.putExtra(Intent.EXTRA_TEXT, description.getText().toString());
                shareIntent.putParcelableArrayListExtra(Intent.EXTRA_STREAM, Imageuris);
                shareIntent.setType("*/*");
                shareIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);

                List<ResolveInfo> activityList = pm.queryIntentActivities(shareIntent, 0);
                for (final ResolveInfo app : activityList)
                {
                    if ((app.activityInfo.name).contains("Slack"))
                    {
                        final ActivityInfo activity = app.activityInfo;
                        final ComponentName name = new ComponentName(activity.applicationInfo.packageName, activity.name);
                        shareIntent.addCategory(Intent.CATEGORY_LAUNCHER);
                        shareIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED);
                        shareIntent.setComponent(name);
                        v.getContext().startActivity(shareIntent);
                        break;
                    }
                }
            }
        });





    more.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            final Intent shareIntent = new Intent();
            shareIntent.setAction(Intent.ACTION_SEND);
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, title.getText().toString());
            shareIntent.putExtra(Intent.EXTRA_TEXT, description.getText().toString());
            shareIntent.putParcelableArrayListExtra(Intent.EXTRA_STREAM, Imageuris);
            shareIntent.setType("*/*");
            shareIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
            startActivity(Intent.createChooser(shareIntent, "Complete Action Using...."));
        }
    });


    }
    public Uri getLocalBitmapUri(ImageView imageView) {
        // Extract Bitmap from ImageView drawable
        Drawable drawable = imageView.getDrawable();
        Bitmap bmp = null;
        if (drawable instanceof BitmapDrawable){
            bmp = ((BitmapDrawable) imageView.getDrawable()).getBitmap();
        } else {
            return null;
        }
        // Store image to default external storage directory
        Uri bmpUri = null;
        try {
            File file =  new File(getExternalFilesDir(Environment.DIRECTORY_PICTURES), "share_image_" + System.currentTimeMillis() + ".png");
            FileOutputStream out = new FileOutputStream(file);
            bmp.compress(Bitmap.CompressFormat.PNG, 90, out);
            out.close();
            bmpUri = Uri.fromFile(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bmpUri;
    }
}
