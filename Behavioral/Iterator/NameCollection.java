package Behavioral.Iterator;

public class NameCollection implements Collection<String> {
    private String[] names = {"Alice", "Bob", "Charlie"};

    @Override
    public Iterator<String> createIterator() {
        return new NameIterator();
    }

    // L'iterator interne
    private class NameIterator implements Iterator<String> {
        int index = 0;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public String next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}



