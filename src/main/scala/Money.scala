object Money {
  //the 4 prices of money
  val prices = Map(
    "Par"           -> "different types of money (currency, deposits)",
    "Interest"      -> "future money (fed funds, Eurodollars, repo)",
    "Exchange rate" -> "foreign money",
    "Price level"   -> "commodities"
  )
  

  val hierarchyOfFinanacialIntruments = OrderedMap(
    Gold      ->  "ultimate money because it is the ultimate international means of payment",
    Currency  ->  "a form of credit in the sense that they are promises to pay gold",
    Deposit   ->  "promises to pay currency on demand",
    Security  ->  "promises to pay currency over some time horizon in the future"
  )
  
  
  
  
}


trait Credit

object Gold 

trait Currency

trait Deposit extends CashInstrument

trait Security extends CashInstrumentwith with Transferable

trait Loan extends CashInstrument


trait FinancialInstrument extends Contract //or Agreement??

/**
 * instruments whose value is determined directly by the markets
 */
trait CashInstrument extends FinancialInstrument

/**
 * instruments which derive their value from the value and characteristics of one or more underlying entities such as an asset, index, or interest rate
 */
trait DerivativeInstrument extends FinancialInstrument

/**
 * 
 */
abstract class UnitedStatesTreasurySecurity extends ??? {
  val synset = Set("Treasuries")
}

//relationship beween Transferable - Tradable and Markatable???

import scala.concurrent.duration._ // yeah I know it is not meant as a general purpose representation of time

object TreasuryBill extends UnitedStatesTreasurySecurity with Marketable {
  val maxDuration = 1.year
}
object TreasuryNote extends UnitedStatesTreasurySecurity with Marketable {
  val minDuration = 2.year
  val maxDuration = 10.year
}
object TreasuryBond extends UnitedStatesTreasurySecurity with Marketable {
  val minDuration = 20.year
  val maxDuration = 30.year
}

object TreasuryInflationProtectedSecurity extends UnitedStatesTreasurySecurity with Marketable

/**
 * Various notes
 * 
 * Outside Money / Inside Money
 * this is relative...
 * Pretty much all money is inside money
 * Inside money is some form of credit
 * Almost all money is somebody's liabilitiy
