import java.util.HashMap;
import java.util.Map;

public class Passports {
    private Map<String, String> map = new HashMap<>();

    void add(String name, String passNum) {
        map.put(passNum, name);
    }

    String getByLastName(String lastName) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()
        ) {
            if (entry.getValue().equals(lastName)) {
                sb.append(entry.getKey())
                        .append(" : ")
                        .append(lastName)
                        .append("\n");
            }
        }
        return sb.toString();
    }

    String getByPassNum(String passNum) {
        return new StringBuilder().append(passNum)
                .append(" : ")
                .append(map.get(passNum)).toString();
    }
    String getAllShort(){
        return map.toString();
    }
}
