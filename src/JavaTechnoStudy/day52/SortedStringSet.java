package JavaTechnoStudy.day52;

import java.util.Collections;

public class SortedStringSet extends SimpleStringSet {

    @Override
    public void add(String s) {
        super.add(s);
        Collections.sort(items);
//       if (items.contains(s))
//
//           //items.remove(s);
//       }
//        items.add(s);

    }

    @Override
    public void remove(String s) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void clean() {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public String toString() {
        return "SortedStringSet{" +
                "items=" + items +
                '}';
    }
}
