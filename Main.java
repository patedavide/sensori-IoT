import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main (String[] args){
        Coordinate c1 = new Coordinate(45.4567f, 9.01f);
        Coordinate c2 = new Coordinate(40.456f, 7.89f);

        Calendar cal = Calendar.getInstance();
        cal.set(2025, Calendar.JANUARY, 7);
        Date ultimaSostituzione = cal.getTime();
        cal.set(2026, Calendar.JANUARY,7);
        Date prossimaSostituzione = cal.getTime();
        cal.set(2025, Calendar.FEBRUARY, 21);
        Date ultimaSostituzione2 = cal.getTime();
        cal.set(2026, Calendar.FEBRUARY,21);
        Date prossimaSostituzione2 = cal.getTime();

        Sensore s1= new Sensore("192.168.0.0", ultimaSostituzione, prossimaSostituzione, c1);
        Sensore s2= new Sensore("192.168.1.11", ultimaSostituzione2, prossimaSostituzione2, c2);

        System.out.println("Registro sensori: ");
        System.out.println(s1);
        System.out.println(s2);

        String ipv4Cercato = "192.168.1.11";
        if(s1.getIpv4().equals(ipv4Cercato)){
            System.out.println("L'ip corrisponde a questo sensore: " + s1);
        } else if(s2.getIpv4().equals(ipv4Cercato)){
            System.out.println("L'ip corrisponde a questo sensore: " + s2);
        }


    }
}
