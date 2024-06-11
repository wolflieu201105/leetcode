class MyHashMap {
    List<Integer> keys;
    List<Integer> values;
    int length;
    public MyHashMap() {
        keys = new ArrayList<Integer>();
        values = new ArrayList<Integer>();
        length = 0;
    }
    
    public void put(int key, int value) {
        int upperBound = length;
        int lowerBound = 0;
        while (upperBound != lowerBound) {
            int mid = (upperBound - lowerBound)/2 + lowerBound;
            if (keys.get(mid) == key) {
                values.set(mid, value);
                break;
            }
            if (keys.get(mid) > key) {
                upperBound = mid;
            }
            else {
                lowerBound = mid + 1;
            }
        }
        if (lowerBound == upperBound) {
            keys.add(upperBound, key);
            values.add(upperBound, value);
            length ++;
        }
    }
    
    public int get(int key) {
        int upperBound = length;
        int lowerBound = 0;
        while (upperBound != lowerBound) {
            int mid = (upperBound - lowerBound)/2 + lowerBound;
            if (keys.get(mid) == key) {
                return values.get(mid);
            }
            if (keys.get(mid) > key) {
                upperBound = mid;
            }
            else {
                lowerBound = mid + 1;
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        int upperBound = length;
        int lowerBound = 0;
        while (upperBound != lowerBound) {
            int mid = (upperBound - lowerBound)/2 + lowerBound;
            if (keys.get(mid) == key) {
                keys.remove(mid);
                values.remove(mid);
                length--;
                break;
            }
            if (keys.get(mid) > key) {
                upperBound = mid;
            }
            else {
                lowerBound = mid + 1;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */