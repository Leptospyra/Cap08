public class Produto {
    private String nome;
    private int quantidade;
    private double precoUnitario;

    //Constructs an item order to purchase the item with the given name, in the given quantity,
    // which costs the given price per unit.
    public Produto(String nome, int quantidade, double precoUnitario){
        this.setNome(nome);
        this.setQuantidade(quantidade);
        this.setPrecoUnitario(precoUnitario);
    }
    //bloco com os metodos get e set
    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    //Retorna o valor total do produto
    public double getTotal(){
        return getQuantidade() * getPrecoUnitario();
    }
}


