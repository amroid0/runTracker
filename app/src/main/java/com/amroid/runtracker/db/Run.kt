package com.amroid.runtracker.db

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "runnring_table")
data class  Run(
    var bmp:Bitmap?=null,
    var timeStamp:Long=0L,
    var timeinMillis:Long=0L,
    var  averageSpeed:Float=0F,
    var distance:Float=0F,
    var caloriesBurned:Int=0

){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=null

}