package com.kubofinanciero.example.services

import com.kubofinanciero.example.entities.SavingAccount

interface BalanceService {
  List<SavingAccount> findBalanceByClientId(Long clientId)
}