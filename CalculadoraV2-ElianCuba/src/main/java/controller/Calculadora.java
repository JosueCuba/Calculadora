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

    private double numero1;
    private double numero2;
    private double resultado;

    private String operador;

    public Calculadora() {
    }

    public void operaciones() {
        switch (getOperador()) {
            case "S":
                System.out.println("OPERADOR :" + operador);
                this.suma();
                break;
            case "R":
                System.out.println("OPERADOR :" + operador);
                this.resta();
                break;
            case "M":
                System.out.println("OPERADOR :" + operador);
                this.multiplicacion();
                break;
            case "D":
                System.out.println("OPERADOR :" + operador);
                this.division();
                break;
            default:
                break;
        }
    }

    public void suma() {
        System.out.println("SUMANDO");
        resultado = getNumero1() + getNumero2();
        System.out.println("N1 :" + getNumero1());
        System.out.println("N1 :" + getNumero2());
        System.out.println("RPTA :" + resultado);
    }

    public void resta() {
        resultado = numero1 - numero2;
    }

    public void multiplicacion() {
        resultado = numero1 * numero2;
    }

    public void division() {
        resultado = numero1 / numero2;
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

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

}
