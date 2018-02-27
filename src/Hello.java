import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Hello {
    private String username;
    private String[] arrs;
    private List<String > list;
    private Map<String ,String> map;
    private Properties properties;

    public void setArrs(String[] arrs) {
        this.arrs = arrs;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Hello(String username) {
        this.username = username;
    }

    public Hello() {
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void sayName(){
        System.out.println("name:"+this.username);
    }

    public void sayHello(){
        System.out.println("Hello World!");
    }

    public void test1(){
        System.out.println("arrs:"+arrs);
        System.out.println("list:"+list);
        System.out.println("map:"+map);
        System.out.println("properties:"+properties);
    }
}
