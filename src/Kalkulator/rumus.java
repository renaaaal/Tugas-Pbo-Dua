/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kalkulator;

/**
 *
 * @author sahabat
 */
public class rumus {
    public int nilaiHasil;
    public float nilaiHasil2;
    int perjumlahan (int a, int b) {
        nilaiHasil = a + b;
        return nilaiHasil;
        
}
       int pengurangan (int a, int b) {
        nilaiHasil = a - b;
        return nilaiHasil;
}
         int perkalian (int a, int b) {
        nilaiHasil = a * b;
        return nilaiHasil;
}
             float pembagian (float a, float b) {
        nilaiHasil2 = a / b;
      return nilaiHasil2;
}
}
