package com.mjtruss;

public class Main {

  public static void main(String[] args) {
      Account mikesAccount = new Account();
      System.out.println(mikesAccount.getNumber());
      System.out.println(mikesAccount.getBalance());
      
      mikesAccount.withdrawal(100.00);
      
      mikesAccount.deposit(50.00);
      mikesAccount.withdrawal(100.00);
      
      mikesAccount.deposit(51.00);
      mikesAccount.withdrawal(100.00);
      
      Account susiesAccount = new Account("Susie", "susieq@hotmail.com", "12345");
      System.out.println(susiesAccount.getNumber() + " name " + susiesAccount.getCustomerName());
      
      }
}
      
      
