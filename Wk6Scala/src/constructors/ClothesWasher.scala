package constructors

/**
  * Created by geoff_000 on 17/02/2016.
  */
class ClothesWasher(var modelName:String,var capacity:Double) {

  def this(modelName:String){
    this(modelName,ClothesWasher.DEFAULT_CAPACITY)
  }

  def this(capacity:Double){
    this(ClothesWasher.DEFAULT_MODEL_NAME, capacity)
  }




  object ClothesWasher{
    val DEFAULT_CAPACITY = 100
    val DEFAULT_MODEL_NAME = "BigWash"
  }

}
