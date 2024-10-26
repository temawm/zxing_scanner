package com.example.qr_scanner.dbProvideModule

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities =[Product::class],
    version = 1
)
abstract class MainDb: RoomDatabase() {
    abstract val dao: DaoInterface
}