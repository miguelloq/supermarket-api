package com.example.springarrow.products.data

import arrow.core.raise.Raise
import com.example.springarrow.products.domain.errors.SupermarketError
import com.example.springarrow.products.domain.models.Product
import com.example.springarrow.products.domain.models.Supermarket

interface ISupermarketRepository{
    fun findAll():List<Supermarket>
    fun findById(id:Int):Supermarket?
    fun updateProducts(idSupermarket: Int, newProducts:List<Product>)
}
