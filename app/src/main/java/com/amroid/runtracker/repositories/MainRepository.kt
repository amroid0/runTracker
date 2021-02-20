package com.amroid.runtracker.repositories

import androidx.lifecycle.LiveData
import androidx.room.Delete
import androidx.room.Query
import com.amroid.runtracker.db.Run
import com.amroid.runtracker.db.RunDao
import javax.inject.Inject

class MainRepository @Inject constructor(val runDao: RunDao) {
    suspend fun inserTRun(run:Run)=runDao.inserTRun(run = run)

    suspend fun deleteRun(run:Run)=runDao.deleteRun(run)
    fun getAllRunSortByTimeStamp()=runDao.getAllRunSortByTimeStamp()
    fun getAllRunSortByTimeinMills()=runDao.getAllRunSortByTimeinMills()
    fun getAllRunSortByDistance()=runDao.getAllRunSortByDistance()
    fun getAllRunSortBySpeedAverage()=runDao.getAllRunSortBySpeedAverage()
    fun getAllRunSortByCalroyBurnned()=runDao.getAllRunSortByCalroyBurnned()

    fun getTotalTimeStamp()=runDao.getTotalTimeStamp()

    fun getTotalTimminMills()=runDao.getTotalTimminMills()

    fun getTotalDistance()=runDao.getTotalDistance()

    fun getAverageSpeed()=runDao.getAverageSpeed()

    fun getCaloriesBurrned()=runDao.getCaloriesBurrned()

}