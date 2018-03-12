package com.project.kevin.braceletproject;

/**
 * Created by Lab Redes on 12/03/2018.
 */

public class Metodos {



    public static int calcular(int cantidad,String tipoDivisa, String tipoMaterial, String tipoDije, String tipoMetal){
        int resultado = 0;
        if(tipoDivisa == "USD"){
            resultado = cantidad * (dolar(tipoMaterial,tipoDije,tipoMetal));

        }else{
            resultado = cantidad * (peso(tipoMaterial,tipoDije,tipoMetal));
        }
        return resultado;
    }

    public static int dolar(String tipoMaterial, String tipoDije, String tipoMetal){
        int resultado = 0;

        if(tipoMaterial == "Cuero"){

            if(tipoDije == "Martillo"){

                if(tipoMetal == "Oro" || tipoMetal == "Oro Rosado"){
                    resultado = 100;
                }else if(tipoMetal == "Plata" ){
                    resultado = 80;
                }else if(tipoMetal == "Niquel"){
                    resultado = 70;
                }

            }else{

                if(tipoMetal == "Oro" || tipoMetal == "Oro Rosado"){
                    resultado = 120;
                }else if(tipoMetal == "Plata" ){
                    resultado = 100;
                }else if(tipoMetal == "Niquel"){
                    resultado = 90;
                }
            }
        }else{
            if(tipoDije == "Martillo"){

                if(tipoMetal == "Oro" || tipoMetal == "Oro Rosado"){
                    resultado = 90;
                }else if(tipoMetal == "Plata" ){
                    resultado = 70;
                }else if(tipoMetal == "Niquel"){
                    resultado = 50;
                }

            }else{

                if(tipoMetal == "Oro" || tipoMetal == "Oro Rosado"){
                    resultado = 110;
                }else if(tipoMetal == "Plata" ){
                    resultado = 90;
                }else if(tipoMetal == "Niquel"){
                    resultado = 80;
                }
            }
        }

        return resultado;
    }

    public static int peso(String tipoMaterial, String tipoDije, String tipoMetal){
        int resultado = 0;

        if(tipoMaterial == "Cuero"){

            if(tipoDije == "Martillo"){

                if(tipoMetal == "Oro" || tipoMetal == "Oro Rosado"){
                    resultado = 300000;
                }else if(tipoMetal == "Plata" ){
                    resultado = 240000;
                }else if(tipoMetal == "Niquel"){
                    resultado =  210000;
                }

            }else{

                if(tipoMetal == "Oro" || tipoMetal == "Oro Rosado"){
                    resultado = 360000;
                }else if(tipoMetal == "Plata" ){
                    resultado = 300000;
                }else if(tipoMetal == "Niquel"){
                    resultado = 270000;
                }
            }
        }else{
            if(tipoDije == "Martillo"){

                if(tipoMetal == "Oro" || tipoMetal == "Oro Rosado"){
                    resultado = 270000;
                }else if(tipoMetal == "Plata" ){
                    resultado = 210000;
                }else if(tipoMetal == "Niquel"){
                    resultado = 150000;
                }

            }else{

                if(tipoMetal == "Oro" || tipoMetal == "Oro Rosado"){
                    resultado = 330000;
                }else if(tipoMetal == "Plata" ){
                    resultado = 270000;
                }else if(tipoMetal == "Niquel"){
                    resultado = 240000;
                }
            }
        }

        return resultado;
    }
}
