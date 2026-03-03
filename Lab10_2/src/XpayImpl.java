public class XpayImpl implements Xpay{
    private String creditCardNo;
    private String customerName;
    private String cardExpMonth;
    private String cardExpYear;
    private Short cardCVVNo;
    private Double amount;
// กำหนด type และคุณสมบัติต่างๆ
//    --- CreditCardNo ---
    @Override
    public String getCreditCardNo() {
        return creditCardNo;
    }
    @Override
    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }
//    --- CustomerName ---
    @Override
    public String getCustomerName() {
        return customerName;
    }

    @Override
    public void setCustomerName(String customerName) {
        this.customerName=customerName;
    }

//    --- CardExpMonth ---

    @Override
    public String getCardExpMonth() {
        return cardExpMonth;
    }

    @Override
    public void setCardExpMonth(String cardExpMonth) {
        this.cardExpMonth = cardExpMonth;
    }

//    --- CardExpYear --

    @Override
    public int getCardExpYear() {
        return Integer.parseInt(cardExpYear);
    }

    @Override
    public String setCardExpYear(String cardExpYear) {
        this.cardExpYear = cardExpYear;
        return cardExpYear;
    }

//    --- CardCVVNo ---

    @Override
    public String getCardCVVNo() {
        return String.valueOf(cardCVVNo);
    }

    @Override
    public void setCardCVVNo(Short cardCVVNo) {
        this.cardCVVNo = cardCVVNo;
    }

//    --- Amount ---

    @Override
    public Double getAmount() {
        return amount;
    }
    @Override
    public void setAmount(Double amount) {
        this.amount = amount;
    }

}
