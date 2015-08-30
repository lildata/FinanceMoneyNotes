object MA {

  /**
   * 
   * @param Vb the present value of the bidding firm's cash flows in the absence of the aquisition
   * @param Vt the present value of the target firm's cash flows in the absence of the aquisition
   * @param Vb the present value of the merged firms' cash flows following the aquisition
   * @return Synergistic benefits from acquisition
   * 
   */
  def GAIN(Vb:Float, Vt:Float, Vbt:Float) = Vbt - (Vb + Vt) 
}
