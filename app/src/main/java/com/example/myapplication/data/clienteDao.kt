package com.example.myapplication.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface clienteDao {
    @Insert
    suspend fun insert (cliente: cliente)

    @Update
    suspend fun update (cliente: cliente)

    @Upsert
    suspend fun upsert (cliente: cliente)

    @Delete
    suspend fun delete (cliente: cliente)

    @Query("SELECT * FROM clientes")
    fun listar(): Flow<List<cliente>>
}