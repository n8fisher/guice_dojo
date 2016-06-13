package hello;

public class DirectAccess{

  public static void main(String[] args) {
    Guicer greeter = new HandGuicer();
    System.out.println(greeter.makeGuice());
  }
}