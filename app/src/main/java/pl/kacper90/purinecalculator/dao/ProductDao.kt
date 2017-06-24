package pl.kacper90.purinecalculator.dao

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import android.database.sqlite.SQLiteDatabase
import pl.kacper90.purinecalculator.entity.Product

@Dao
interface ProductDao {

    @Query("SELECT * FROM product")
    fun getAll(): LiveData<Collection<Product>>

    @Query("SELECT * FROM product WHERE id = :productId")
    fun getById(productId: String): LiveData<Product>

    @Insert(onConflict = SQLiteDatabase.CONFLICT_REPLACE)
    fun insertAll(products: Collection<Product>): Unit

    @Delete
    fun delete(product: Product): Unit

}