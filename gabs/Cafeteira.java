package gabs;

public class Cafeteira {

    private int temperaturaAgua;
    private int quantidadeAgua;
    private boolean ligada;


    public Cafeteira() {
        temperaturaAgua = 0;
        quantidadeAgua = 500;
        ligada = false;
    }


    public void ligar() {
        if (!ligada) {
            ligada = true;
            aquecerAgua();
            prepararCafe();
        } else {
            System.out.println("A cafeteira já está ligada.");
        }
    }


    public void desligar() {
        ligada = false;
        System.out.println("Cafeteira desligada.");
    }

    
    private void aquecerAgua() {
        temperaturaAgua = 90; // Temperatura em Celsius.
        System.out.println("Aquecendo água a " + temperaturaAgua + " graus.");
    }


    private void prepararCafe() {
        if (quantidadeAgua >= 100) { 
            quantidadeAgua -= 100;
            System.out.println("Café preparado! Restam " + quantidadeAgua + "ml de água.");
        } else {
            System.out.println("Água insuficiente para preparar café.");
        }
    }


    public int getQuantidadeAgua() {
        return quantidadeAgua;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void adicionarAgua(int quantidade) {
        if (quantidade > 0) {
            quantidadeAgua += quantidade;
            System.out.println("Adicionando " + quantidade + "ml de água. Total de água: " + quantidadeAgua + "ml.");
        } else {
            System.out.println("Quantidade inválida de água para adicionar.");
        }
    }
}
