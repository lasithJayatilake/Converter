package jayatilake.converter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class length extends AppCompatActivity {
    EditText number1_txt;
    Button convert_btn,clear_btn,back_btn;
    TextView mm_answer,y_answer,inch_answer,meter_answer,km_answer,foot_answer;
    Double mm,y,i,m,km,cm,f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);
        number1_txt=(EditText)findViewById(R.id.number1_txt);
        mm_answer=(TextView)findViewById(R.id.mm_answer);
        y_answer=(TextView)findViewById(R.id.y_answer);
        inch_answer=(TextView)findViewById(R.id.inch_answer);
        meter_answer=(TextView)findViewById(R.id.meter_answer);
        km_answer=(TextView)findViewById(R.id.km_answer);
        foot_answer=(TextView)findViewById(R.id.foot_answer);
        convert_btn=(Button)findViewById(R.id.convert_btn);
        convert_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number1_txt.getText().toString().trim().length()==0)
                {
                    Toast.makeText(length.this,"Please Enter a value",Toast.LENGTH_LONG).show();
                }
                else
                {
                    cm = Double.parseDouble(number1_txt.getText().toString());
                    mm = (cm*10);
                    y = (cm*91.44);
                    i = (cm * 2.5);
                    m = ( cm / 100);
                    km = (cm /1000);
                    f = (cm * 30);

                    mm_answer.setText(""+mm);
                    y_answer.setText(""+y);
                    inch_answer.setText(""+i);
                    meter_answer.setText(""+m);
                    km_answer.setText(""+km);
                    foot_answer.setText(""+f);
                }
            }
        });
        clear_btn=(Button)findViewById(R.id.clear_btn);
        clear_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1_txt.setText("");
                mm_answer.setText("");
                y_answer.setText("");
                inch_answer.setText("");
                meter_answer.setText("");
                km_answer.setText("");
                foot_answer.setText("");
            }
        });
        back_btn=(Button)findViewById(R.id.back_btn);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(length.this,second.class);
                startActivity(back);
            }
        });
    }
}
