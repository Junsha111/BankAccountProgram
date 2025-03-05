package com.example.bankaccountprogram

fun main() {
    val junaidsBankAccount = BankAccount(accountHolder = "junaid", balance = 12006.98)
    junaidsBankAccount.deposit(200.00)
    junaidsBankAccount.withdraw(700.0)
    junaidsBankAccount.deposit(98790.0)
    junaidsBankAccount.withdraw(60000.0)

    junaidsBankAccount.displayTransactionHistory()
    println()
}