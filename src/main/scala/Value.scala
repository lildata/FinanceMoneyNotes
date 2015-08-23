object IPO {
  def underpricing(firstDayClosingPrice: Folat, subscriptionPrice: Float) = (firstDayClosingPrice - subscriptionPrice) / subscriptionPrice
}
