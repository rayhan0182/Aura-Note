package com.example.auranote.di

import android.content.Context
import com.example.auranote.room.Appdatabase
import com.example.auranote.room.Userdao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import androidx.room.Room

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): Appdatabase {
        return Room.databaseBuilder(
            context,
            Appdatabase::class.java,
            "aura_note_db"
        ).build()
    }

    @Provides
    fun provideUserDao(database: Appdatabase): Userdao {
        return database.userdata()
    }
}
