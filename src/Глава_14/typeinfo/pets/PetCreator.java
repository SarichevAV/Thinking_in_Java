package Глава_14.typeinfo.pets;

import java.util.*;

/**
 * Created by andrej on 27.02.17.
 */
public abstract class PetCreator {
    private Random random = new Random(47);
    // Контейнер с разными видами Pet
    public abstract List<Class<? extends Pet>> types();

    public Pet randomPet() { // Создание одного вида Pet
        int n = random.nextInt(types().size());
        try {
            return types().get(n).newInstance();
        }catch (InstantiationException e) {
            throw new RuntimeException();
        }catch (IllegalAccessException e) {
            throw  new RuntimeException();
        }
    }

    public Pet[] createArray(int size) { // Создание массива
        Pet[] result = new Pet[size];
        for (int i = 0; i < size; i++) {
            result[i] = randomPet();
        }
        return result;
    }

    public ArrayList<Pet> arrayList(int size) {
        ArrayList<Pet> result = new ArrayList<Pet>();
        Collections.addAll(result, createArray(size));
        return result;
    }
}
