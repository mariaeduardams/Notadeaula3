import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato("Marrie","Cianês","caminha","mia");

        Scanner sc = new Scanner(System.in);

        System.out.println("Informações do Cachorro:");
        System.out.println("Digite o nome do cachorro: ");
        cachorro.setNome(sc.nextLine());
        System.out.println("Digite a raça do cachorro: ");
        cachorro.setRaca(sc.nextLine());
        System.out.println("Digite a sua locomoção: ");
        cachorro.setLocomocao(sc.nextLine());
        System.out.println("Ele late? ");
        cachorro.setLate(sc.nextLine());


        System.out.println("Informações do Cachorro:");
        System.out.println("Nome: " + cachorro.getNome());
        System.out.println("Raça: " + cachorro.getRaca());
        System.out.println("Locomoção: " + cachorro.getLocomocao());
        System.out.println("Late: " + cachorro.getLate());


        System.out.println("Informações da Gato:");
        System.out.println("Nome: " + gato.getNome());
        System.out.println("Raça: " + gato.getRaca());
        System.out.println("Locomoção: " + gato.getLocomocao());
        System.out.println("Mia: " + gato.getMia());


    }
}