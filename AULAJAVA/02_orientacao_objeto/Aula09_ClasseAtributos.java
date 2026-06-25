public class Aula09_ClasseAtributos{
    public static void main(String[] args){
        Carro09 meuCarro = new Carro09();
        meuCarro.modelo = "Eclipse";
        meuCarro.cor = "Preto com Branco";
        meuCarro.ano = 2005;
        System.out.println("Meu carro é um: " + meuCarro.modelo + " cor: "+ meuCarro.cor + " ano: " + meuCarro.ano);
    }
}
