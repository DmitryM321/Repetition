package Stepik;

public class Errors2 {
    
  public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] stackTrace = (new Throwable()).getStackTrace();

        if (stackTrace.length >= 3) {
            StackTraceElement caller = stackTrace[2];
            return caller.getClassName() + "#" + caller.getMethodName();
        }

        return null;
    }
}