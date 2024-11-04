package gabs;

public class Main {
  public static void main(String[] args) {
      // Cria uma instância da cafeteira.
      Cafeteira minhaCafeteira = new Cafeteira();

      // Liga a cafeteira para preparar o café.
      minhaCafeteira.ligar();

      // Verifica a quantidade de água restante.
      System.out.println("Quantidade de água atual: " + minhaCafeteira.getQuantidadeAgua() + "ml");

      // Tenta preparar mais café sem adicionar água suficiente.
      minhaCafeteira.ligar();

      // Adiciona água e prepara o café novamente.
      minhaCafeteira.adicionarAgua(200); // Adicionando 200ml de água.
      minhaCafeteira.ligar();

      // Desliga a cafeteira após o uso.
      minhaCafeteira.desligar();

      // Verifica o estado final da cafeteira.
      System.out.println("A cafeteira está ligada? " + minhaCafeteira.isLigada());
    }
}