/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author josue
 */
@Named(value = "calculadora")
@SessionScoped
public class Calculadora implements Serializable {

    /**
     * Creates a new instance of Calculadora
     */
    private static final long serialVersionUID = 1L;
    private double numero1;
    private double numero2;
    private double resultado;

    public Calculadora() {
    }

    public String suma() {
        resultado = numero1 + numero2;
        return "";
    }

    public String resta() {
        resultado = numero1 - numero2;
        return "";
    }

    public String multiplicacion() {
        resultado = numero1 * numero2;
        return "";
    }

    public String division() {
        resultado = numero1 / numero2;
        return "";
    }


    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

}
