package jayatilake.converter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class temperature extends AppCompatActivity {
    TextView res;
    EditText temp;
    RadioButton fToC,cToF,kToF,fToK,kToC,cToK;
    Button back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);
        temp = (EditText) findViewById(R.id.editText);
        cToF = (RadioButton) findViewById(R.id.cToFRadioButton);
        fToC = (RadioButton) findViewById(R.id.fToCRadioButton);
        kToF = (RadioButton) findViewById(R.id.kToFRadioButton);
        fToK = (RadioButton) findViewById(R.id.fToKRadioButton);
        kToC = (RadioButton) findViewById(R.id.kToCRadioButton);
        cToK = (RadioButton) findViewById(R.id.cToKRadioButton);
        res = (TextView) findViewById(R.id.resultText);
        back_btn = (Button)findViewById(R.id.back_btn);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(temperature.this,second.class);
                startActivity(back);
            }
        });
    }
    public static double celsius2Fahrenheit(double cf){
        return 32+cf*9/5;
    }

    public static double fahrenheit2Celsius(double fc){
        return (fc-32)*5/9;
    }

    public static double kelvin2Fahrenheit(double kf){
        return 32+(kf-273.15)*9/5;
    }

    public static double fahrenheit2Kelvin(double fk){
        return 273.15+(fk-32)*5/9;
    }

    public static double kelvin2Celsius(double kc){
        return kc-273.15;
    }

    public static double celsius2Kelvin(double ck){
        return ck+273.15;
    }

    public void convertEnter(View view) {
        
        if (temp.getText().toString().trim().length()==0)
        {
            Toast.makeText(temperature.this,"Please Enter a value",Toast.LENGTH_LONG).show();
        }
        else {
        
            try {

                double valueT = new Double(temp.getText().toString());

                if (fToC.isChecked())
                    valueT = fahrenheit2Celsius(valueT);
                else if (cToF.isChecked())
                    valueT = celsius2Fahrenheit(valueT);
                else if (kToF.isChecked())
                    valueT = kelvin2Fahrenheit(valueT);
                else if (fToK.isChecked())
                    valueT = fahrenheit2Kelvin(valueT);
                else if (kToC.isChecked())
                    valueT = kelvin2Celsius(valueT);
                else
                    valueT = celsius2Kelvin(valueT);

                valueT = Math.round(valueT * 10000.0) / 10000.0;

                res.setText("Result : " + new Double(valueT).toString());
            }
            catch (Exception e)
            {
                res.setText(e.getMessage());
            }
        }
    }

    public void clearText(View view){
        temp.setText("");
        res.setText("");
    }
}
