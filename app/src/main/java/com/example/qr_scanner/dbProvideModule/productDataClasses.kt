package com.example.qr_scanner.dbProvideModule

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Product")
data class Product(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val numberQR: Int,
    val name: String,
    val price: Double,
    val quantity: Int,
    val imageUrl: String? = null,
)
