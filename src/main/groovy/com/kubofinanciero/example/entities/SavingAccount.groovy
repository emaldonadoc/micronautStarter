package com.kubofinanciero.example.entities

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = 'CUENTASAHO')
class SavingAccount {

  @Id
  @Column(name = 'CuentaAhoID')
  Long id

  @Column(name = 'ClienteID')
  Long clientId

  @Column(name = 'TipoCuentaID')
  Long kindAccound

  @Column(name = 'Etiqueta')
  String label

  @Column(name = 'Saldo')
  BigDecimal balance

  @Column(name = 'SaldoDispon')
  BigDecimal balanceAvailable

  @Column(name = 'SaldoBloq')
  BigDecimal balanceBlocked

  @Column(name = 'Estatus')
  String status

  @Column(name = 'EsPrincipal')
  Character isMain

  @ManyToOne
  Customer customer

}
