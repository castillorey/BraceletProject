package com.project.kevin.braceletproject;

/**
 * Created by Lab Redes on 12/03/2018.
 */

public class Metodos {



    public static int calcular(int cantidad,int tipoDivisa, int tipoMaterial, int tipoDije, int tipoMetal){
        int resultado = 0;
        if(tipoDivisa == 0){
            resultado = cantidad * (dolar(tipoMaterial,tipoDije,tipoMetal));

        }else{
            resultado = cantidad * (peso(tipoMaterial,tipoDije,tipoMetal));
        }
        return resultado;
    }

    public static int dolar(int tipoMaterial, int tipoDije, int tipoMetal){
        int resultado = 0;
        // Cuero
        if(tipoMaterial == 0){
            // Martilllo
            if(tipoDije == 0){
                // Oro o Oro rosa
                if(tipoMetal == 0 || tipoMetal == 1){
                    resultado = 100;
                // Niquel
                }else if(tipoMetal == 3){
                    resultado = 80;
                // Plata
                }else if(tipoMetal == 2){
                    resultado = 70;
                }

            }
            // Ancla
            if(tipoDije == 1){
                // Oro o Oro rosa
                if(tipoMetal == 0 || tipoMetal == 1){
                    resultado = 120;
                // Niquel
                }else if(tipoMetal == 3 ){
                    resultado = 100;
                // Plata
                }else if(tipoMetal == 2){
                    resultado = 90;
                }
            }
        }
        // Cuerda
        if(tipoMaterial == 1){
            // Martilllo
            if(tipoDije == 0){
                // Oro o Oro rosa
                if(tipoMetal == 0 || tipoMetal == 1){
                    resultado = 90;
                // Niquel
                }else if(tipoMetal == 3 ){
                    resultado = 70;
                // Plata
                }else if(tipoMetal == 2){
                    resultado = 50;
                }

            }
            // Anlca
            if(tipoDije == 1){
                // Oro o Oro rosa
                if(tipoMetal == 0 || tipoMetal == 1){
                    resultado = 110;
                // Niquel
                }else if(tipoMetal == 3 ){
                    resultado = 90;
                // Plata
                }else if(tipoMetal == 2){
                    resultado = 80;
                }
            }
        }

        return resultado;
    }

    public static int peso(int tipoMaterial, int tipoDije, int tipoMetal){
        int resultado = 0;
        // Cuero
        if(tipoMaterial == 0){
            // Martilllo
            if(tipoDije == 0){
                // Oro o Oro rosa
                if(tipoMetal == 0 || tipoMetal == 1){
                    resultado = 300000;
                // Niquel
                }else if(tipoMetal == 3){
                    resultado = 240000;
                // Plata
                }else if(tipoMetal == 2){
                    resultado =  210000;
                }

            }
            // Ancla
            if(tipoDije == 1){
                // Oro o Oro rosa
                if(tipoMetal == 0 || tipoMetal == 1){
                    resultado = 360000;
                // Niquel
                }else if(tipoMetal == 3 ){
                    resultado = 300000;
                // Plata
                }else if(tipoMetal == 2){
                    resultado = 270000;
                }
            }
        }
        // Cuerda
        if(tipoMaterial == 1){
            // Martilllo
            if(tipoDije == 0){
                // Oro o Oro rosa
                if(tipoMetal == 0 || tipoMetal == 1){
                    resultado = 270000;
                // Niquel
                }else if(tipoMetal == 3 ){
                    resultado = 210000;
                // Plata
                }else if(tipoMetal == 2){
                    resultado = 150000;
                }

            }
            // Ancla
            if(tipoDije == 1){
                // Oro o Oro rosa
                if(tipoMetal == 0 || tipoMetal == 1){
                    resultado = 330000;
                // Niquel
                }else if(tipoMetal == 3 ){
                    resultado = 270000;
                // Plata
                }else if(tipoMetal == 2){
                    resultado = 240000;
                }
            }
        }

        return resultado;
    }
}
