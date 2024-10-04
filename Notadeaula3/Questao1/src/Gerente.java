public class Gerente extends Funcionario{

    private String projeto;

    public String getProjeto(){
        return projeto;
    }

    public void setProjeto(String projeto){
        this.projeto = projeto;
    }

    public void informarProjeto(){
        System.out.println("Informe o projeto: ");
        setProjeto(scanner2.nextLine());

    }

}
