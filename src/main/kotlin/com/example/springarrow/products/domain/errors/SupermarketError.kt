package com.example.springarrow.products.domain.errors

sealed class SupermarketError (){
    sealed class Data:SupermarketError(){
        data object Mapper:Data()
        data object Database:Data()
    }
    sealed class Domain:SupermarketError(){
        data object OutOfSpaceForNewProducts:Domain()
        data class DontHaveThatAmountOfProduct(val quantityExpected:Int, val quantityInStorage:Int):Domain()
        data object DontExist:Domain()
        sealed class BuyUnitary:Domain(){
            data object SpoiledProduct:BuyUnitary()
            data object ProductIsNotSalable:BuyUnitary()
            data object ProductAlreadyBuyed:BuyUnitary()
        }
    }
}
