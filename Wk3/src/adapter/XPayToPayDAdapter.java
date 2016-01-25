package adapter;

/**
 * Created by geoff_000 on 24/01/2016.
 */
public class XPayToPayDAdapter implements PayD {

    XPay xPay;

    public XPayToPayDAdapter(XPay xpay){
        this.xPay = xpay;
    }

    @Override
    public String getCustCardNo() {
        return xPay.getCreditCardNo();
    }

    @Override
    public void setCustCardNo(String custCardNo) {
        xPay.setCreditCardNo(custCardNo);

    }

    @Override
    public String getCardOwnerName() {
        return xPay.getCustomerName();
    }

    @Override
    public void setCardOwnerName(String cardOwnerName) {
        xPay.setCreditCardNo(getCardOwnerName());

    }

    @Override
    public String getCardExpMonthDate() {
        String expMonthDate = "" + xPay.getCardExpMonth() + xPay.getCardExpYear();
        return expMonthDate;
    }

    @Override
    public void setCardExpMonthDate(String cardExpMonthDate) {
        try {
            String month = cardExpMonthDate.substring(0, 3);
            String year = cardExpMonthDate.substring(3);
            xPay.setCardExpMonth(month);
            xPay.setCardExpYear(year);

        } catch (StringIndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }
    }
    @Override
    public Integer getCVVNo() {
        short CVVNoShort = xPay.getCardCVVNo();
        Integer CVVNoInt = new Integer(CVVNoShort);
        return CVVNoInt;
    }

    @Override
    public void setCVVNo(Integer cVVNo) {
        short cVVNoShort = cVVNo.shortValue();
        xPay.setCardCVVNo(cVVNoShort);


    }

    @Override
    public Double getTotalAmount() {
        return xPay.getAmount();
    }

    @Override
    public void setTotalAmount(Double totalAmount) {
        xPay.setAmount(totalAmount);

    }
}
