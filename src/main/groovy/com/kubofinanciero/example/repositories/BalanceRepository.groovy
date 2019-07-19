package com.kubofinanciero.example.repositories


import com.kubofinanciero.example.entities.SavingAccount

interface BalanceRepository {
  List<SavingAccount> findByClientId(Long clientId)
}
