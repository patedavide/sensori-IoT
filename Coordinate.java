public class Coordinate {
    private float latitudine;
    private float longitudine;

    public Coordinate(float latitudine, float longitudine){
        this.latitudine = latitudine;
        this.longitudine = longitudine;
    }

    public float getLatitudine() {
        return latitudine;
    }

    public float getLongitudine() {
        return longitudine;
    }

    public void setLatitudine(float latitudine) {
        this.latitudine = latitudine;
    }

    public void setLongitudine(float longitudine) {
        this.longitudine = longitudine;
    }

    public boolean equals(Coordinate coordinateConfronate) {
        return latitudine == coordinateConfronate.latitudine && longitudine == coordinateConfronate.longitudine;
    }

    public String toString() {
        return "[ La latitudine è: " + latitudine + " e la longitudine: " + longitudine + "]";
    }
}
