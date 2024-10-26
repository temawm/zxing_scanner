package com.example.qr_scanner.dbProvideModule

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DbHiltModule {
    @Provides
    @Singleton
    fun provideDb(app: Application): MainDb{
        return Room.databaseBuilder(
            app,
            MainDb::class.java,
            "zxing_products_db"
        ).build()
    }
}