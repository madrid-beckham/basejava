import java.util.Arrays;

import static java.util.Arrays.copyOf;
import static java.util.Arrays.stream;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];

    void clear() {
        Arrays.fill(storage, null);
    }

    void save(Resume r) {
        for (int i = 0; i < storage.length; i++)
            storage[i] = r;

    }

    Resume get(String uuid) {

        for (int i = 0; i < storage.length; i++) {

            if (storage[i].uuid.equals(uuid)) {
                return storage[i];
            }

        }
        return null; // т.е. значит резюме нет
    }

    void delete(String uuid) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i].uuid.equals(uuid)) {

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
        int count = 0;
        for (int i = 0; i < storage.length; i++) {
            if (storage[i].equals(null)) {
                System.out.println("null");

            } else {
                count++;
            }

        }
        return count;

    }
}
