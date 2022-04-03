fun main() {
    printsOutOddNumber()
    var y = takeInArrayOfNames(arrayOf("Sao", "Abdirahman", "Phelisia", "Pascaline"))
    println(y)
    robotServingDrinks(6)
    robotServingDrinks(3)
    robotServingDrinks(10)
    robotServingDrinks(23)
    printsEachNumber()

}

fun printsOutOddNumber(){
    for (odd in 1..100) if (odd%2 !==0){
        println(odd)

    }
}

fun takeInArrayOfNames(names: Array<String>):Int{
    var x = 0
   names.forEach { name ->
       if (name.length >= 5 ){
           x++
       }
   }
    return  x

}


fun robotServingDrinks(age:Int){
    if (age<6){
        println("Glass of Milk")
    }
    else if (age>=6 && age<15 ){
        println("Bottle of Fanta")
    }
    else{
        println("Bottle of CocaCola")
    }

}

fun printsEachNumber(){
    for (number in 1..100){
        if (number%3 ==0 && number%5 ==0){
            println("FizzBuzz")
        } else if(number%3 ==0){
            println("Fizz")
        } else if(number%5 ==0){
            println("Buzz")
        } else{
            println(number)
        }
    }
}