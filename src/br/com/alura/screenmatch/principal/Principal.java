package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O poderoso chefão",1972); // tipo referência (objeto)

        meuFilme.setDuracaoEmMinutos(175);
        meuFilme.setIncluidoNoPlano(true);


        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(6);
        meuFilme.avalia(9.4);
        meuFilme.avalia(6.4);

        meuFilme.exibeFichaTecnica();

        Serie lost = new Serie("LOST", 2000);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);

        System.out.printf("Duração da série:" + lost.getDuracaoEmMinutos());


        System.out.println("\n\n\n============================================\n\n\n");

        Filme outroFilme = new Filme("Avatar",2023); // tipo referência (objeto)
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(outroFilme);
        calculadora.inclui(meuFilme);
        calculadora.inclui(lost);
        System.out.println("\n \n" + calculadora.getTempoTotal());


        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);



        System.out.println("\n\n\n============================================\n\n\n");

        var filmeDoPaulo = new Filme("Dogville",2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);

        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);

        System.out.println("toString " + listaDeFilmes.get(0).toString());

    }
}
