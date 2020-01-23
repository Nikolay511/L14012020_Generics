import java.util.*;

public class CountMapIml<T> implements CountMap<T> {

    private HashMap<T, Integer> map = new HashMap<>();

    @Override
    public void add(T o) {
        if(map.containsKey(o)){
            map.put(o, map.get(o) + 1);
        }
        else map.put(o, 1);
    }

    @Override
    public int getCount(T o) {
        int k = map.get(o);
        System.out.print(o + "=");
        return k;

    }

    @Override
    public int remove(Object o) {
        int k = map.get(o);
        map.remove(o);
        return k;
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public void addAll(CountMap<T> source) {
        Map<T, Integer> rMap = source.toMap();
        for(Map.Entry <T, Integer> element : rMap.entrySet()){
            if (map.containsKey(element.getKey())){
                map.put(element.getKey(), map.get(element.getKey()) + element.getValue());
            }
            else {
                map.put(element.getKey(), 1);
            }
        }
    }

    @Override
    public Map toMap() {
        return map;
    }

    @Override
    public void toMap(Map<T, Integer> destination) {
        destination.putAll(map);
    }
}