package acedemy.devdojo.maratonajava.javacore.Dconstrutores.test;

import acedemy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu","TV", 12, "Ação");
        Anime anime2 = new Anime("Haikyuu","TV", 12, "Ação" , "ProductionIg");
        anime.imprime();
        anime2.imprime();
    }
}
