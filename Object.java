public class Object {
  int myInt;

  public Object(int myInt) {
    this.myInt = myInt;
  }

  public int getMyInt() {
    return myInt;
  }

  public static int getMyIntStatic(Object obj) {
    return obj.myInt;
  }

  public static void main(String[] args) {
    Object obj = new Object(42);

    int myInt = obj.getMyInt();
    System.out.println("myInt = " + myInt);

    int myIntStatic = Object.getMyIntStatic(obj);
    System.out.println("myIntStatic = " + myIntStatic);
  }
}
