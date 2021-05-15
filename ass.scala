package Ass

object ass {

  def temperature(celsius:Double):Double={
    var Fahrenheit:Double=0
    Fahrenheit = celsius*1.8 + 32
    return Fahrenheit
  }

  def volume(radius:Double):Double={
    var Tot:Double = 0
    val pi:Double = (22).toDouble./(7:Double)
    var r3 = scala.math.pow(5,3)
    Tot = (4).toDouble./(3:Double)*pi*r3
    return BigDecimal(Tot).setScale(4,BigDecimal.RoundingMode.HALF_UP).toDouble
  }

  def cost(books:Int):Double={
    var totalcost:Double =0

    if(books <= 50 ) {
      totalcost = ((60).toDouble./(100: Double) * 24.95 * books) + 3
    }
    else if (books > 50){
      totalcost = ((60).toDouble./(100: Double) * 24.95 * books) + 3 + (books - 50) * 0.75
    }
    return BigDecimal(totalcost).setScale(2,BigDecimal.RoundingMode.HALF_UP).toDouble
  }

  def main(args: Array[String]): Unit = {
    println("\tAssignment 01")
    println("1. Temperature = " + temperature(celsius=35) +" F")
    println("2. Volume = " + volume(5))
    println("3. Total Cost = Rs." + cost(60))
  }

}
