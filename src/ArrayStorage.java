import java.util.Arrays;

import static java.util.Arrays.copyOf;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];
    int size ;

    void clear() {
        Arrays.fill(storage, 0, size, null);
    }

    void save(Resume r) {
        for (int i = 0; i < size; i++) {
            storage[i] = r;
        }

    }

    Resume get(String uuid) {

        for (int i = 0; i < size; i++) {

            if (storage[i].uuid.equals(uuid)) {
                return storage[i];
            }

        }
        return null; // т.е. значит резюме нет
    }

    void delete(String uuid) {
        for (int i = 0; i < size; i++) {
            if (storage[i].uuid.equals(uuid)) {
                System.out.println("Ничего не зануляем");
            } else {
                storage[i].uuid = null;
            }


        }

    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {

        return copyOf(storage, storage.length);


    }

    int size() {

        for (int i = 0; i < storage.length; i++) {
            if (storage[i].equals(null)) {
                System.out.println("null");

            } else {
                size++;
            }

        }
        return size;

    }
}
