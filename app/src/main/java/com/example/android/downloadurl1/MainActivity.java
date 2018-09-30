package com.example.android.downloadurl1;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void myClicko(View view){
        //Toast.makeText(this, "c;ock", Toast.LENGTH_SHORT).show();
       DownloadManager downloadManager = (DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
        Uri uri = Uri.parse("https://www.anaesthesia-feedback.co.uk/FEEDCREATE/PDFS/APP_PDFS/1538336678.pdf");
        DownloadManager.Request request = new DownloadManager.Request(uri);
       request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        Long reference = downloadManager.enqueue(request);

    }

   // Uri uri = Uri.parse("www.anaesthesia-feedback.co.uk/FEEDCREATE/PDFS/APP_PDFS/1538336678.pdf");


}


