fun main() {

    val foodOrder=FoodOrder.Builder("salad")
        .bread("white bread")
        .meat("bacon")

        .condiments("olive oil")
        .build()
    println("the order details ara :\n"+
            foodOrder.bread+"\n"+
            foodOrder.meat+"\n"+
            foodOrder.fish+"\n"+
            foodOrder.dish+"\n"+
            foodOrder.condiments
    )

}

class FoodOrder private
     constructor(val bread:String?,
                 val meat:String?,
                 val fish:String?,
                 val condiments:String?,
                 val dish:String?){
         class Builder(private  var dish :String,
           private var  bread:String?=null,
           private var  meat:String?=null,
           private var  fish:String?=null,
           private  var condiments:String?=null
            ){
            fun bread(bread:String)=apply { this.bread=bread }
            fun meat(meat:String)=apply { this.meat=meat }
            fun fish(fish:String)=apply { this.fish=fish }
            fun condiments(condiments:String)=apply { this.condiments=condiments }
            fun build()=FoodOrder(bread,meat,fish,condiments,dish)
        }

}