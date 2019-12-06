package ru.skillbranch.gameofthrones.database

import android.content.Context
import androidx.room.Room

object DatabaseModule {

    lateinit var context: Context

    fun getInstanse() = providesDao(provideDatabase(context))

    fun provideDatabase(context: Context) = Room
        .databaseBuilder(context, AppDatabase::class.java, "app_database")
        .build()

    fun providesDao(database: AppDatabase) = database.appDatabaseDao

}