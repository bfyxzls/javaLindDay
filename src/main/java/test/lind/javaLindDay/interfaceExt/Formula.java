package test.lind.javaLindDay.interfaceExt;

public interface Formula {

  double calculate(int a);

  default double sqrt(int a) {
    return Math.sqrt(a);
  }

}
