package objectClass.stringClass;

public class stringClass {
    public static void main(String[] args) {
        final String sl = "=====================";
        String str = new String("str");
        String str2 = "str";
        String str3 = "str";
        System.out.println(str==str2);
        System.out.println(str2==str3);
        System.out.println(sl);
        /*
            기본적으로 생성하면 상수풀에 저장하고 상수풀에 존재할때는 같은 메모리주소를 참조
            new String()으로 선언하면 상수풀말고 새로운 힙메모리 공간에다 값을 저장한다.
            스트링은 char[]에 저장되는데 final로 저장되기때문에 불변하다.
         */
        String java = new String("java");
        String android = new String("android");
        System.out.println(System.identityHashCode(java));

        java = java.concat(android);

        System.out.println(java);
        System.out.println(System.identityHashCode(java));
        System.out.println(sl);
        /*
        StringBuilder vs StringBuffer
        둘다 가변적인 char[]을 가지는데 StringBuffer는 멀티쓰레드 프로그래밍에서 동기화를 보장한다.
        단일쓰레드는 StringBuilder를 쓰면되고 멀티쓰레드환경에서는 StringBuffer를 쓰면 됨.
         */
        java = new String("java");
        System.out.println(System.identityHashCode(java));
        StringBuilder buffer = new StringBuilder(java);
        System.out.println(System.identityHashCode(buffer));
        buffer.append("android");
        System.out.println(System.identityHashCode(buffer));

        java = buffer.toString();
        System.out.println(System.identityHashCode(java));

    }
}
