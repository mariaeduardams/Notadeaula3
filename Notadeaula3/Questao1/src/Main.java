import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Funcionario f = new Funcionario();
        Gerente g = new Gerente();
        Programador p = new Programador();

        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        String r;

        do{System.out.println("Digite 0 se for Programador e 1 se for Gerente");
            int opcao = scanner.nextInt();

            System.out.println("Digite o nome do Funcionário: ");
            f.setNome(scanner2.nextLine());

            System.out.println("Digite o ano de nascimento: ");
            f.setNascimento(scanner.nextInt());

            System.out.println("Digite o salário do Funcionario: ");
            f.setSalario(scanner.nextDouble());


            switch(opcao){
                case(0):
                    p.informarLinguagem();
                    break;

                case(1):
                    g.informarProjeto();
                    break;

            }

            System.out.println("Nome: "+f.getNome());
            f.calcularIdade();
            System.out.println("Idade: "+f.getIdade());
            System.out.println("Salario: "+f.getSalario());
            if(opcao==0){
                System.out.println("Linguagem: " + p.getLinguagem());
            }else{
                System.out.println("Projeto "+ g.getProjeto());
            }

            System.out.println("Deseja cadastrar outro usuário? (sim ou não?)");
            r = scanner.next();

        }while (r.equalsIgnoreCase("S"));

    }
}