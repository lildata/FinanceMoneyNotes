package FinancialAnalysis

trait CentralBank {

}

object FederalReserveSystem extends CentralBank {

  



  object FederalOpenMarketCommittee {
    def setTargetInterbankRate(when:Date) = new FederalFundsRate(when)
    def setDiscountRate(when:Date) = new DiscountRate(when)
  }

}

class FederalReserveBank(district:String) {
  
}

class DiscountRate(when:Date) extends InterestRate { //or base rate, or repo rate
  val defintion = """
    instrument of monetary policy that set the rate at which eligible institutions 
    can borrow money from the central bank, usually on a short-term basis, 
    to meet temporary shortages of liquidity"""
}

trait InterbankRate extends InterestRate

class FederalFundsRate(when:Date) extends InterbankRate

class EuroInterbankOfferedRate(when:Date) extends InterbankRate //Euribor

class LondonInterbankOfferedRate(when:Date) extends InterbankRate //LIBOR
