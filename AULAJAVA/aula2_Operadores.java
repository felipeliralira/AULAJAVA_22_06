class aula2_Operadores {

    public static void main(String[] args){
        double nota1 = 5.5;
        double nota2 = 7.0;

        double media = (nota1 + nota2)/ 2;
        System.out.println("Média das notas: " + media);

        boolean passou = media >= 7.0;
        boolean presencaMinima = true;

        boolean aprovadoFinal = passou && presencaMinima;
        System.out.println("O aluno foi aprovado?: " + aprovadoFinal);
    }
}