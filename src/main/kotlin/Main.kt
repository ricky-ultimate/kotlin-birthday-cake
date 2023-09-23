fun main() {
    val age = 24
    val layers = 5
    printCakeCandles(age)
    printCakeTop(age)
    printCakeBottom(age, layers)
    println()
    println("  Happy birthday (*^_^*)  ")
}

fun printCakeTop(age: Int){
    repeat(age + 2){
        print("=")
    }
    println()
}

fun printCakeCandles(age: Int){
    print(" ")
    repeat(age){
        print(",")   // the ',' represents the candle flame
    }
    println()

    print(" ")

    repeat(age){
        print("|")  // the '|' represents the candle body
    }
    println()
}

fun printCakeBottom(age: Int, layers: Int){
    repeat(layers){
        repeat(age + 2){
            print("@")
        }
        println()
    }
}