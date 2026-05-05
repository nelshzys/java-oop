public class Cruzeiro {
    private int numQuartos;
    private int numPisos;
    private String nomeBarco;

    public int getNumQuartos() {
        return numQuartos;
    }
    public void setNumQuartos(int numQuartos) {
        this.numQuartos = numQuartos;
    }
    public int getNumPisos() {
        return numPisos;
    }
    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }
    public String getNomeBarco() {
        return nomeBarco;
    }
    public void setNomeBarco(String nomeBarco) {
        this.nomeBarco = 
        nomeBarco;
    }
    
    public void mostraInfoCruzeiro() {
        System.out.println("Vou mostrar as informações do Cruzeiro: ");
        System.out.println("Número de quartos: " + this.getNumQuartos());
        System.out.println("Número de pisos: " + this.getNumPisos());
        System.out.println("Nome do cruzeiro: " + this.getNomeBarco());
    }

    
}
