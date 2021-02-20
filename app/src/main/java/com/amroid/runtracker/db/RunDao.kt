package com.amroid.runtracker.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface RunDao {

@Insert(onConflict = OnConflictStrategy.REPLACE)
suspend fun inserTRun(run:Run)
 @Delete
 suspend fun deleteRun(run:Run)
  @Query("SELECT * from runnring_table order by timeStamp DESC")
    fun getAllRunSortByTimeStamp():LiveData<List<Run>>
    @Query("SELECT * from runnring_table order by timeinMillis DESC")
    fun getAllRunSortByTimeinMills():LiveData<List<Run>>
    @Query("SELECT * from runnring_table order by distance DESC")
    fun getAllRunSortByDistance():LiveData<List<Run>>
    @Query("SELECT * from runnring_table order by averageSpeed DESC")
    fun getAllRunSortBySpeedAverage():LiveData<List<Run>>
    @Query("SELECT * from runnring_table order by caloriesBurned DESC")
    fun getAllRunSortByCalroyBurnned():LiveData<List<Run>>

  @Query("SELECT SUM(timeStamp) FROM runnring_table")
    fun getTotalTimeStamp():LiveData<List<Long>>

  @Query("SELECT SUM(timeinMillis) FROM runnring_table")
    fun getTotalTimminMills():LiveData<List<Long>>

  @Query("SELECT SUM(distance) FROM runnring_table")
    fun getTotalDistance():LiveData<List<Float>>

  @Query("SELECT SUM(averageSpeed) FROM runnring_table")
    fun getAverageSpeed():LiveData<List<Int>>

    @Query("SElect SUM(caloriesBurned) from runnring_table ")
    fun getCaloriesBurrned():LiveData<List<Float>>





}