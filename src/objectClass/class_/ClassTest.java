package objectClass.class_;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
            ClassNotFoundException, NoSuchMethodException, SecurityException, InvocationTargetException {
        Person person = new Person("James");
        System.out.println(person);

        Class c1 = Class.forName("objectClass.class_.Person");
        Person person1 = (Person)c1.newInstance();
        System.out.println(person1);

        Class[] parameterTypes = {String.class};
        Constructor cons = c1.getConstructor(String.class);

        Object[] initargs = {"김유신"};
        Person personLee = (Person)cons.newInstance(initargs);
        System.out.println(personLee);
        /*
            reflection programming : Class 클래스를 사용해서 클래스의 정보를 알수있고 인스턴스를 생성할 수 있음
            로컬 메모리에 객체가 없는 경우, 객체의 타입을 알 수없는 경우에 이렇게 프로그래밍함.
            일반적으로 자료형을 알고있으면 이렇게 안하고 평소대로 인스턴스생성하면 된다.
            다른 프로세스끼리는 리모트 메모리다. 로컬 메모리가 아니다.
            각자의 100번대 메모리주소는 다른 곳이기 때문에 이런 경우에도 reflection programming 사용 가능
            같은 머신에서도 다른 메모리공간이기 때문에.
         */
    }
}
