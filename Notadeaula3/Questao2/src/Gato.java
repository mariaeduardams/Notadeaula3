public class Gato extends Animal{

    private String mia;

    public Gato(){

    }

    public Gato (String nome,String raca,String locomocao,String mia){
        super(nome,raca,locomocao);
        this.mia = mia;

    }

    public void setMia(String mia) {
        this.mia = mia;
    }

    public String getMia() {
        return mia;
    }
}
