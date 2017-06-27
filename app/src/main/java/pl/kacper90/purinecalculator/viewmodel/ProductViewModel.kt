package pl.kacper90.purinecalculator.viewmodel

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel
import pl.kacper90.purinecalculator.entity.Product
import pl.kacper90.purinecalculator.repository.ProductRepository
import javax.inject.Inject

class ProductViewModel @Inject constructor(private val productRepository: ProductRepository) : ViewModel() {

    val products: LiveData<Collection<Product>> = productRepository.getAll()

}