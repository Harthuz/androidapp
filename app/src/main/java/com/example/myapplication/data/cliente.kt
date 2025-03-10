package com.example.myapplication.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "clientes")
data class cliente (
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    var nome: String,
    var endereco: String,
    var bairro: String,
    var cep: String,
    var cidade: String
)