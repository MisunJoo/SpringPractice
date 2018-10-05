package my.examples.was;

import java.io.File;
import java.net.URL;
import java.util.Enumeration;
import java.util.List;

public class ClassLoaderTest05 {
    public static void main(String[] args) throws Exception{
        String baseDir = "/DEVEL/fastcampus2/miniwas/target/classes/";
        ClassFinder classFinder = new ClassFinder(baseDir);
        List<String> allClass =
                classFinder.findAllClass();

        for(String className : allClass){
            System.out.println(className);
        }
    } // main
}
