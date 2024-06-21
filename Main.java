package itog;

public class Main {
    public static void main(String[] args) {

        Tel mytel = new Tel();
        mytel.add("LION", 5896345);
        mytel.add("LION", 85621);
        mytel.add("LION", 7856932);
        mytel.add("OSKAR", 956324);
        mytel.add("OSKAR", 7854962);
        mytel.add("OSKAR", 89653245);
        mytel.add("LION", 7856233);
        mytel.add("TOM", 3332456);
        mytel.add("TOM", 78569);
        mytel.add("OSKAR",78541);
        mytel.add("OSKAR", 96583);
        mytel.add("LION", 78512463);
        mytel.add("TOM", 86523);
        mytel.add("MATTY", 563);
        
        // mytel.find("TOM");
        // mytel.removePhone("LOIN", 563);
        mytel.find("MATTY");
        
        mytel.showAll();
     


    }
}
