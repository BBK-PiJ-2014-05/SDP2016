package adapter;

/**
 * Created by geoff_000 on 23/01/2016.
 */

public class XPayImpl implements XPay {

    private String creditCardNo;
    private String customerName;
    private String cardExpMonth;
    private String cardExpYear;
    private Short cardCVVNo;
    private Double amount;


    @Override
    public String getCreditCardNo() {
        return creditCardNo;
    }

    @Override
    public void setCreditCardNo(String creditCardNo) {

    }

    @Override
    public String getCustomerName() {
        return customerName;
    }

    @Override
    public void setCustomerName(String customerName) {

    }

    @Override
    public String getCardExpMonth() {
        return cardExpMonth;
    }

    @Override
    public void setCardExpMonth(String cardExpMonth) {

    }

    @Override
    public String getCardExpYear() {
        return cardExpYear;
    }

    @Override
    public void setCardExpYear(String cardExpYear) {

    }

    @Override
    public Short getCardCVVNo() {
        return cardCVVNo;
    }

    @Override
    public void setCardCVVNo(Short cardCVVNo) {

    }

    @Override
    public Double getAmount() {
        return amount;
    }

    @Override
    public void setAmount(Double amount) {

    }
}
