package my.examples.was;

import com.fasterxml.jackson.databind.ObjectMapper;

// 싱글턴패턴
public class WasConfigurationManager {
    private ObjectMapper objectMapper;

    // 2. 자기 자신을 참조하는 private static변수를 선언한다.
    //    static한 변수는 딱한번 초기화되고, 메모리에 딱 한번만 올라간다.
    private static WasConfigurationManager instance = new WasConfigurationManager();

    // 1. private 생성자를 만든다.
    private WasConfigurationManager(){
        objectMapper = new ObjectMapper();
    }

    // 3. public static 한 메소드를 만든다. instance를 리턴하는...
    public static WasConfigurationManager getInstance(){
        return instance;
    }
}

// WasConfigurationManager wasConfigurationManager = new WasConfigurationManager();
// WasConfigurationManager wcm1 = WasConfigurationManager.getInstance();
// WasConfigurationManager wcm2 = WasConfigurationManager.getInstance();