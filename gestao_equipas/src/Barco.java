public class Barco extends Viatura {
 
    private boolean temPiscina;

    public void setTemPiscina(boolean temPiscina) {
        this.temPiscina = temPiscina;
    }

    public boolean isTemPiscina() {
        return temPiscina;
    }

    public Barco(){
        super("Barco" , 0, 0, "");
    }
    
    @Override
    public void mostraInfo() {
        System.out.println("Vou mostrar as informações do carro =?=");
        System.out.println("Tipo: " + getTipoViatura());
        System.out.println("Número de Rodas: " + getNumeroRodas());
        System.out.println("Tipo do Veiculo: " + getVelocidadeMaxima());   
        System.out.println("número da matricula: " + getmatricula());     

        if(temPiscina){
            System.out.println("Tem piscina");
        }else{
            System.out.println("Não tem piscina");
        }
    }
    

    
}
