package caabhishek.incometaxcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText t1,t2;
   float tax,amount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
           b1 = (Button) findViewById(R.id.b1);
        t1 = (EditText) findViewById(R.id.t1);
        t2 = (EditText) findViewById(R.id.t2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 tax = Float.parseFloat(t1.getText()+"");

                if(amount <= 300000 && amount >= 0){
                    tax = (amount - 85650) * (0);
                }

                else if(amount > 300000 && amount <= 500000){
                    tax = (amount - 300000) *(.1) +(.03)*((amount - 300000) *(.1));
                }

                else if(amount > 500000 && amount <= 1000000){
                    tax = ((amount - 500000) *(.2)+25000)+(.03)*((amount - 500000) *(.2)+25000);
                }

                else if(amount > 1000000 ){
                    tax = ((amount - 1000000) *(.3)+125000)+(0.03)*((amount - 1000000) *(.3)+125000);
                }


            }
        });






    }





}
