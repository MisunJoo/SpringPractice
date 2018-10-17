

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*BeanContainer(Spring Container from ApplicationContext) 를 사용하는 코드*/
/*ApplicationContext는 interface*/
public class SpringExam01 {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        MyBean myBean = (MyBean)applicationContext.getBean("myBean");
        myBean.print();

        MyBean myBean1 = applicationContext.getBean(MyBean.class);
        myBean.print();

        if(myBean ==  myBean1){
            System.out.println("Same!");
        }
    }
}
