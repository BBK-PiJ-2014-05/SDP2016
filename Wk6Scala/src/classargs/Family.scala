package classargs

/**
  * Created by geoff_000 on 16/02/2016.
  */
class Family(members: String*) {

  var mum: String = ""
  var dad: String = ""

  for (x <- members){
    if (x == "mum"){
      mum = x
    } else if (x == "dad"){
      dad = x
    }
  }







  def familySize()={
    members.size
  }


}
