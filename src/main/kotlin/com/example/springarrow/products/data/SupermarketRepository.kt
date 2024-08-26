package com.example.springarrow.products.data

import arrow.core.continuations.EffectScope
import arrow.core.raise.Raise
import com.example.springarrow.products.data.entity.SupermarketEntity
import com.example.springarrow.products.domain.errors.SupermarketError
import com.example.springarrow.products.domain.models.Product
import com.example.springarrow.products.domain.models.Supermarket
import org.springframework.stereotype.Repository


@Repository
class SupermarketRepository:ISupermarketRepository{
    private var supermarkets:List<SupermarketEntity> = SupermarketEntity.Random.generate()

    context (Raise<SupermarketError.Data.Mapper>)
    private fun entityToDomain(supermarket: SupermarketEntity):Supermarket = Supermarket(supermarket.name,supermarket.storage)


    context (Raise<SupermarketError.Data>)
    override fun findAll(): List<Supermarket> =
        supermarkets.map { entityToDomain(it) }

    context (Raise<SupermarketError.Data>)
    override fun findById(id: Int): Supermarket? =
        supermarkets
            .firstOrNull{it.id==id}
            ?.let{entityToDomain(it)}

    context (Raise<SupermarketError.Data>)
    override fun updateProducts(idSupermarket: Int, newProducts:List<Product>){
        supermarkets.map{
            if(it.id==idSupermarket) it.copy(storage = newProducts) else it
        }.also{
            supermarkets=it
        }
    }
}