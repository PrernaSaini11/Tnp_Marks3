package com.example.android.tnp_marks;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BARCHSem3 extends AppCompatActivity {

    EditText cre_4_1, cre_4_2, cre_4_3, cre_4_4, cre_4_5, cre_4_6,cre_4_7,cre_4_8;
    int c_4_1, c_4_2, c_4_3, c_4_4, c_4_5, c_4_6,c_4_7,c_4_8, sum, perc, sum_c, perc_c,total = 800, total_c = 27 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barchsem3);
        final TextView tv = (TextView)findViewById(R.id.tView);
        final TextView tv1 = (TextView)findViewById(R.id.t1View);
        final TextView tv2 = (TextView)findViewById(R.id.t2View);

        Button b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
                                 public void onClick(View v) {
                                     cre_4_1 = (EditText) findViewById(R.id.ed1);
                                     cre_4_2 = (EditText) findViewById(R.id.ed2);
                                     cre_4_3 = (EditText) findViewById(R.id.ed3);
                                     cre_4_4 = (EditText) findViewById(R.id.ed4);
                                     cre_4_5 = (EditText) findViewById(R.id.ed5);
                                     cre_4_6 = (EditText) findViewById(R.id.ed6);
                                     cre_4_7 = (EditText) findViewById(R.id.ed7);
                                     cre_4_8 = (EditText) findViewById(R.id.ed8);
                                     if (cre_4_1.getText().toString().isEmpty() || Integer.parseInt(cre_4_1.getText().toString()) > 100) {
                                         Toast.makeText(getApplicationContext(), "Enter a value less than 101 !",
                                                 Toast.LENGTH_LONG).show();
                                     } else if (cre_4_2.getText().toString().isEmpty() || Integer.parseInt(cre_4_2.getText().toString()) > 100) {
                                         Toast.makeText(getApplicationContext(), "Enter a value less than 101 !",
                                                 Toast.LENGTH_LONG).show();
                                     } else if (cre_4_3.getText().toString().isEmpty() || Integer.parseInt(cre_4_3.getText().toString()) > 100) {
                                         Toast.makeText(getApplicationContext(), "Enter a value less than 101 !",
                                                 Toast.LENGTH_LONG).show();
                                     } else if (cre_4_4.getText().toString().isEmpty() || Integer.parseInt(cre_4_4.getText().toString()) > 100) {
                                         Toast.makeText(getApplicationContext(), "Enter a value less than 101 !",
                                                 Toast.LENGTH_LONG).show();
                                     } else if (cre_4_5.getText().toString().isEmpty() || Integer.parseInt(cre_4_5.getText().toString()) > 100) {
                                         Toast.makeText(getApplicationContext(), "Enter a value less than 101 !",
                                                 Toast.LENGTH_LONG).show();
                                     } else if (cre_4_6.getText().toString().isEmpty() || Integer.parseInt(cre_4_6.getText().toString()) > 100) {
                                         Toast.makeText(getApplicationContext(), "Enter a value less than 101 !",
                                                 Toast.LENGTH_LONG).show();
                                     } else if (cre_4_7.getText().toString().isEmpty() || Integer.parseInt(cre_4_7.getText().toString()) > 100) {
                                         Toast.makeText(getApplicationContext(), "Enter a value less than 101 !",
                                                 Toast.LENGTH_LONG).show();
                                     } else if (cre_4_8.getText().toString().isEmpty() || Integer.parseInt(cre_4_8.getText().toString()) > 100) {
                                         Toast.makeText(getApplicationContext(), "Enter a value less than 101 !",
                                                 Toast.LENGTH_LONG).show();
                                     } else {
                                         c_4_1 = Integer.parseInt(cre_4_1.getText().toString());
                                         c_4_2 = Integer.parseInt(cre_4_2.getText().toString());
                                         c_4_3 = Integer.parseInt(cre_4_3.getText().toString());
                                         c_4_4 = Integer.parseInt(cre_4_4.getText().toString());
                                         c_4_5 = Integer.parseInt(cre_4_5.getText().toString());
                                         c_4_6 = Integer.parseInt(cre_4_6.getText().toString());
                                         c_4_7 = Integer.parseInt(cre_4_7.getText().toString());
                                         c_4_8 = Integer.parseInt(cre_4_8.getText().toString());
                                         if(c_4_1 < 50)
                                         {
                                             total -= 100;
                                             total_c -= 10;
                                             c_4_1=0;
                                         }
                                         if(c_4_2 < 50)
                                         {
                                             total -= 100;
                                             total_c -= 5;
                                             c_4_2=0;
                                         }
                                         if(c_4_3 < 50)
                                         {
                                             total -= 100;
                                             total_c -= 2;
                                             c_4_3=0;
                                         }
                                         if(c_4_4 < 50)
                                         {
                                             total -= 100;
                                             total_c -= 2;
                                             c_4_4=0;
                                         }
                                         if(c_4_5 < 50)
                                         {
                                             total -= 100;
                                             total_c -= 3;
                                             c_4_5=0;
                                         }
                                         if(c_4_6 < 50)
                                         {
                                             total -= 100;
                                             total_c -= 2;
                                             c_4_6=0;
                                         }
                                         if(c_4_7 < 50)
                                         {
                                             total -= 100;
                                             total_c -= 2;
                                             c_4_7=0;
                                         }
                                         if(c_4_8 < 50)
                                         {
                                             total -= 100;
                                             total_c -= 1;
                                             c_4_8=0;
                                         }


                                         sum = c_4_1 + c_4_2 + c_4_3 + c_4_4 + c_4_5 + c_4_6 + c_4_7 + c_4_8;
                                         perc = (sum *100) / total;
                                         c_4_1 *= 10;
                                         c_4_2 *= 5;
                                         c_4_3 *= 2;
                                         c_4_4 *= 2;
                                         c_4_5 *= 3;
                                         c_4_6 *= 2;
                                         c_4_7 *= 2;
                                         sum_c = c_4_1 + c_4_2 + c_4_3 + c_4_4 + c_4_5 + c_4_6 + c_4_7 + c_4_8;
                                         perc_c = sum_c / total_c;
                                         tv.setText("Without Credits :- Total = " + Integer.toString(sum) + " Percentage = " + Integer.toString(perc));
                                         tv2.setText("Total credits :- 27 Credits Gained :- " + Integer.toString(total_c));
                                         tv1.setText("With Credits :- Total = " + Integer.toString(sum_c) + " Percentage = " + Integer.toString(perc_c));
                                     }
                                 }
                             }
        );

    }
}