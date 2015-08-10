

trait Agreement

trait Contract extends Agreement

/**
 * a document guaranteeing the payment of money without condition of a specific amount of money, 
 * either on demand, or at a set time, with the payer named on the document.
 */
trait NegociableInstrument extends Contract

object Cheque extends NegociableInstrument

/**
 * A non-interest-bearing written order used primarily in international trade 
 * that binds one party to pay a fixed sum of money to another party 
 * at a predetermined future date
 */
object BillOfExchange extends NegociableInstrument with NonInterestBearing with Transferable

trait PromissoryNote extends NegociableInstrument

object BankNote extends PromissoryNote



trait InterestBearing
trait NonInterestBearing

trait Transferable


