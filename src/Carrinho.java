public class Carrinho {
    Produto[] listaDeProdutos; // lista de produtos
    int qtde_Produtos; // quantidade de produtos no array

    // Constructor
    public Carrinho() {
        listaDeProdutos = new Produto[10];
        qtde_Produtos = 0;
    }

    //Adds the given item order to this list if the list has fewer than 10 items.
    public void add(Produto item) {
        if (qtde_Produtos<10) {
            this.listaDeProdutos[qtde_Produtos] = item;
            qtde_Produtos++;
        }
    }
    //Returns the total sum cost of all grocery item orders in this list.
    public double getCustoTotal() {
        double custoTotal = 0;
        for (int i=0; i<qtde_Produtos;i++){
            custoTotal += listaDeProdutos[i].getTotal();
        }
        return custoTotal;
    }
}
