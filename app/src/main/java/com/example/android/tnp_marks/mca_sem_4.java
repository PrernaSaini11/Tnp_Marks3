package com.example.android.tnp_marks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class mca_sem_4 extends AppCompatActivity {
    EditText cre_4_1, cre_4_2, cre_4_3, cre_4_4, cre_4_5, cre_1_1,cre_1_2, cre_1_3,  cre_2;
    int c_4_1, c_4_2, c_4_3, c_4_4, c_4_5,  c_2, c_1_1, c_1_2, c_1_3,c_1_4,c_1_5,c_1_6, sum, perc, sum_c, perc_c, total = 900, total_c = 25 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mca_sem_4);
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
                                     cre_2 = (EditText) findViewById(R.id.ed6);
                                     cre_1_1 = (EditText) findViewById(R.id.ed7);
                                     cre_1_2 = (EditText) findViewById(R.id.ed8);
                                     cre_1_3 = (EditText) findViewById(R.id.ed9);
                                     if(cre_4_1.getText().toString().isEmpty() || Integer.parseInt(cre_4_1.getText().toString()) > 100 )
                                     {
                                         Toast.makeText(getApplicationContext(), "Enter a value less than 101 !",
                                                 Toast.LENGTH_LONG).show();
                                     }
                                     else if(cre_4_2.getText().toString().isEmpty() || Integer.parseInt(cre_4_2.getText().toString()) > 100 )
                                     {
                                         Toast.makeText(getApplicationContext(), "Enter a value less than 101 !",
                                                 Toast.LENGTH_LONG).show();
                                     }
                                     else if(cre_4_3.getText().toString().isEmpty() || Integer.parseInt(cre_4_3.getText().toString()) > 100 )
                                     {
                                         Toast.makeText(getApplicationContext(), "Enter a value less than 101 !",
                                                 Toast.LENGTH_LONG).show();
                                     }
                                     else if(cre_4_4.getText().toString().isEmpty() || Integer.parseInt(cre_4_4.getText().toString()) > 100 )
                                     {
                                         Toast.makeText(getApplicationContext(), "Enter a value less than 101 !",
                                                 Toast.LENGTH_LONG).show();
                                     }
                                     else if(cre_4_5.getText().toString().isEmpty() || Integer.parseInt(cre_4_5.getText().toString()) > 100 )
                                     {
                                         Toast.makeText(getApplicationContext(), "Enter a value less than 101 !",
                                                 Toast.LENGTH_LONG).show();
                                     }
                                     else if(cre_2.getText().toString().isEmpty() || Integer.parseInt(cre_2.getText().toString()) > 100 )
                                     {
                                         Toast.makeText(getApplicationContext(), "Enter a value less than 101 !",
                                                 Toast.LENGTH_LONG).show();
                                     }
                                     else if(cre_1_1.getText().toString().isEmpty() || Integer.parseInt(cre_1_1.getText().toString()) > 100 )
                                     {
                                         Toast.makeText(getApplicationContext(), "Enter a value less than 101 !",
                                                 Toast.LENGTH_LONG).show();
                                     }
                                     else if(cre_1_2.getText().toString().isEmpty() || Integer.parseInt(cre_1_2.getText().toString()) > 100 )
                                     {
                                         Toast.makeText(getApplicationContext(), "Enter a value less than 101 !",
                                                 Toast.LENGTH_LONG).show();
                                     }
                                     else if(cre_1_3.getText().toString().isEmpty() || Integer.parseInt(cre_1_3.getText().toString()) > 100 )
                                     {
                                         Toast.makeText(getApplicationContext(), "Enter a value less than 101 !",
                                                 Toast.LENGTH_LONG).show();
                                     }
                                     else {

                                         c_4_1 = Integer.parseInt(cre_4_1.getText().toString());
                                         c_4_2 = Integer.parseInt(cre_4_2.getText().toString());
                                         c_4_3 = Integer.parseInt(cre_4_3.getText().toString());
                                         c_4_4 = Integer.parseInt(cre_4_4.getText().toString());
                                         c_4_5 = Integer.parseInt(cre_4_5.getText().toString());
                                         c_1_1 = Integer.parseInt(cre_1_1.getText().toString());
                                         c_1_2 = Integer.parseInt(cre_1_2.getText().toString());
                                         c_1_3 = Integer.parseInt(cre_1_3.getText().toString());
                                         c_2 = Integer.parseInt(cre_2.getText().toString());
                                        
                                         if(c_4_1 < 50)
                                         {
                                             c_4_1 = 0;
                                             total -= 100;
                                             total_c -= 4;
                                         }
                                         if(c_4_2 < 50)
                                         {
                                             c_4_2 = 0;
                                             total -= 100;
                                             total_c -= 4;
                                         }
                                         if(c_4_3 < 50)
                                         {
                                             total -= 100;
                                             total_c -= 4;
                                             c_4_3 = 0;
                                         }
                                         if(c_4_4 < 50)
                                         {
                                             total -= 100;
                                             total_c -= 4;
                                             c_4_4 = 0;
                                         }
                                         if(c_4_5< 50)
                                         {
                                             total -= 100;
                                             total_c -= 4;
                                             c_4_5 = 0;
                                         }
                                         
                                         if(c_2 < 50)
                                         {
                                             total -= 100;
                                             total_c -= 2;
                                             c_1_1 = 0;
                                         }
                                         if(c_1_2 < 50)
                                         {
                                             total -= 100;
                                             total_c -= 1;
                                             c_1_2 = 0;
                                         }
                                         if(c_1_3 < 50)
                                         {
                                             total -= 100;
                                             total_c -= 1;
                                             c_1_3 = 0;
                                         }
                                         if(c_1_1 < 50)
                                         {
                                             total -= 100;
                                             total_c -= 1;
                                             c_2 = 0;
                                         }
                                         sum = c_4_1 + c_4_2 + c_4_3 + c_4_4 + c_4_5 + c_1_1 + c_1_2 + c_1_3 + c_2;
                                         perc = (sum * 100) / total;
                                         c_4_1 *= 4;
                                         c_4_2 *= 4;
                                         c_4_3 *= 4;
                                         c_4_4 *= 4;
                                         c_4_5 *= 4;
                                         sum_c = c_1_1 + c_1_2 + c_1_3 + c_1_4 + c_1_5 + c_1_6 + c_4_1 + c_4_2 + c_4_3 + c_4_4 + c_4_5;
                                         perc_c = sum_c / total_c;
                                         tv.setText("Without credits :- " + "Total = " + Integer.toString(sum) + "  Percentage = " + Integer.toString(perc));
                                         tv2.setText("Total credits :- 25 Credits Gained :- " + Integer.toString(total_c));
                                         tv1.setText("With credits :- " + "Total = " + Integer.toString(sum_c) + "  Percentage = " + Integer.toString(perc_c));
                                     }
                                 }
                             }
        );

    }
}
