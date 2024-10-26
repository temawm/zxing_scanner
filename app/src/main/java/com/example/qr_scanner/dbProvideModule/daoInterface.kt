package com.example.qr_scanner.dbProvideModule

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow


@Dao
interface DaoInterface {
    @Insert
    suspend fun insertProductInDatabase(product: Product){}

    @Query("SELECT * FROM Product")
    fun getAllProducts(): Flow<List<Product>>
}