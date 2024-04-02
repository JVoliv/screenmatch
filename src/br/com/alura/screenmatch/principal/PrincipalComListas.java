package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;


public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão",1972);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar",2023);
        outroFilme.avalia(6);
        var filmeDoPaulo = new Filme("Dogville",2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("LOST", 2000);

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);



        //lista.forEach(System.out::println); //testando foreach de uma so linha

        for (Titulo item: lista) {
            System.out.println(item);
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }

        }

        System.out.println("\n\n\n\n");
        //comparando usando a interface Comparable
        Collections.sort(lista);
        System.out.println("Lista de titulos ordenados alfabeticamete: \n" + lista);

        System.out.println("\n\n\n\n");
        //comparando usando o comparator
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Lista de titulos ordenados por ano: \n" + lista);

    }
}
