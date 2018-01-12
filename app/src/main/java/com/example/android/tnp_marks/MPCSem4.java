package com.example.android.tnp_marks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MPCSem4 extends AppCompatActivity {
    EditText cre1, cre2;
    int i1, i2, sum, prec, sum_c, prec_c,total = 200, total_c = 28;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mpcsem4);

        cre1 = (EditText)findViewById(R.id.ed1);
        cre2 = (EditText)findViewById(R.id.ed2);
        final TextView tv = (TextView)findViewById(R.id.tView);
        final TextView tv1 = (TextView)findViewById(R.id.t1View);
        final TextView tv2 = (TextView)findViewById(R.id.t2View);
        Button b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
                                 public void onClick(View v) {
                                     if (cre1.getText().toString().isEmpty() || Integer.parseInt(cre1.getText().toString()) > 100) {
                                         Toast.makeText(getApplicationContext(), "Enter a value less than 101 !",
                                                 Toast.LENGTH_LONG).show();
                                     } else if (cre2.getText().toString().isEmpty() || Integer.parseInt(cre2.getText().toString()) > 100) {
                                         Toast.makeText(getApplicationContext(), "Enter a value less than 101 !",
                                                 Toast.LENGTH_LONG).show();
                                     } else {
                                         i1 = Integer.parseInt(cre1.getText().toString());
                                         i2 = Integer.parseInt(cre2.getText().toString());
                                         if(i1 < 50)
                                         {
                                             total -= 100;
                                             total_c -= 24;
                                             i1 = 0;
                                         }
                                         if(i2 < 50)
                                         {
                                             total -= 100;
                                             total_c -= 4;
                                             i2 = 0;
                                         }
                                         sum = i1 + i2;
                                         prec = (sum * 100) / total;
                                         i1 *= 24;
                                         i2 *= 4;
                                         sum_c = i1 + i2;
                                         prec_c = sum_c / total_c;
                                         tv.setText("Without credits :- " + "Total = " + Integer.toString(sum) + "  Percentage = " + Integer.toString(prec));
                                         tv2.setText("Total credits :- 28 Credits Gained :- " + Integer.toString(total_c));
                                         tv1.setText("With credits :- " + "Total = " + Integer.toString(sum_c) + "  Percentage = " + Integer.toString(prec_c));
                                     }
                                 }
                             }
        );

    }
}


