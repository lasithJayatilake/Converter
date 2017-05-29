package jayatilake.converter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.function.DoubleToLongFunction;

public class mass extends AppCompatActivity {
    EditText Gr_input;
    TextView kg_ans,ton_ans,mg_ans,micro_ans,Nano_ans,gram_ans;
    Button btn_back,btn_convert,btn_clear;
    Double kg,ton,mg,ug,ng,g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass);
        kg_ans=(TextView)findViewById(R.id.kg_ans);
        ton_ans=(TextView)findViewById(R.id.ton_ans);
        mg_ans=(TextView)findViewById(R.id.mg_ans);
        micro_ans=(TextView)findViewById(R.id.micro_ans);
        Nano_ans=(TextView)findViewById(R.id.Nano_ans);
        gram_ans=(TextView)findViewById(R.id.gram_ans);
        Gr_input=(EditText)findViewById(R.id.Gr_input);
        btn_convert=(Button)findViewById(R.id.btn_convert);
        btn_convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Gr_input.getText().toString().trim().length()==0)
                {
                    Toast.makeText(mass.this,"Please enter a value",Toast.LENGTH_LONG).show();
                }
                else
                {
                    g = Double.parseDouble(Gr_input.getText().toString());
                    kg=( g / 1000);
                    ton = (g / 1000000);
                    mg=( g * 1000);
                    ug=( g * 1000000);
                    ng=( g * 1000000000);

                    kg_ans.setText(""+kg);
                    ton_ans.setText(""+ton);
                    mg_ans.setText(""+mg);
                    micro_ans.setText(""+ug);
                    Nano_ans.setText(""+ng);
                    gram_ans.setText(""+g);
                }
            }
        });
        btn_back=(Button)findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pre = new Intent(mass.this,second.class);
                startActivity(pre);
            }
        });
        btn_clear=(Button)findViewById(R.id.btn_clear);
        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kg_ans.setText("");
                ton_ans.setText("");
                mg_ans.setText("");
                micro_ans.setText("");
                Nano_ans.setText("");
                gram_ans.setText("");
                Gr_input.setText("");
            }
        });
    }
}
