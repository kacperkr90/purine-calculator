package pl.kacper90.purinecalculator.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

@Dao
interface ProductDao {

    @Query("SELECT * FROM PRODUCT")
    fun getAll(): Product

    @Insert
    fun insertAll(products: Collection<Product>): Unit

    @Delete
    fun delete(product: Product): Unit

}