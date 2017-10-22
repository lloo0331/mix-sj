package abstracts.moeny

import java.time.temporal.TemporalAmount

/**
  * Created by li on 2017/9/24.
  */
abstract class CurrencyZone{
  type Currency <:AbstractCurrencyInScala
  def make(amount: Long):Currency

  abstract class AbstractCurrencyInScala {
    val amount:Long
    def designation:String

    override def toString = amount+" "+designation
    def + (that:Currency):Currency = make(this.amount+that.amount)
    def * (x:Double):Currency = make((this.amount*x).toLong)

  }

}


