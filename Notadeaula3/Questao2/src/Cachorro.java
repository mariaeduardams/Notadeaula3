public class Cachorro extends Animal {

    private String late;


    public Cachorro(){

    }

    public Cachorro(String nome,String raca,String locomocao){
        super(nome,raca,locomocao);
        this.late = late;

    }

    public void setLate(String late){
        this.late = late;
    }
    public String getLate(){
        return late;
    }




}
