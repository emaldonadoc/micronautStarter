package com.kubofinanciero.example.services.impl

import com.kubofinanciero.example.entities.SavingAccount
import com.kubofinanciero.example.repositories.BalanceRepository
import spock.lang.Specification

class BalanceServiceImplSpec extends Specification {

  BalanceServiceImpl balanceServiceImpl
  BalanceRepository balanceRepository= Mock()

  def setup() {
    balanceServiceImpl = new BalanceServiceImpl()
    balanceServiceImpl.balanceRepository = balanceRepository
  }

  def "Should return saving account list by client id"() {
    given:


    when:
    def result = balanceServiceImpl.findBalanceByClientId(1l)

    then:
    result
    1 * balanceRepository.findByClientId(_ as Long) >> [new SavingAccount()]
  }

}
