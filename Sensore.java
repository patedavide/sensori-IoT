import java.util.Date;

public class Sensore {
    private Date dataProssimaSostituzione;
    private Date dataUltimaSostituzione;
    private String Ipv4;
    private Coordinate coordinate;

    public Sensore(String Ipv4, Date dataUltimaSostituzione, Date dataProssimaSostituzione, Coordinate coordinate){
        this.Ipv4 = Ipv4;
        this.dataUltimaSostituzione = dataUltimaSostituzione;
        this.dataProssimaSostituzione = dataProssimaSostituzione;
        this.coordinate = coordinate;
    }

    public void setDataUltimaSostituzione(Date dataUltimaSostituzione) {
        this.dataUltimaSostituzione = dataUltimaSostituzione;
    }

    public Date getDataProssimaSostituzione() {
        return dataProssimaSostituzione;
    }

    public void setDataProssimaSostituzione(Date dataProssimaSostituzione) {
        this.dataProssimaSostituzione = dataProssimaSostituzione;
    }

    public Date getDataUltimaSostituzione() {
        return dataUltimaSostituzione;
    }

    public String getIpv4() {
        return Ipv4;
    }

    public void setIpv4(String ipv4) {
        Ipv4 = ipv4;
    }

    public boolean equals(Sensore sensoreConfrontato) {
        return dataProssimaSostituzione == sensoreConfrontato.dataProssimaSostituzione && dataUltimaSostituzione == sensoreConfrontato.dataUltimaSostituzione && Ipv4 == sensoreConfrontato.Ipv4;
    }

    public String toString(){
        return "[ La data dell'ultima' sostituzione è: " + dataUltimaSostituzione + ", la data della prossima sostituzione è:  " + dataProssimaSostituzione + " e l'indirizzp ipv4: " + getIpv4() + "]" ;
    }
}
