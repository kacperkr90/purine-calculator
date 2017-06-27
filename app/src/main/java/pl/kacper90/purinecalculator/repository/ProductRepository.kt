package pl.kacper90.purinecalculator.repository

import android.arch.lifecycle.LiveData
import pl.kacper90.purinecalculator.db.ProductDao
import pl.kacper90.purinecalculator.entity.Product
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ProductRepository @Inject constructor(val productDao: ProductDao) {

    fun getAll(): LiveData<Collection<Product>> {
        return productDao.getAll()
    }

    fun getById(productId: String): LiveData<Product> {
        return productDao.getById(productId)
    }

    fun insertAll(products: Collection<Product>): Unit {
        return productDao.insertAll(products)
    }

    fun delete(product: Product): Unit {
         productDao.delete(product)
    }

}