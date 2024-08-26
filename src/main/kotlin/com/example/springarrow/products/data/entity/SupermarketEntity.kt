package com.example.springarrow.products.data.entity

import com.example.springarrow.products.domain.models.Label
import com.example.springarrow.products.domain.models.Product
import com.example.springarrow.products.domain.models.SaleInfo
import java.util.*

data class SupermarketEntity(val id:Int,val name:String, val storage:List<Product>){
    object Random{
        fun generate():List<SupermarketEntity>{
            val label1 = Label(0,name = "Milk", daysToExpire = 10)
            val label2 = Label(1,name = "Bread", daysToExpire = 5)
            val label3 = Label(2,name = "Cheese", daysToExpire = 20)

            val saleInfo1 = SaleInfo.Salable.Purchasable(itemPrice = 3.99)
            val saleInfo2 = SaleInfo.Salable.Purchased(itemPrice = 2.49, purchaseDate = Date())
            val saleInfo3 = SaleInfo.NotSallable

            val product1 = Product(label = label1, madeDate = Date(),id=1, saleInfo = saleInfo1)
            val product2 = Product(label = label2, madeDate = Date(),id=2, saleInfo = saleInfo2)
            val product3 = Product(label = label3, madeDate = Date(),id=3, saleInfo = saleInfo3)

            val supermarketEntity1 = SupermarketEntity(id = 1,name="São Luiz", storage = listOf(product1, product2))
            val supermarketEntity2 = SupermarketEntity(id = 2,name="Guara", storage = listOf(product3))

            return listOf(supermarketEntity1, supermarketEntity2)
        }
    }

}
