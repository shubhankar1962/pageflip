package com.shubhankar.bookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

public class PdfViewActivity2 extends AppCompatActivity {

    PDFView pdfView;
    TextView setName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_view2);

        getSupportActionBar().hide();
        pdfView=findViewById(R.id.pdfView);
        setName=findViewById(R.id.set);

        int pos=getIntent().getIntExtra("position",0);

        if(pos==0) {
            pdfView.fromAsset("CRACKING the · CODING INTERVIEW ( PDFDrive ).pdf").load();
            setName.setText("SET-1");
        }
        else if(pos==1)
        {
           pdfView.fromAsset("Data Structures and Algorithms Made Easy_ Data Structures and Algorithmic Puzzles ( PDFDrive ).pdf").load();
            setName.setText("SET-2");
        }
        else if(pos==2)
        {
            Toast.makeText(this,"set-3",Toast.LENGTH_SHORT).show();
            setName.setText("SET-3");
        }
        else if(pos==3)
        {
            Toast.makeText(this,"set-4",Toast.LENGTH_SHORT).show();
            setName.setText("SET-4");
        }
        else if(pos==4)
        {
            Toast.makeText(this,"set-5",Toast.LENGTH_SHORT).show();
            setName.setText("SET-5");
        }
    }
}