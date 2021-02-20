package com.amroid.runtracker.di

import android.content.Context
import androidx.room.Room
import com.amroid.runtracker.db.RunnerDatabase
import com.amroid.runtracker.utils.Constants.DB_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun  provideRunnerDataabase(@ApplicationContext app:Context)=Room.databaseBuilder(app,RunnerDatabase::class.java,DB_NAME).build()
    @Provides
    @Singleton
    fun  provideRunnerDao(runnerDatabase: RunnerDatabase)=runnerDatabase.getRunDao()
}