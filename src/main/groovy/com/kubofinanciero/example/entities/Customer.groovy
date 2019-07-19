package com.kubofinanciero.example.entities

import com.fasterxml.jackson.annotation.JsonIgnore

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = 'CLIENTES')
class Customer {
  @Id
  @Column(name = 'CLienteID')
  Integer clientId

  @Column(name = 'PrimerNombre')
  String firstName

  @Column(name = 'Correo')
  String email

  @JsonIgnore
  @OneToMany(mappedBy = 'customer')
  Set<SavingAccount> savingAccounts = new HashSet<>()

}
