package com.example.calculadora;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public int a = 0;
    public String operacion = "";
    public int b = 0;
    public String ingresoA = "";
    public String ingresoB = "";
    public EditText muestra;
    public EditText resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         muestra = findViewById(R.id.Muestra);
         resultado = findViewById(R.id.resultado);

        Button btn1 = findViewById(R.id.button1);
        Button btn2 = findViewById(R.id.button2);
        Button btn3 = findViewById(R.id.button3);
        Button btn4 = findViewById(R.id.button4);
        Button btn5 = findViewById(R.id.button5);
        Button btn6 = findViewById(R.id.button6);
        Button btn7 = findViewById(R.id.button7);
        Button btn8 = findViewById(R.id.button8);
        Button btn9 = findViewById(R.id.button9);

        Button btnSuma = findViewById(R.id.buttonPlus);
        Button btnResta = findViewById(R.id.buttonMinus);
        Button btnDivicion = findViewById(R.id.buttonDivicion);
        Button btnMultiplicacion = findViewById(R.id.buttonMultiplicacion);
        Button btnIgual = findViewById(R.id.buttonEquals);
        Button btnClear = findViewById(R.id.buttonClear);

        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText("" + calcular());
            }
        });
        btnDivicion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                agregarOperacion("/");
            }
        });
        btnMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                agregarOperacion("×");
            }
        });
        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                agregarOperacion("-");
            }
        });
        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                agregarOperacion("+");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                agregarMostrar(1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                agregarMostrar(2);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                agregarMostrar(3);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                agregarMostrar(4);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                agregarMostrar(5);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                agregarMostrar(6);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                agregarMostrar(7);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                agregarMostrar(8);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                agregarMostrar(9);
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clearCalculator();

            }
        });
    }
    public int calcular () {
        switch (operacion) {
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "×":
                return a*b;
            case "/":
                return a/b;
            default:
                return a+b;
        }
    }
    public void agregarMostrar(Integer muestra) {
        if (operacion == "") {
            if(this.ingresoA == "") {
                this.a = muestra;
            }
            this.ingresoA = "" + a;
            this.muestra.setText(this.ingresoA);
        }else {
            if(this.ingresoB == "") {
                this.b = muestra;
            }
            this.ingresoB = "" + b;
            this.muestra.setText("" + this.ingresoA + " " + this.operacion + " " + this.ingresoB);
        }
    }
    public void agregarOperacion(String operacion) {
        if(this.operacion == "") {
            this.operacion = operacion;
            this.muestra.setText("" + a + " " + this.operacion + " " + b);
        }
    }
    private void clearCalculator() {
        ingresoA = "";
        ingresoB = "";
        operacion = "";
        a = 0;
        b = 0;
        muestra.setText(""); // Limpia el contenido del TextView o EditText donde se muestra el resultado
    }

}