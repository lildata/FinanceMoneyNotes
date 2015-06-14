import java.util.Date

abstract class FinancialStatement {
  val names = "Financial Statement"
  val description = ""
}

/**
 * FIXME the Balance Sheet is a mess...
 *
 * @param date
 */
class BalanceSheet(date:Date) extends FinancialStatement {
  override val names = "Balance Sheet"::"Statement of financial position"::Nil
  override val description = "A snapshot of a company's financial condition"

  /**
   * accounting process conducted to confirm that the balances held
   */
  def substanciation : Unit = {
    //TODO
  }

/*

  //def current_assets = cash + accounts_receivable + prepaid_expenses

  var tangible_assets = 0 //or property_plant_equipement
  var investment_property = 0
  var intangible_assets = 0// includes patents, copyrights, franchises, goodwill, trademarks, trade names.
  var financial_assets = 0
  //...
  */

  var cash = 0
  var cash_equivalents = 0
  var accounts_receivable = 0
  var prepaid_expenses = 0
  var inventory = 0

  def current_assets = 0
  def fixed_assets = 0


  /*
  var account_payable
  var */

  def assets = current_assets + fixed_assets


  var current_liabilities = 0

  def liabilities = null
  def ownership_equity = null

  assert(assets == liabilities + ownership_equity)


  def net_working_capital = current_assets - current_liabilities
}




class IncomeStatement(from:Date, to:Date) extends FinancialStatement {
  override val names = "Income statement"::"Profit and loss account"::"Profit and loss statement"::"P&L"::"Revenue statement"::"Statement of financial performance"::"Earnings statement"::"Operating statement"::"Statement of operations"::Nil

  //val revenues = 0
  //val expenses = 0


  var interest_expenses = 0 // see how we can relate it to IBIE EBIT etc


  var gross_sales = 0
  var customer_discounts = 0
  var returns = 0
  var allowances = 0
  def deductions = customer_discounts + returns + allowances
  def net_sales = gross_sales - deductions
  var costs_of_goods_sold = 0
  def gross_profit = net_sales - costs_of_goods_sold
  var indirect_costs = 0
  def operating_profit = gross_profit - indirect_costs // or operating profit
  var other_income = 0
  def EBITDA = operating_profit + other_income //Earnings before Interest and Taxes, Depreciation and Amortization
  var depreciation_amortization = 0
  def EBIT = EBITDA - depreciation_amortization
  var interest = 0
  def EBT = EBIT - interest
  var tax = 0
  def net_income = EBT - tax

}


class CashFlowStatement(from:Date, to:Date) extends FinancialStatement {
  override val names = "Cash Flow Statement"::Nil
}
