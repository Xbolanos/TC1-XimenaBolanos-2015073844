package com.example.ximena.tc1_ximenabolanos_2015073844;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class MainActivity extends AppCompatActivity {
    private boolean CD=true;
    public void onRadioButtonClicked(View view) {

        // Is the button now checked?

        boolean checked = ((RadioButton) view).isChecked();

        // hacemos un case con lo que ocurre cada vez que pulsemos un botón

        switch(view.getId()) {
            case R.id.radioBtnColonesDolares:
                if (checked)
                    CD=true;
                break;
            case R.id.radioBtnDolaresColones:
                if (checked)
                    CD=false;
                break;

        }
    }
    public void onClickedButton(View view){
        Toast.makeText(MainActivity.this, "Entre",Toast.LENGTH_LONG);
        EditText editText= findViewById(R.id.editTextMonto);
        String monto= editText.getText().toString();
        double numMonto=Double.parseDouble(monto);
        TextView textView= findViewById(R.id.textViewMonto);
        double valor;
        if(CD){
            valor= numMonto/576;

        }else{
            valor= numMonto*576;
        }
        textView.setText(String.valueOf(valor));


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



}
