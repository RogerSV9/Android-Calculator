package dsa.eetac.upc.edu.calculator;

import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;

import static java.lang.Math.sin;

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMulti, buttonClear, buttonEqual, buttonDot, buttonSin, buttonCos, buttonTan, buttonUnits;
    EditText editText;
    float ValueOne, ValueTwo;
    boolean Addition, mSubtract, Multiplication, Division, Units = false;
    double rad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.btn_0);
        button1 = (Button) findViewById(R.id.btn_1);
        button2 = (Button) findViewById(R.id.btn_2);
        button3 = (Button) findViewById(R.id.btn_3);
        button4 = (Button) findViewById(R.id.btn_4);
        button5 = (Button) findViewById(R.id.btn_5);
        button6 = (Button) findViewById(R.id.btn_6);
        button7 = (Button) findViewById(R.id.btn_7);
        button8 = (Button) findViewById(R.id.btn_8);
        button9 = (Button) findViewById(R.id.btn_9);
        buttonAdd = (Button) findViewById(R.id.btn_add);
        buttonSub = (Button) findViewById(R.id.btn_sub);
        buttonMulti = (Button) findViewById(R.id.btn_multi);
        buttonDivision = (Button) findViewById(R.id.btn_div);
        buttonClear = (Button) findViewById(R.id.btn_clear);
        buttonEqual = (Button) findViewById(R.id.btn_equals);
        buttonDot = (Button) findViewById(R.id.btn_dot);
        buttonSin = (Button) findViewById(R.id.btn_sin);
        buttonCos = (Button) findViewById(R.id.btn_cos);
        buttonTan = (Button) findViewById(R.id.btn_tan);
        buttonUnits = (Button) findViewById(R.id.btn_units);
        editText = (EditText) findViewById(R.id.editText);
        buttonUnits.setText("Degrees");

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "0");
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText == null) {
                    editText.setText("");
                } else {
                    ValueOne = Float.parseFloat(editText.getText() + "");
                    Addition = true;
                    editText.setText(null);
                }
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueOne = Float.parseFloat(editText.getText() + "");
                mSubtract = true;
                editText.setText(null);
            }
        });

        buttonMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueOne = Float.parseFloat(editText.getText() + "");
                Multiplication = true;
                editText.setText(null);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueOne = Float.parseFloat(editText.getText() + "");
                Division = true;
                editText.setText(null);
            }
        });
        buttonSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Units == false){
                    ValueOne = Float.parseFloat(editText.getText() + "");
                    rad = Math.toRadians(ValueOne);
                }
                else if(Units == true){
                    rad = Double.parseDouble(editText.getText()+"");
                }
                float res = Float.parseFloat(Math.sin(rad) +"");
                editText.setText(res+"");
            }
        });
        buttonCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Units == false){
                    ValueOne = Float.parseFloat(editText.getText() + "");
                    rad = Math.toRadians(ValueOne);
                }
                else if(Units == true){
                    rad = Double.parseDouble(editText.getText()+"");
                }

                float res = Float.parseFloat(Math.cos(rad) +"");
                editText.setText(res+"");
            }
        });
        buttonTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Units == false){
                    ValueOne = Float.parseFloat(editText.getText() + "");
                    rad = Math.toRadians(ValueOne);
                }
                else if(Units == true){
                    rad = Double.parseDouble(editText.getText()+"");
                }

                float res = Float.parseFloat(Math.tan(rad) +"");
                editText.setText(res+"");
            }
        });
        buttonUnits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Units == false){
                    buttonUnits.setText("Radiants");
                    Units = true;
                }
                else{
                    buttonUnits.setText("Degree");
                    Units = false;
                }
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueTwo = Float.parseFloat(editText.getText() + "");

                if (Addition == true) {
                    editText.setText(ValueOne + ValueTwo + "");
                    Addition = false;
                }

                if (mSubtract == true) {
                    editText.setText(ValueOne - ValueTwo + "");
                    mSubtract = false;
                }

                if (Multiplication == true) {
                    editText.setText(ValueOne * ValueTwo + "");
                    Multiplication = false;
                }

                if (Division == true) {
                    editText.setText(ValueOne / ValueTwo + "");
                    Division = false;
                }
            }
        });
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + ".");
            }
        });

    }
}
