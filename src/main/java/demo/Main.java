package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i=0; i<16; i++) {
            list.add(Integer.toHexString(i));
        }
        List<String> stringsToSearch = new ArrayList<>(list);
        stringsToSearch.addAll(list); // додаємо рядки ще раз

        List<String> copy = new ArrayList<>(stringsToSearch);
        Collections.sort(copy);
        int index = Collections.binarySearch(copy, "f");
        assert(index > 0);
    }
}
