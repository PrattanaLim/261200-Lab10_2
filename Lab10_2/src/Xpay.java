public interface Xpay {
    String getCreditCardNo();
    String getCustomerName();
    String getCardExpMonth();
    int getCardExpYear();
    String getCardCVVNo();
    Double getAmount();

    void setCreditCardNo(String creditCardNo);
    void setCustomerName(String customerName);
    void setCardExpMonth(String cardExpMonth);
    String setCardExpYear(String cardExpYear);
    void setCardCVVNo(Short cardCVVNo);
    void setAmount(Double amount);
}
