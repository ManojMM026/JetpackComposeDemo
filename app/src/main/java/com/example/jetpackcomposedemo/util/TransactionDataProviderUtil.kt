package com.example.jetpackcomposedemo.util
import com.example.jetpackcomposedemo.model.Transaction

class TransactionDataProviderUtil {
    companion object TransactionUtil {
        /**
         * Create Transaction entries
         */
         fun createTransactionList(): List<Transaction> {
            return listOf(
                Transaction(
                    transactionTitle = "Food Panda",
                    transactionSubtitle = "2 Burgers",
                    amount = 15.99,
                    time = "12:45 PM"
                ),
                Transaction(
                    transactionTitle = "Apple pay",
                    transactionSubtitle = "Subscription",
                    amount = 99.00,
                    time = "05:45 PM"
                ),
                Transaction(
                    transactionTitle = "Netflix",
                    transactionSubtitle = "Subscription",
                    amount = 49.99,
                    time = "04:45 PM"
                ),
                Transaction(
                    transactionTitle = "Paypal",
                    transactionSubtitle = "Send Money",
                    amount = 80.99,
                    time = "03:45 PM"
                ),
                Transaction(
                    transactionTitle = "Amazon",
                    transactionSubtitle = "Product Purchase",
                    amount = 800.00,
                    time = "03:49 PM"
                ),
                Transaction(
                    transactionTitle = "Udemy",
                    transactionSubtitle = "Bought Course",
                    amount = 50.00,
                    time = "06:49 PM"
                ),
            )
        }
    }
}