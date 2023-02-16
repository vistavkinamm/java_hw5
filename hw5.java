import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class hw5{
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
            hashMap.put(1, "Петров Петр Петрович 22 м");
            hashMap.put(2, "Сидоров Константин Иванович 33 м");
            hashMap.put(3, "Иванов Сергей Иванович 70 м");
            hashMap.put(4, "Пирожкова Вера Леонидовна 38 ж");
            hashMap.put(5, "Сергеев Сергей Сергеевич 38 м");

            Set<Integer> keySet = hashMap.keySet();
            for (Integer value : hashMap.keySet()) {
                System.out.println(value);
            }

            String[] tmp;
            for (int i = 0; i < keySet.size(); i++) {
                tmp = hashMap.get(keySet.toArray()[i]).split(" ");
                tmp[4] = tmp[4].toUpperCase();
                String tmp1 = String.join(" ", tmp);
                hashMap.put(i, tmp1);
                System.out.println(hashMap.get(keySet.toArray()[i]));
            }

            Iterator<Integer> iterator = hashMap.keySet().iterator();
            while (iterator.hasNext()) {
                Integer l = iterator.next();
                tmp = hashMap.get(keySet.toArray()[l]).split(" ");
                tmp[1] = (tmp[1].charAt(0) + ".");
                tmp[2] = (tmp[2].charAt(0) + ".");
                String tmp1 = String.join(" ", tmp);
                System.out.println(tmp1);
            }
    }
}