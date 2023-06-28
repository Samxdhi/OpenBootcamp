public class Coche {
    private int numPuertas;
    
    public Coche() {
        this.numPuertas = 0;
    }
    
    public void incrementarPuertas() {
        this.numPuertas++;
    }
    
    public int getNumPuertas() {
        return this.numPuertas;
    }
    
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();
        
        System.out.println("Número de puertas del coche: " + miCoche.getNumPuertas());
    }
}

