package zad_3_4;

import zad_3_3.Date;

public class AbroadTrip extends Trip {
    public void setInsurance(boolean insurance) {
        this.insurance = insurance;
    }

    boolean insurance;

    public AbroadTrip(Date start, Date end, String desctription) {
        super(start, end, desctription);
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }
}
