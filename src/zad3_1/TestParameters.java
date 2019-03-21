package zad3_1;

public class TestParameters {
    public void changeValue(String val){
        val="coś";
    }

    public static void main(String[] args) {
        TestParameters t = new TestParameters();
        String msg ="inne coś";
        t.changeValue(msg);
        System.out.println(msg);
    }
}
