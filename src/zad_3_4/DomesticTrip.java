package zad_3_4;

import zad_3_3.Date;

public class DomesticTrip extends Trip {
    @Override
    public int getPrice() {
        return super.getPrice()/2;
    }

    public DomesticTrip(Date start, Date end, String desctription) {
        super(start, end, desctription);
    }
}
