package ru.ksu.motygullin.calculator20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result;
    TextView bar;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button zero;
    Button plus;
    Button minus;
    Button divide;
    Button multiply;
    Button equals;
    Button C;
    Button comma;
    String current = "";
    boolean isANumber = true;
    boolean firstZero = current.startsWith("0");
    StackParser stackParser = new StackParser();
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        result =(TextView) findViewById(R.id.result);
        bar =   (TextView) findViewById(R.id.tv);
        one =   (Button)  findViewById(R.id.one);
        two =    (Button)  findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four =   (Button) findViewById(R.id.four);
        five =   (Button) findViewById(R.id.five);
        six =   (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine =  (Button) findViewById(R.id.nine);
        zero =  (Button) findViewById(R.id.zero);
        plus =   (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        divide = (Button) findViewById(R.id.divide);
        multiply =(Button) findViewById(R.id.multiplies);
        equals = (Button) findViewById(R.id.equal);
        C =      (Button) findViewById(R.id.C);
        comma =  (Button) findViewById(R.id.comma);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isANumber) {
                    current = current+"1";
                    bar.setText(current);
                } else {
                    isANumber = true;
                    bar.setText("");
                    current = current+"1";
                    bar.setText(current);
                }
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isANumber) {
                    current = current+"2";
                    bar.setText(current);
                } else {
                    isANumber = true;
                    bar.setText("");
                    current = current+"2";
                    bar.setText(current);
                }
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isANumber) {
                    current = current+"3";
                    bar.setText(current);
                } else {
                    isANumber = true;
                    bar.setText("");
                    current = current+"3";
                    bar.setText(current);
                }
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isANumber) {
                    current = current+"4";
                    bar.setText(current);
                } else {
                    isANumber = true;
                    bar.setText("");
                    current = current+"4";
                    bar.setText(current);
                }
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isANumber) {
                    current = current+"5";
                    bar.setText(current);
                } else {
                    isANumber = true;
                    bar.setText("");
                    current = current+"5";
                    bar.setText(current);
                }
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isANumber) {
                    current = current+"6";
                    bar.setText(current);
                } else {
                    isANumber = true;
                    bar.setText("");
                    current = current+"6";
                    bar.setText(current);
                }
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isANumber) {
                    current = current+"7";
                    bar.setText(current);
                } else {
                    isANumber = true;
                    bar.setText("");
                    current = current+"7";
                    bar.setText(current);
                }
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isANumber) {
                    current = current+"8";
                    bar.setText(current);
                } else {
                    isANumber = true;
                    current = current+"8";
                    bar.setText("");
                    bar.setText(current);
                }
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isANumber) {
                    current = current+"9";
                    bar.setText(current);
                } else {
                    isANumber = true;
                    bar.setText("");
                    current = current+"9";
                    bar.setText(current);
                }
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!firstZero) {
                    firstZero = true;
                    if (isANumber) {

                        current = current + "0";
                        bar.setText(current);
                    } else {
                        isANumber = true;
                        bar.setText("");
                        current = current + "0";
                        bar.setText(current);
                    }
                }
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isANumber) {
                    isANumber = false;
                    current = current+"+";
                    result.setText(current);
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isANumber) {
                    isANumber = false;
                    current = current+"-";
                    result.setText(current);
                }
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isANumber) {
                    isANumber = false;
                    current = current+"/";
                    result.setText(current);
                }
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isANumber) {
                    isANumber = false;
                    current = current+"*";
                    result.setText(current);
                }
            }
        });
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isANumber) {
                    String str = stackParser.Parse(current);
                    result.setText("");
                  bar.setText(str);
                    current = str;
                }
            }
        });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                current = "";
                bar.setText("");
                result.setText("");
                isANumber = true;
            }
        });
        comma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isANumber) {
                    if (firstZero) {
                        current = current + ".";
                    }
                }
            }
        });
    }
}
