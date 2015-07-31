trait FinancialMarket {
    val def_ = ""
    val goal = "allow to trade fungible items of value at low transaction costs and at prices that reflect supply and demand"
}

object StockMarket extends FinancialMarket {
    val syn = "Equity Market"::Nil
}

object BondMarket extends FinancialMarket {
    val syn = "Debt Market"::"Credit Market"::Nil
    val def_ = "" 
    val goal = "primary goal is to provide long-term funding for public and private expenditures"
}

object DerivativesMarket extends FinancialMarket {
    val def_ = """financial market for derivatives, financial instruments like futures contracts or options, which are derived from other forms of assets."""
}

object CommodityMarket extends FinancialMarket {

}

object ForeignExchangeMarket extends FinancialMarket {
    val syn = "forex"::"FX"::"Currency market"::Nil
    val def_ = """The Foreign Exchange Market is a global decentralized market for the trading of currencies. 
                In terms of volume of trading, it is by far the largest market in the world.
                The foreign exchange market determines the relative values of different currencies.
                It assists international trade and investments by enabling currency conversion."""
}

object Terminology {
    val definitions = Map(
        "floating exchange rate" -> """(fluctuating exchange rate) is a type of exchange-rate regime in which a currency's value is allowed to fluctuate in response to market mechanisms of the foreign-exchange market.""", 
        "floating currency" -> """A currency that uses a floating exchange rate."""
    )
}

object MarketLiquidity {
    object Metrics {
        
        /**
         * Difference between the prices quoted for an immediate sale (bid) and an immediate purchase (offer)
         * Size of the transaction cost
         */
        def bid_askSpread(askPrice:Float,bidPrice:Float) = askPrice - bidPrice
        
        def bid_askSpreadPerc(askPrice:Float,bidPrice:Float) = (askPrice - bidPrice) / ((askPrice + bidPrice)/2)
        
        def isFrictionlessAsset(askPrice:Float,bidPrice:Float) = if(askPrice == bidPrice) true else false
        
        /**
         * Number of shares traded
         */
        var averageDailyVolume:Float
        
        /**
         * Number of shares outstanding
         */
        var float:Float
        
        /**
         * Number of days for the share to get traded again
         */
        def turnover(float:Float,averageDailyVolume:Float):Days = float/averageDailyVolume
        
        /**
         * Indirect measure of the liquidity
         */
        var heldByInstitutions:Percent

    }
}




