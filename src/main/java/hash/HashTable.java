package hash;

public class HashTable {

    private int size = 10000;
    public int[] table = new int[size];

    public HashTable(){

    }
    public HashTable(int size) {
        this.size = size;
        this.table = new int[size];
    }

    public int hash(String key) {
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        return asciiSum % size;
    }
    public void insert(String key, Integer value){
        int hashCode = hash(key);
        this.table[hashCode] = value;


        System.out.println(hashCode + "방에 저장이 완료 되었습니다.");
    }
    public int search(String key){
        return table[hash(key)];
    }

}
