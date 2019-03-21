package zad_3_4;

public class Address {
    private String street;
    private String City;
    private String code;

    public Address(String street, String number, String city, String code ) {
        this.street = street;
        City = city;
        this.code = code;
        this.number = number;
    }


    public String toString() {
        return "Address:" +
                "street='" + street + ' ' +number+" "+code+" "
               + City;
    }



    private String number;
}
