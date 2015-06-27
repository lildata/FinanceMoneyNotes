package FinancialAnalysis


object ProfitabilityRatios {

    /**
     * percent of total sales revenue that the company retains after incurring the direct costs associated with producing the goods and services sold
     */
    def gross_margin(is: IncomeStatement) =
      is.gross_profit / is.net_sales

    /**
     * measurement of what proportion of a company's revenue is left over
     * after paying for variable costs of production such as
     * wages, raw materials, etc.
     */
    def operating_margin(is: IncomeStatement) =
      is.operating_profit / is.net_sales


    def net_profit_margin(is: IncomeStatement) =
      is.net_income / is.net_sales

    /**
     * ROE is a ratio that reflects returns on past investments in the firm
     * Also known as return on net worth
     */
    def return_on_equity(is: IncomeStatement, bs: BalanceSheet) =
      is.net_income / bs.ownership_equity


    /**
     * ROA is prefered over ROE as it is not sensitive to the firm choice of leverage
     */
    def return_on_assets(is: IncomeStatement, bs: BalanceSheet) =
      is.net_income / bs.assets

  }

  object MarketValuesOfEquity {

    def earnings_per_share = Predef.??? //unclear https://en.wikipedia.org/wiki/Earnings_per_share

    def price_earnings_ratio = Predef.??? //P / EPS

  }

  /**
   * Measuring the proportional use and impact of financing the firm's operations through debt and equity.
   */
  object LeverageMeasures {


    /**
     * Risk, Gearing or Leverage
     * can be Debt / Equity or Long-term Debt / Equity or Total Liabilities / Equity
     */
    def debt_equity_ratio(bs: BalanceSheet) =
      bs.liabilities / bs.ownership_equity


    /**
     *
     */
    def debt_market_value_equity_ratio(bs: BalanceSheet, market_value_of_equity: Float) =
      bs.liabilities / market_value_of_equity


    def debt_ratio(bs: BalanceSheet) =
      bs.liabilities / bs.assets


    /**
     * expresses the likelihood of a financial distress
     * and the ability of the firm to generate sufficient income to cover interest expense
     */
    def interest_coverage_ratio(is: IncomeStatement) =
      is.EBIT / is.interest_expenses


  }

  /**
   * Capture the firm's ability to effectively use its assets in generating revenue
   */
  object EfficiencyMeasures {


    def total_asset_turnover(is: IncomeStatement, bs: BalanceSheet) =
      is.net_sales / bs.assets

    def inventory_turnover(is: IncomeStatement, bs: BalanceSheet) =
      is.costs_of_goods_sold / bs.inventory

    def day_in_inventory(is: IncomeStatement, bs: BalanceSheet) =
      365 / inventory_turnover(is, bs)

    def accounts_receivable_turnover(is: IncomeStatement, bs: BalanceSheet) =
      is.net_sales / bs.accounts_receivable

    def average_collection_period(is: IncomeStatement, bs: BalanceSheet) =
      365 / accounts_receivable_turnover(is, bs)


  }

  /**
   * Accounting liquidity measures short term solvency.
   */
  object LiquidityMeasures {

    def net_working_capital(bs: BalanceSheet) =
      bs.current_assets - bs.current_liabilities

    def current_ratio(bs: BalanceSheet) =
      bs.current_assets / bs.current_liabilities

    /**
     * FIXME
     */
    def quick_ratio(bs: BalanceSheet) =
      (bs.cash + bs.cash_equivalents /*+ marketable_securities */ + bs.accounts_receivable) / bs.current_liabilities

    def cash_ratio(bs: BalanceSheet) =
      (bs.cash + bs.cash_equivalents) / bs.current_liabilities

  }


  object ValueMeasurement {

    def entreprise_value(bs: BalanceSheet, market_value_of_equity: Float) =
      market_value_of_equity + bs.liabilities - bs.cash

    def present_value(cash_flow:Float,discount_rate:Float,years:Int) =
      cash_flow / scala.math.pow((1 + discount_rate), years)

    def future_value(cash_flow:Float,discount_rate:Float,years:Int) = cash_flow * scala.math.pow((1 + discount_rate), years)



  }

