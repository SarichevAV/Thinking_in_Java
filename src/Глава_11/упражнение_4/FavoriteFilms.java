package Глава_11.упражнение_4;

import java.util.*;

/**
 * Created by andrej on 31.01.17.
 */
public class FavoriteFilms {
    private List<String> arrayList = new ArrayList<>();
    private List<String> linkedList = new LinkedList<>();
    private Set<String> hashSet = new HashSet<>();
    private Set<String> linkedHashSet = new LinkedHashSet<>();
    private Set<String> treeSet = new TreeSet<>();

    List<Collection> collection = new ArrayList<>();
    {
        Collections.addAll(collection, arrayList,linkedList,hashSet,linkedHashSet,treeSet);
    }

    public void addElements(String... i){
        for (Collection c :
                collection) {
            Collections.addAll(c, i);
        }
    }

    public void next(){
        for (Collection<String> c :
                collection) {
            System.out.print(c.getClass().getName()+"\n"+c+"\n\n");
        }
    }

    public static void main(String[] args) {
        FavoriteFilms favoriteFilms = new FavoriteFilms();

        favoriteFilms.addElements(
                "Побег",
                "Во все тяжкие",
                "Лучше звоните солу",
                "Побег",
                "Пространство",
                "Прибытие",
                "В активном поиске"
        );

        favoriteFilms.next();
    }
}
