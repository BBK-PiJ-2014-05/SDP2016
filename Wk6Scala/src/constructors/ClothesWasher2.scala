package constructors

/**
  * Created by geoff_000 on 17/02/2016.
  */



class ClothesWasher2(modelName:String = "Big Wash",capacity:Double = 100) {

  var m = modelName
  var c = capacity



object ClothesWasher2 extends App{
    val x = new ClothesWasher2("Little Wash", 30)
    val y = new ClothesWasher2("Little Wash")
    val z = new ClothesWasher2(capacity=200)




}

}
