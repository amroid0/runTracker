package com.amroid.runtracker.db

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.room.TypeConverter
import java.io.ByteArrayOutputStream
import java.io.OutputStream

class  Converters{
   @TypeConverter
    fun  toByteArra(bmp:Bitmap):ByteArray{
        var outpoStream=ByteArrayOutputStream()
        bmp.compress(Bitmap.CompressFormat.PNG,100,outpoStream);
        return outpoStream.toByteArray();
    }
    @TypeConverter
    fun toBitmap(bytes:ByteArray):Bitmap{
    return    BitmapFactory.decodeByteArray(bytes,0,bytes.size)
    }

}