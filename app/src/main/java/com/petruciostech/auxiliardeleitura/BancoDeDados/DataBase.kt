package com.petruciostech.auxiliardeleitura.BancoDeDados

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(LivroModel::class), version = 1)
abstract class DataBase : RoomDatabase(){
    abstract fun livroDao():LivroDAO

    companion object {
        @Volatile
        private var INSTANCE: DataBase? = null

        fun getInstance(context: Context): DataBase {
            synchronized(this) {
                var instance: DataBase? = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context,
                        DataBase::class.java,
                        "app_database"
                    ).allowMainThreadQueries().build()
                    //Arrumar um modo de retirar o allowMainThreadQueries()
                }

                return instance
            }
        }
    }
}