import java.util.Scanner;

public class UrnaEletronica {

    public static void main(String[] args) {
       
        try ( 
                Scanner scanner = new Scanner(System.in)) {
            
            boolean sistemaAtivo = true;
            
            while (sistemaAtivo) {
                
                System.out.println("\n===========================================");
                System.out.println("       SISTEMA DE VOTAÇÃO - MENU           ");
                System.out.println("===========================================");
                System.out.println("1 - Novo Eleitor (Votar)");
                System.out.println("2 - Área do Administrador (Login)");
                System.out.println("0 - Sair do Sistema");
                System.out.print("Escolha uma opção: ");
                
                
                String opcao = scanner.nextLine();
                
                switch (opcao) {
                    case "1" -> System.out.println(" Programa em desnvolvimento! Em breve, você poderá votar aqui.");
                   
                        
                    case "2" -> System.out.println(" Programa em desenvolvimento! Em breve, você poderá acessar a área administrativa.");
                   
                        
                    case "0" -> {
                        System.out.println("\nEncerrando o sistema... Programa em desenvolvimento! até breve!");
                        sistemaAtivo = false; 
                    }
                        
                    default -> System.out.println("\n[Erro] Opção inválida! Tente novamente.");
                }
            }
        }
    }
}