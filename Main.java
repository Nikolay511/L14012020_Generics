import java.util.*;


public class Main {

    public static void main(String[] args) {
       CountMap<Integer> map = new CountMapIml<>();

        map.add(10);
        map.add(10);
        map.add(5);
        map.add(6);
        map.add(5);
        map.add(10);

        int kol = map.getCount(5); // 2
        System.out.println(kol);
        int kol1 = map.getCount(6); // 1
        System.out.println(kol1);
        int kol2 = map.getCount(10); //
        System.out.println(kol2);

        HashMap mapa = new HashMap();
        map.toMap(mapa);

        System.out.println(mapa);
        map.addAll(map);
        System.out.println(map.toMap());
        System.out.println(map.size());
        System.out.println(map.remove(5));
    }
}