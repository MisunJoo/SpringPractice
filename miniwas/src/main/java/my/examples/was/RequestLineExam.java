package my.examples.was;

public class RequestLineExam {
    public static void main(String[] args){
        String str1 = "GET / HTTP/1.1";

        String str2 = "GET /abc/index.html HTTP/1.1";

        String str3 = "GET /../windows/system32 HTTP/1.1";
    }
}
