class IntVector implements IntList {
    private int[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 20;

    public IntVector() {
        this.array = new int[DEFAULT_CAPACITY];
        this.size = 0;
    }

    @Override
    public void add(int number) {
        if (size == array.length) {
            int newCapacity = array.length * 2; // Duplica el tamaño del arreglo
            int[] newArray = new int[newCapacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
        array[size++] = number;
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return array[id];
    }
}
