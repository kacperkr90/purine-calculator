package pl.kacper90.purinecalculator.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import pl.kacper90.purinecalculator.entity.Product

@Database(version = 1, entities = arrayOf(Product::class))
abstract class PurineCalculatorDatabase : RoomDatabase() {
    abstract fun productDao(): ProductDao

    
}