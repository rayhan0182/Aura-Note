package com.example.auranote
import android.content.Context
import androidx.room.Room
import com.example.auranote.room.Appdatabase

object Roombase {

    private var INSTANCE: Appdatabase? = null

    fun getDatabase(context: Context): Appdatabase {
        return INSTANCE ?: synchronized(this) {
            val instance = Room.databaseBuilder(
                context.applicationContext,
                Appdatabase::class.java,
                "aura_note_db"
            ).build()
            INSTANCE = instance
            instance
        }
    }
}
