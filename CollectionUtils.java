import java.util.*;

public class CollectionUtils {
    public static<T> void addAll(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
    }
    // Новый лист опрелеленного типа
    public static <T> List<? super T>  newArrayList() {
        return new ArrayList<>();
    }
    //
    public static <T> int indexOf(List <? extends T> source, T o) {
        return source.indexOf(o);
    }

    public static <T> List <? super T> limit(List <? super T> source, int size) {
        return source.subList(0,size);
    }

    public static <T> void add(List <? super T> source, T o) {
        source.add(o);
    }

    public static <T> void removeAll(List  <? super T> removeFrom, List <? extends T> c2) {
        removeFrom.removeAll(c2);
    }

    public static <T> boolean containsAll(List <? extends T> c1, List <? extends T> c2) {
         return c1.containsAll(c2);
    }

    public static <T> boolean containsAny(List <? extends T> c1, List <? extends T> c2) {
        for (T k : c2)
            if (c1.contains(k))
                return true;
        return false;
    }

    public static <T extends Comparable> List <T>  range(List <T>  list, T min, T max) {
        Collections.sort(list);
        List<T> resultList = new ArrayList<>();
        for (T element : list){
            if (element.compareTo(min) >= 0){
                if (element.compareTo(max) <= 0 )
                    resultList.add(element);
            }
        }
        return resultList;
    }

    public static  <T extends Comparable> List <T> range(List<T> list, T min, T max, Comparator<T> comparator) {
        Collections.sort(list, comparator);
        List<T> resultList = new ArrayList<>();
        for (T element : list){
            if (element.compareTo(min) >= 0){
                if (element.compareTo(max) <= 0 )
                    resultList.add(element);
            }
        }
        return resultList;

    }
}
