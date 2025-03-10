package com.example.myapplication.data

import android.content.ClipData
import android.content.Context
import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [cliente::class],
    version = 1,
    exportSchema = false
)
abstract class ClienteDatabase : RoomDatabase() {
    abstract fun clienteDao(): clienteDao

    companion object{
        @Volatile
        private var INSTANCE: ClienteDatabase? = null

        fun getDatabase(context: Context): ClienteDatabase {

        }
    }
}