package algorithm.sort;

public abstract class Sort {
    private final String name;

    protected Sort(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    };

    abstract void run(int[] arr);
    void runOpt(int[] arr) {}

    public void swap(int[] arr, int aIdx, int bIdx) {
        int temp = arr[aIdx];
        arr[aIdx] = arr[bIdx];
        arr[bIdx] = temp;
    }
}
