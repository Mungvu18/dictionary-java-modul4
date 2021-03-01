package service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictionaryService {
    static Map<String, String> map = new HashMap<>();
    static {
        map.put("Hello","xin chao");
        map.put("Student","học sinh");
        map.put("Teacher","Giáo viên");
        map.put("School","Trường học");
    }
    public String findByInput(String input){
        return map.get(input);
    }
}
