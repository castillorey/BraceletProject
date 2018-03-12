package com.project.kevin.braceletproject;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Principal extends AppCompatActivity {

    private EditText cantManillas;
    private Button botonCalcular;
    private TextView valorCosto, valorDivisa;
    private Spinner tipoDivisa, tipoMaterial, tipoDije, tipoMetal;
    private Resources recursos;
    private String divisas[], materiales[], dijes[], metales[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        cantManillas = findViewById(R.id.txtCantManillas);
        botonCalcular = findViewById(R.id.btnCalcular);
        valorCosto = findViewById(R.id.lblCosto);
        valorDivisa = findViewById(R.id.lblDivisa);
        tipoDivisa = findViewById(R.id.cmbTipoDivisa);
        tipoMaterial = findViewById(R.id.cmbTipoMaterial);
        tipoDije = findViewById(R.id.cmbTipoDije);
        tipoMetal = findViewById(R.id.cmbTipoMetal);
        recursos = this.getResources();

        //Setting Spinners
        divisas = recursos.getStringArray(R.array.tipoDivisa);
        ArrayAdapter<String> divisasAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,divisas);
        tipoDivisa.setAdapter(divisasAdapter);

        materiales = recursos.getStringArray(R.array.tipoMaterial);
        ArrayAdapter<String> materialAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,materiales);
        tipoMaterial.setAdapter(materialAdapter);

        dijes = recursos.getStringArray(R.array.tipoDije);
        ArrayAdapter<String> dijesAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,dijes);
        tipoDije.setAdapter(dijesAdapter);

        metales = recursos.getStringArray(R.array.tipoMetal);
        ArrayAdapter<String> metalesAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,metales);
        tipoMetal.setAdapter(metalesAdapter);


        tipoDivisa.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                switch(i){
                    case 0:
                        valorDivisa.setText(recursos.getString(R.string.dolar));
                        break;
                    case 1:
                        valorDivisa.setText(recursos.getString(R.string.peso));
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public boolean validarCantidad(){

        if(cantManillas.getText().toString().isEmpty()){
            cantManillas.requestFocus();
            cantManillas.setError(recursos.getString(R.string.error_cantidad_vacio));
            return false;
        }

        if(Integer.parseInt(cantManillas.getText().toString()) == 0){
            cantManillas.requestFocus();
            cantManillas.setError(recursos.getString(R.string.error_cantidad_cero));
            return false;
        }

        return true;
    }

    public void limpiar(View v){
        valorCosto.setText("0");
        valorDivisa.setText("USD");
        cantManillas.setText("");

        tipoDivisa.setSelection(0);
        tipoMaterial.setSelection(0);
        tipoDije.setSelection(0);
        tipoMetal.setSelection(0);

        cantManillas.requestFocus();
    }
}
