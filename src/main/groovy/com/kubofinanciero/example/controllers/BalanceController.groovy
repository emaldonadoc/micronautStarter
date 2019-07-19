package com.kubofinanciero.example.controllers

import com.kubofinanciero.example.entities.SavingAccount
import com.kubofinanciero.example.repositories.BalanceRepository
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

import javax.inject.Inject

@Controller('/balance')
class BalanceController {

  @Inject
  BalanceRepository balanceRepository

  @Get('/{clientId}')
  @Produces(MediaType.APPLICATION_JSON)
  List<SavingAccount> fetchSavingAccount(Long clientId) {
    balanceRepository.findByClientId(clientId)
  }
}
