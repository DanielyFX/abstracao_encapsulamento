package org.example.ex1;

public record ContaBancariaRequest(double saldo, double chequeEspecial, boolean usoChequeEspecial) {
     public ContaBancariaRequest(double saldo){
         this(saldo, calcularChequeEspecial(saldo), false);
     }

     public static Double calcularChequeEspecial(double saldo){
         return saldo <= 500 ? 50 : saldo * 0.50;
     }

     public static void verificarSaldo(double saldo){
         if (saldo < 0){
             throw new IllegalArgumentException("Saldo não pode ser negativo");
         }
     }
}
