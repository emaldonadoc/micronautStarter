package com.kubofinanciero.example.services.impl

import com.kubofinanciero.example.entities.SavingAccount
import com.kubofinanciero.example.repositories.BalanceRepository
import com.kubofinanciero.example.services.BalanceService
import groovy.util.logging.Slf4j

import javax.inject.Inject

@Slf4j
class BalanceServiceImpl implements BalanceService {

  @Inject
  BalanceRepository balanceRepository

  @Override
  List<SavingAccount> findBalanceByClientId(Long clientId) {
    balanceRepository.findByClientId(clientId)
  }
}
