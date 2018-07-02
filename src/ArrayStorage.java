import java.util.Arrays;

import static java.util.Arrays.copyOf;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];


    void clear() {
        Arrays.fill(storage, 0, size(), null);
    }

    void save(Resume r) {
        for (int i = 0; i < storage.length; i++) {
            storage[i] = r;
        }
    }

    Resume get(String uuid) {

        for (int i = 0; i < size(); i++) {

            if (storage[i].uuid.equals(uuid)) {
                return storage[i];
            }

        }
        return null; // т.е. значит резюме нет
    }
    //int k = 0;
    //   for (int i = 0; i < size; i++) {

    //    if (storage[i].uuid.equals(uuid)) {
    //         k = k + 1;
    //     }
    //  }
    //   return storage[k];
    //  }

    void delete(String uuid) {
        for (int i = 0; i < size(); i++) {
            if (storage[i].uuid!=(uuid)) {
                storage[i].uuid = null;
            }

        }

    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {

        return Arrays.copyOf(storage, size());

    }

    int size() {
        int size = 0;
        for (int i = 0; i < storage.length; i++) {

            if (storage[i] != null) {
                size++;
            }
        }
        return size;

    }
}
