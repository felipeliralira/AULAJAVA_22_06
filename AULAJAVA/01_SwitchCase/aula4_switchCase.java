public class aula4_switchCase {
    
    public static void main(String[] args) {

        int opcaoMenu = 2;
        switch (opcaoMenu) {
            case 1:
                System.out.println("Iniciando");
                break;
            case 2:
                System.out.println("Carregando Jogo Salvo");
                break;
            case 3:
                System.out.println("Saindo do programa");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
    }
}
