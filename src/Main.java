import dao.ProdutoDAO;
import model.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProdutoDAO dao = new ProdutoDAO();
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Cadastro de Produto:");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Preço: ");
            double preco = sc.nextDouble();
            System.out.print("Quantidade: ");
            int qtd = sc.nextInt();

            Produto novo = new Produto(nome, preco, qtd);
            dao.inserir(novo);
            System.out.println("Produto cadastrado com sucesso!");

            System.out.println("\nProdutos cadastrados:");
            for (Produto p : dao.listar()) {
                System.out.println(p);
            }

        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }

        sc.close();
    }
}
