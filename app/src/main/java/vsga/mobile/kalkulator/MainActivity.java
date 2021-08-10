package vsga.mobile.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText input1, input2;
    Button btnTambah, btnKurang, btnKali, btnBagi, btnBersihkan;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = (EditText) findViewById(R.id.input1);
        input2 = (EditText) findViewById(R.id.input2);
        btnTambah = (Button) findViewById(R.id.btnTambah);
        btnKurang = (Button) findViewById(R.id.btnKurang);
        btnKali = (Button) findViewById(R.id.btnKali);
        btnBagi = (Button) findViewById(R.id.btnBagi);
        btnBersihkan = (Button) findViewById(R.id.btnBersihkan);
        hasil = (TextView) findViewById(R.id.hasil);
        Context context = getApplicationContext();
        CharSequence text = "Mohon Masukkan Angka pertama & kedua";
        int duration = Toast.LENGTH_SHORT;

        btnTambah.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if ((input1.getText().length() > 0) && (input2.getText().length() > 0)){
                    double angka1 = Double.parseDouble(input1.getText().toString());
                    double angka2 = Double.parseDouble(input2.getText().toString());
                    double result = angka1 + angka2;
                    hasil.setText(Double.toString(result));
                }
                else{
                    Toast toast = Toast.makeText(context, text , duration);
                    toast.show();
                }
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if ((input1.getText().length() > 0) && (input2.getText().length() > 0)){
                    double angka1 = Double.parseDouble(input1.getText().toString());
                    double angka2 = Double.parseDouble(input2.getText().toString());
                    double result = angka1 - angka2;
                    hasil.setText(Double.toString(result));
                }
                else{
                    Toast toast = Toast.makeText(context, text , duration);
                    toast.show();
                }
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if ((input1.getText().length() > 0) && (input2.getText().length() > 0)){
                    double angka1 = Double.parseDouble(input1.getText().toString());
                    double angka2 = Double.parseDouble(input2.getText().toString());
                    double result = angka1 * angka2;
                    hasil.setText(Double.toString(result));
                }
                else{
                    Toast toast = Toast.makeText(context, text , duration);
                    toast.show();
                }
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if ((input1.getText().length() > 0) && (input2.getText().length() > 0)){
                    double angka1 = Double.parseDouble(input1.getText().toString());
                    double angka2 = Double.parseDouble(input2.getText().toString());
                    double result = angka1 / angka2;
                    hasil.setText(Double.toString(result));
                }
                else{
                    Toast toast = Toast.makeText(context, text , duration);
                    toast.show();
                }
            }
        });

        btnBersihkan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                input1.setText(" ");
                input2.setText(" ");
                hasil.setText("Hasil");
                input1.requestFocus();
            }
        });
    }
}