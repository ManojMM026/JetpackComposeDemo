package com.example.jetpackcomposedemo.util

import com.example.jetpackcomposedemo.model.BankCard

class CardDataProviderUtil {
    companion object BankUtil {
        /**
         * Create horizontal Bank pager data
         */
        fun createBankCards(): List<BankCard> {
            return listOf(
                BankCard(
                    type = "Master",
                    cardNumber = "**** **** **** **** 9090",
                    cardBalance = 4680.0,
                    cardName = "Tim cook",
                    expDate = "07/24"
                ),
                BankCard(
                    type = "Visa",
                    cardNumber = "**** **** **** **** 1023",
                    cardBalance = 86800.0,
                    cardName = "Steve Jobs",
                    expDate = "04/26"
                ),
                BankCard(
                    type = "Master",
                    cardNumber = "**** **** **** **** 1080",
                    cardBalance = 50080.0,
                    cardName = "Elon Musk",
                    expDate = "05/27"
                ),
            )
        }
    }
}