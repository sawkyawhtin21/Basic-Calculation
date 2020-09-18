package com.skhh.myapplicationitone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AddNumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_number);
    }
//    public void AddNumber(View view) {
//        EditText edtnum1 = findViewById(R.id.edt_num1);
//        EditText edtnum2 = findViewById(R.id.edt_num1);
//        String   strnum1 = edtnum1.getText().toString().trim();
//        String   strnum2 = edtnum2.getText().toString().trim();
//        int num1 = Integer.parseInt(strnum1);
//        int num2 = Integer.parseInt(strnum2);
//        int res = num1+num2;
//        TextView txtResult = findViewById(R.id.text_result);
//        txtResult.setText("Result="+String.valueOf(res));        // get string and change integer and get inteer to string
//    }



    public void buClick(View view) {
        EditText num1 = findViewById(R.id.edt_num1);  // get edittext user input when bottom click
        EditText num2 = findViewById(R.id.edt_num2);
        int res = 0;
        Button btnSelected = (Button)view;// text casting       // Button data type
        int n1 = Integer.parseInt(num1.getText().toString().trim());
        int n2 = Integer.parseInt(num2.getText().toString().trim());
        if (btnSelected.getId() == R.id.buAdd);
        {
            res = n1+n2;
        }
        if (btnSelected.getId() == R.id.buSub);{
            res = n1-n2;
        }
        if (btnSelected.getId() == R.id.buMul);{
            res = n1*n2;
        }
        if (btnSelected.getId() == R.id.buDiv);{
            res = n1/n2;
        }
        TextView txtResult = findViewById(R.id.text_result);
        txtResult.setText(res+"");  // settext cannot put integer
    }
}