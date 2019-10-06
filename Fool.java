public class Fool {
int i;
static int s;

public static void main(String[] args) {
Fool f1 = new Fool();
System.out.println("f1.i is " + f1.i + " f1.s is " + f1.s);
Fool f2 = new Fool();
System.out.println("f2.i is " + f2.i + " f2.s is " + f2.s);
Fool f3 = new Fool();
System.out.println("f3.i is " + f3.i + " f3.s is " + f3.s);
}

public Fool() {
i++;
s++;
}
}