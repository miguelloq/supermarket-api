package com.example.springarrow.products.domain
/*
import arrow.core.Option
import arrow.core.raise.Raise
import arrow.core.raise.ensure
import arrow.core.raise.ensureNotNull
import arrow.core.right
import com.example.springarrow.products.data.ISupermarketRepository
import com.example.springarrow.products.domain.errors.SupermarketError
import com.example.springarrow.products.domain.models.Product
import com.example.springarrow.products.domain.models.SaleInfo
import com.example.springarrow.products.domain.models.Supermarket
import jakarta.persistence.Id
import org.springframework.stereotype.Service


@Service
class SupermarketService (val repository:ISupermarketRepository){

    context (Raise<SupermarketError>)
    fun supermarketInfo(idSupermarket: Int):Supermarket=
        repository.findById(idSupermarket).let {
            ensureNotNull(it)
            {SupermarketError.Domain.DontExist}
        }


    context (Raise<SupermarketError>)
    fun allSupermarkets():List<Supermarket> = repository.findAll()

    context (Raise<SupermarketError>)
    fun allProductsFrom(idSupermarket: Int):List<Product> =
        supermarketInfo(idSupermarket).storage


    context (Raise<SupermarketError>)
    fun buyProductFrom(supermarketId: Int,productId:Int,quantity:Int) =
        supermarketInfo(supermarketId)
            .storage
            .filter{it.label.id==productId && it.saleInfo is SaleInfo.Salable.Purchasable}
            .also{
                ensure(it.size>=quantity)
            {SupermarketError.Domain.DontHaveThatAmountOfProduct(quantityExpected = quantity, quantityInStorage = it.size)}}
            .let { products ->
                products.map{
                    //TODO
                }
            }
}

*/