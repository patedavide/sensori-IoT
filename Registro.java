import java.util.Arrays;

public class Registro {
    private Sensore[] sensori;
    private int contatore;
    private int confronto;

    public Registro(int grandezzaArray){
        sensori = new Sensore[grandezzaArray];
        confronto = grandezzaArray;
        contatore = 0;
    }

    public void aggiungiSensore(Sensore nuovoSensore){
        if(contatore < confronto){
            sensori[contatore] = nuovoSensore;
            contatore++;
        }else if (contatore >= confronto){
            Sensore[] sensori2 = Arrays.copyOf(sensori, sensori.length*2);
            sensori = sensori2;
            confronto = sensori2.length;
            contatore++;
        }
    }

    public void eliminaSensoreDaIp(String ipDaEliminare){
        for (int i = 0; i < confronto; i++) {
            if (sensori[i].getIpv4().equals(ipDaEliminare)){
                sensori[i] = null;
            }
        }
    }

    public Coordinate trovaSensoreDaIp(String ipDaTrovare){
        for (int i = 0; i < confronto; i++) {
            if(sensori[i].getIpv4().equals(ipDaTrovare)){
                return sensori[i]
            }
        }
    }



}
