public abstract class Sorter {
    private int[] array;

    // Getter
    public int[] getArray() {
        return array;
    }

    // Setter
    public void setArray(int[] array) {
        this.array = array;
    }

    public abstract void sort();
}