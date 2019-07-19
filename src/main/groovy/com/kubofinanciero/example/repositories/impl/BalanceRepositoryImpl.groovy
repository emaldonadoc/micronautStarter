package com.kubofinanciero.example.repositories.impl

import com.kubofinanciero.example.entities.SavingAccount
import com.kubofinanciero.example.repositories.BalanceRepository
import io.micronaut.configuration.hibernate.jpa.scope.CurrentSession
import io.micronaut.spring.tx.annotation.Transactional


import javax.inject.Inject
import javax.persistence.EntityManager
import javax.persistence.TypedQuery


class BalanceRepositoryImpl implements BalanceRepository {

  @Inject
  @CurrentSession
  private EntityManager manager

  @Transactional
  @Override
  List<SavingAccount> findByClientId(Long clientId) {
    query("from SavingAccount s where s.clientId = :clientId")
      .setParameter("clientId", clientId)
      .getResultList()
  }

  private TypedQuery query(String queryTxt) {
    manager.createQuery(queryTxt, SavingAccount)
  }

}
