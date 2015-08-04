

object Bank {

  val functions = "Clearing"::"Market making"::"advance clearing"::"intermediation"::Nil


  object BalanceSheet {
    val assets = "Loans"::"Securities"::"Cash Reserves"::Nil
    val liabilities = "Deposit Accounts"::"Other Borrowings"::"Net Worth"::Nil
  }

}

object ShadowBank {

  object BalanceSheet {
    val assets = "Mortgage Backed Security Tranche"::"Interest Rate Swap"::"Credit Default Swap"::Nil
    // Money Market Borrowing
    val liabilities = "Repurchase agreement"::"Asset Backed Commercial Paper"::"Auction Rate Securities"::"Eurodollar Borrowing"::Nil
  }

}
