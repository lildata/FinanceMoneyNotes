object Money {
  //the 4 prices of money
  val prices = Map(
    "Par"           -> "different types of money (currency, deposits)",
    "Interest"      -> "future money (fed funds, Eurodollars, repo)",
    "Exchange rate" -> "foreign money",
    "Price level"   -> "commodities"
  )
  

  val hierarchyFlat = OrderedMap(
    "Gold"      ->  "ultimate money because it is the ultimate international means of payment",
    "Currency"  ->  "a form of credit in the sense that they are promises to pay gold",
    "Deposit"   ->  "promises to pay currency on demand",
    "Securities"->  "promises to pay currency over some time horizon in the future"
  )
  
  
  
  
}
