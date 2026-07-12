class Car(var model: String) {

    var price: Double = 0.0
    var owner: String = ""
    var miles: Int = 0

    constructor(model: String, price: Double, owner: String, miles: Int) : this(model) {
        this.price = price
        this.owner = owner
        this.miles = miles
    }

    fun currentPrice(): Double {
        return price - (miles * 10)
    }

    fun display() {
        println("Car Model: $model")
        println("Car Owner: $owner")
        println("Miles Driven: $miles")
        println("Original Price: $price")
        println("Current Price: ${currentPrice()}")
    }
}

fun main() {

    var car1 = Car("BMW", 100000.0, "Aman", 105)
    car1.display()

    println()

    var car2 = Car("Toyota", 500000.0, "Karan", 50)
    car2.display()
}