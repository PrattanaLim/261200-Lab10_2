public class XpayToPayDAdapter implements PayD{
//  สร้าง Object เพื่อเก็บ value ต่างๆ
    private final Xpay xpay;
    public XpayToPayDAdapter(Xpay xpay){
        this.xpay = xpay;
    }
// แปลงพารามิเตอร์ให้เข้ากับที่เราต้องการ
    //    --- CreditCardNo ---

    @Override
    public long getCreditCardNo() {
        return Long.parseLong(xpay.getCreditCardNo()); // แปลง String เป็น Long
    }

    @Override
    public void setCreditCardNo(long creditCardNo) {
        xpay.setCreditCardNo(String.valueOf(creditCardNo)); // แปลง Long เป็น String
    }

//    --- CustomerName ---

    @Override
    public String getCardOwnerName() {
        return xpay.getCustomerName();
    }

    @Override
    public void setCardOwnerName(String cardOwnerName) {
        xpay.setCustomerName(cardOwnerName);
    }

    //    --- CardExpMonthYear ---

    @Override
    public String getCardExpMonthYear() {
        return String.valueOf(xpay.getCardExpMonth() +" "+ xpay.getCardExpYear());
    }

    @Override
    public void setCardExpMonthYear(String cardExpMonthYear) {
        xpay.setCardExpMonth(cardExpMonthYear);
        xpay.setCardExpYear(cardExpMonthYear);
    }

    //    --- CardCVVNo ---

    @Override
    public Integer getCVVNo() {
        return Integer.parseInt(xpay.getCardCVVNo());
    }

    @Override
    public void setCVVNo(Integer cVVNo) {
        xpay.setCreditCardNo(String.valueOf(cVVNo));
    }

    //    --- Amount ---


    @Override
    public Double getTotalAmount() {
        return xpay.getAmount();
    }

    @Override
    public void setTotalAmount(Double totalAmount) {
        this.xpay.setAmount(totalAmount);
    }
}
