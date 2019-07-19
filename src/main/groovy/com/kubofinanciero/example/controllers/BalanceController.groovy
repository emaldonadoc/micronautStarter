package com.kubofinanciero.example.controllers

import com.kubofinanciero.example.entities.SavingAccount
import com.kubofinanciero.example.services.BalanceService
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

import javax.inject.Inject

@Controller('/balance')
class BalanceController {

  @Inject
  BalanceService balanceService

  @Get('/{clientId}')
  @Produces(MediaType.APPLICATION_JSON)
  List<SavingAccount> fetchSavingAccount(Long clientId) {
    balanceService.findBalanceByClientId(clientId)
  }
}
