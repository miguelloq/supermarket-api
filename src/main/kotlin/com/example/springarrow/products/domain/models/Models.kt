package com.example.springarrow.products.domain.models

import java.util.*

data class Label(val id:Int,val name:String, val daysToExpire:Int)

data class Product(val id:Int,val label: Label, val madeDate: Date, val saleInfo:SaleInfo)

sealed class SaleInfo{
    data object NotSallable:SaleInfo()
    sealed class Salable(val price: Double, val discount: Double?) : SaleInfo() {
        data class Purchasable(val itemPrice: Double, val itemDiscount: Double? = null) : Salable(itemPrice, itemDiscount)
        data class Purchased(val itemPrice: Double,val purchaseDate:Date, val itemDiscount: Double? = null) : Salable(itemPrice, itemDiscount)
    }
}

data class Supermarket(val name:String,val storage:List<Product>)
