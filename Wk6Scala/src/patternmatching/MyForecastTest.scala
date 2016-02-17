package patternmatching

/**
  * Created by geoff_000 on 16/02/2016.
  */

import com.atomicscala.AtomicTest._


object MyForecastTest extends App {

  def forecast(cloudiness: Int): String = cloudiness match{
    case 100 => "Sunny"
    case 80 => "Mostly Sunny"
    case 50 => "Partly Sunny"
    case 20 => "Mostly Cloudy"
    case 0 => "Cloudy"
    case _ => "Unknown"
  }

  println(forecast(80))
  forecast(80) is "Mostly Sunny"

  val sunnyData = Vector(0,20,25,50,80,100)
  for (x <- sunnyData){
    println(forecast(x))
  }








}
