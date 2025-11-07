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
        }else{

        }
    }





}
