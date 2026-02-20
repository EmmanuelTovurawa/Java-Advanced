/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccessModifiers;

/**
 *
 * @author Manex
 */
public class Main {

    public static void main(String[] args) {
        Account timsAccount = new Account("Tim");
        timsAccount.deposit(1000);
        timsAccount.withdraw(500);
        timsAccount.withdraw(-200);
        timsAccount.deposit(-20);
        timsAccount.calculateBalance();
//        timsAccount.balance = 5000;

        System.out.println("Balance on account is " + timsAccount.getBalance());
//      timsAccount.transactions.add(4500);
        timsAccount.calculateBalance();
    }
}