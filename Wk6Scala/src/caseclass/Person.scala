package caseclass

/**
  * Created by geoff_000 on 17/02/2016.
  */

import com.atomicscala.AtomicTest._


case class Person(first:String, last:String, email:String) {


  object Person extends App{

    val p = new Person("Jane", "Smile", "jane@smile.com")
    p.first is "Jane"
    p.last is "Smile"
    p.email is "jane@smile.com"

  }

}
