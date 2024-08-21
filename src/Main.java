public class Main {
    public static void main(String[] args) {

        ///declaração de variaveis///

        String nome = "Tainã vieira";
        int salario = 5000;
        int idade = 24;
        int mesestrabalh= 12;
        int produto = 50;
        double valorProduto = 10;
        int descont= 300;

        //Operações //

        double salarioAnual= salario * mesestrabalh;
        double salarioliquido= salario - descont;
        double media = produto * valorProduto / produto;
        double salarioAnualLiquido = salarioliquido * mesestrabalh;

        /// Apresentação de Resutados///
        System.out.println("Meu Nome é: " +nome+ " Tenho um salario anual liquido de:" +salarioAnualLiquido);
        System.out.println("Minha idade é:" + idade);
        System.out.println("Meses Trabalhados foi de:" +mesestrabalh);
        System.out.println("Seu salario anual bruto é: "+salario);
        System.out.println("Quantidade de produtos " +produto);
        System.out.println("O valor do produto é: " +valorProduto);
        System.out.println("Meu salario mensal bruto é "+ salarioAnual);
        System.out.println("Meu salario liquido é de:"+salarioliquido);
        System.out.println("A media do gasto com produtos é de: "+media);























    }
}