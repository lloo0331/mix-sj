package abstracts.moeny

/**
  * Created by li on 2017/9/24.
  */
object US extends CurrencyZone{
  abstract class Dollar extends AbstractCurrencyInScala{
    override def designation: String = "USD"

    override def toString: String =
      ((amount.toDouble / CurrencyUit.amount.toDouble) formatted("%." + decimals(CurrencyUit.amount) + "f")+" " + designation)

    private def decimals(l: Long):Int = {
      if(l ==1) 0 else 1+decimals(l /10)
    }

  }

  override type Currency = Dollar

  override def make(x: Long) = new Dollar {
    override val amount = x
  }

  val Cent = make(1)

  val Dollar = make(100)

  val CurrencyUit = Dollar



}
