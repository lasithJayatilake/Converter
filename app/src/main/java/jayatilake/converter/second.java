package jayatilake.converter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class second extends AppCompatActivity {
    Button length_btn,mass_btn,volume_btn,temp_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        length_btn = (Button)findViewById(R.id.length_btn);
        length_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lengthPage = new Intent(second.this, length.class);
                startActivity(lengthPage);
            }
        });
        mass_btn=(Button)findViewById(R.id.mass_btn);
        mass_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent massPage = new Intent(second.this,mass.class);
                startActivity(massPage);
            }
        });
        volume_btn=(Button)findViewById(R.id.volume_btn);
        volume_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent volumePage = new Intent(second.this,volume.class);
                startActivity(volumePage);
            }
        });
        temp_btn = (Button)findViewById(R.id.temp_btn);
        temp_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent temperaturePage = new Intent(second.this,temperature.class);
                startActivity(temperaturePage);
            }
        });
    }
}
