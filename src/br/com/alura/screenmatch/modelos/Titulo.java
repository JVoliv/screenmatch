package br.com.alura.screenmatch.modelos;

public class Titulo implements Comparable<Titulo> {

    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    // modificadores de acesso
    private double somaAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;
    // cada item aqui é um atributo da classe `Filme` pois Filme herda de titulo, assim como Serie

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }


    // método acessor: para que ninguém mude os valores e somente acesse

    ///// Getters
    public int getTotalAvaliacoes(){
        return totalDeAvaliacoes;
    }
    public String getNome() {
        return nome;
    }
    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }
    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }


    ///// Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    // `void` usado porque esse método não retorna nenhum valor
    public void avalia(double nota) {
        somaAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaAvaliacoes/totalDeAvaliacoes;
    }
    public void exibeFichaTecnica() {
        System.out.println("Nome do Titulo: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Incluso no plano: " + incluidoNoPlano);
        System.out.println("Avaliação (IMDb): " + pegaMedia());
        System.out.println("Total de avaliações: " + totalDeAvaliacoes);
        System.out.println("Duração (min): " + duracaoEmMinutos);
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
