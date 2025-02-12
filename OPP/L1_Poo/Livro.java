package OPP.L1_Poo;

//Criação de uma classe "Livro"://
public class Livro {
  //Crie uma classe Livro com os atributos titulo, autor, anoPublicacao e preco.//
  String title;
  String autor;
  int publicateYear;
  Double price;

  //Crie um construtor para inicializar os atributos.//
  public Livro(String title ,String autor,int publicateYear, Double price){

    this.title = title;
    this.autor = autor;
    this.publicateYear = publicateYear;
    this.price = price;
  }


  
  //Um método que aplica desconto ao preço do livro.
  
  public double priceOff(){
    
    return price*0.75;
    
  }
  //Adicione métodos para exibir os detalhes do livro.//

  public void showDetails(){
    
    System.out.println("This Book Title is " + title);
    System.out.println("This Book Autor is " + autor);
    System.out.println("This Book Published in " + publicateYear);
    System.out.printf("This Book Price with cupom is: $%.2f\n", priceOff());

  }
  
  
  
  //Adicione os métodos getters e setters para cada atributo da classe Livro.//
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public String getAutor() {
    return autor;
  }


  public void setAutor(String autor) {
    this.autor = autor;
  }


  public int getPublicateYear() {
    return publicateYear;
  }


  public void setPublicateYear(int publicateYear) {
    this.publicateYear = publicateYear;
  }


  public Double getPrice() {
    return price;
  }


  public void setPrice(Double price) {
    this.price = price;
  }
  
  //No método main, crie um objeto Livro e atribua valores usando o construtor e getters/setters.
  //Exiba os detalhes do livro usando o método mostrarDetalhes().//
  public static void main(String[] args) {
  
    Livro MyFavoriteBook = new Livro("Little Prince", "Antoine de Saint", 2024, 5.00);

    MyFavoriteBook.showDetails();
  }


  
}
