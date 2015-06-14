
object FinancialAnalysis {

  /**
   * percent of total sales revenue that the company retains after incurring the direct costs associated with producing the goods and services sold
   */
  def gross_margin(is:IncomeStatement) = is.gross_profit / is.net_sales


  /**
   * measurement of what proportion of a company's revenue is left over after paying for variable costs of production such as wages, raw materials, etc.
   */
  def operating_margin(is:IncomeStatement) = is.operating_profit / is.net_sales



  def net_profit_margin(is:IncomeStatement) = is.net_income / is.net_sales

  /**
   * ROE is a ratio that reflects returns on past investments in the firm
   * Also known as return on net worth
   */
  def return_on_equity(is:IncomeStatement, bs:BalanceSheet) = is.net_income / bs.ownership_equity


  /**
   * ROA is prefered over ROE as it is not sensitive to the firm choice of leverage
   */
  def return_on_assets(is:IncomeStatement, bs:BalanceSheet) = is.net_income / bs.assets


  /def


  /**
   * Risk, Gearing or Leverage
   * can be Debt / Equity or Long-term Debt / Equity or Total Liabilities / Equity
   */
  def debt_equity_ratio(bs:BalanceSheet) =
    bs.liabilities / bs.ownership_equity


  /**
   *
   */
  def debt_market_value_equity_ratio(bs:BalanceSheet, market_value_of_equity:Float) =
    bs.liabilities / market_value_of_equity


  def debt_ratio(bs:BalanceSheet) =
    bs.liabilities / bs.assets


  /**
   * expresses the likelihood of a financial distress
   * and the ability of the firm to generate sufficient income to cover interest expense
   */
  def interest_coverage_ratio(is:IncomeStatement) =
    is.EBIT / is.interest_expenses


  /**
   * capture the firm's ability to effectively use its assets in generating revenue
   */
  def total_asset_turnover(is:IncomeStatement,bs:BalanceSheet) =
    is.net_sales / bs.assets

  def inventory_turnover(is:IncomeStatement,bs:BalanceSheet) =
    is.costs_of_goods_sold / bs.inventory

  def day_in_inventory(is:IncomeStatement,bs:BalanceSheet) =
    365 / inventory_turnover(is,bs)

  def accounts_receivable_turnover(is:IncomeStatement,bs:BalanceSheet) =
    is.net_sales / bs.accounts_receivable

  def average_collection_period(is:IncomeStatement,bs:BalanceSheet) =
    365 / accounts_receivable_turnover(is,bs)


}
