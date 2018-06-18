import java.util.Scanner;

public class Loja {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);

        //Creating GroceryList
        Carrinho lista = new Carrinho();

        System.out.println("Informe o numero de produtos");
        int nProdutos = console.nextInt();

        for (int i=0; i< nProdutos;i++) {
            System.out.println("informe Nome:");
            String nome = console.next();
            System.out.println("informe Qtde:");
            int qtde = console.nextInt();
            System.out.println("informe Preço:");
            double preco = console.nextDouble();
            Produto item = new Produto(nome, qtde, preco);

            //Adding GroceryItemOrder to GroceryList
            lista.add(item);
        }

        System.out.printf("The total cost of groceries is: %s", lista.getCustoTotal() );

    }

}
