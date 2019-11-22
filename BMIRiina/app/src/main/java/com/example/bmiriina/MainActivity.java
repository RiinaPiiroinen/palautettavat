package com.example.bmiriina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle; //tilan tallentamiseen
import android.text.Editable; //EditText tapahtumien käsittelyyn
import android.text.TextWatcher; // EditText kuuntelija
import android.widget.EditText; // laskun määrän input
import android.widget.SeekBar; // tippi prosentin muuttamiseen
import android.widget.SeekBar.OnSeekBarChangeListener; // SeekBar kuuntelija
import android.widget.TextView; // tekstin näyttämiseen
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat; // rahan muotoiluun





public class MainActivity extends AppCompatActivity {

    private EditText amountPituus; // näyttää lasketun BMI:n
    private EditText amountPaino; // näyttää lasketun BMI:n
    private TextView amountTulos; // näyttää lasketun BMI:n




    @Override
    protected void onCreate(Bundle savedInstanceState) {




        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amountPituus = (EditText) findViewById(R.id.amountPituus);
        amountPaino = (EditText) findViewById(R.id.amountPaino);
        amountTulos = (TextView) findViewById(R.id.amountTulos);










    }

    public void laske(View v) {
        String Pituus = amountPituus.getText().toString();
        String Paino = amountPaino.getText().toString();


        float PituusMaara = Float.parseFloat(Pituus);
        float PainoMaara = Float.parseFloat(Paino);
        float bmi = PainoMaara /(PituusMaara * PituusMaara);
        String arvoBmi = "";


      if (bmi<18.5) {
          arvoBmi = String.valueOf(bmi).concat("olet alipainoinen");
      }

      else if (18.5<=bmi && 24.9>=bmi) {
            arvoBmi = String.valueOf(bmi).concat("olet normaali painoinen");
        }

      if (25<=bmi && 29.9>=bmi) {
          arvoBmi = String.valueOf(bmi).concat("olet ylipainoinen");
      }

      if (bmi>=30) {
            arvoBmi = String.valueOf(bmi).concat("olet lihava!");

        }
        amountTulos.setText(arvoBmi);

    }



}