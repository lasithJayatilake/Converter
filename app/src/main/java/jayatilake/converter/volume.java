package jayatilake.converter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class volume extends AppCompatActivity {
    EditText edittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume);
        final TextView txtone = (TextView) findViewById(R.id.txtone);
        final TextView txttwo = (TextView) findViewById(R.id.txttwo);
        final TextView txtthree = (TextView) findViewById(R.id.txtthree);
        final TextView txtfour = (TextView) findViewById(R.id.txtfour);
        final TextView txtfive = (TextView) findViewById(R.id.txtfive);
        final TextView txtsseven = (TextView) findViewById(R.id.txtseven);
        final TextView txteight = (TextView) findViewById(R.id.txteight);
        final TextView txtnine = (TextView) findViewById(R.id.txtnine);

        final EditText editText = (EditText) findViewById(R.id.etone);

        Button btnone = (Button) findViewById(R.id.btnOne);
        Button btntwo = (Button) findViewById(R.id.btnTwo);
        Button btnthree = (Button) findViewById(R.id.btnThree);


        btnone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String answer = editText.getText().toString();

                if(editText.getText().toString().trim().length()== 0)
                {
                    Toast.makeText(volume.this,"Please Enter a value",Toast.LENGTH_LONG).show();
                }
                else
                {
                    double liter = Double.parseDouble(answer);
                    double mili = (liter*1000);
                    double gallon = (liter *0.219969);
                    double pint = (liter * 1.759);
                    double fOunce = (liter*35.195);
                    double  tbleSpoon= (liter *56.312);
                    double teaSpoon = (liter * 168.936);

                    txtthree.setText(mili+"  ml");
                    txtfour.setText(gallon+"  gallon");
                    txtfive.setText(pint+"  pint");
                    txtsseven.setText(teaSpoon+"  teaspoon");
                    txteight.setText(fOunce+"  fluid ounce");
                    txtnine.setText(tbleSpoon+"  tablespoon");



                }

            }
        });
        btntwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editText.setText("");
                txtthree.setText("");
                txtfour.setText("");
                txtfive.setText("");
                txtsseven.setText("");
                txteight.setText("");
                txtnine.setText("");



            }
        });

        btnthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(volume.this,second.class);
                startActivity(intent);

            }
        });
    }
}
