package com.example.erdo.dialogcheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> arrayList1 = new ArrayList<>();

        arrayList1.add("205/42 sk. no 23, İzmir");
        arrayList1.add("bu deneme İstanbul");
        arrayList1.add("deneme2");
        arrayList1.add("deneme3");
        arrayList1.add("deneme4");
        ArrayList<String> arrayList2 = new ArrayList<>();

        //arrayList2.add("İzmir");
        //arrayList2.add("istanbul");
       arrayList2.add("sapan");
        arrayList2.add("deneme234");
        System.out.println("Liste bir " + arrayList1);
        System.out.println("Liste iki " + arrayList2);

        System.out.println("İçerir mi? "+ arrayList2.retainAll(arrayList1));
        System.out.println("After applying the method, First List :"+ arrayList1);
        System.out.println("After applying the method, Second List :"+ arrayList2);

    }
}
