public class TesteCalculadora{
    public static void main (String [] arg){
        Calculadora calc = new Calculadora();
        int x = 2, y = 3;
        float f1 = 2.5f, f2 = 5.6F;

        int r = calc.somar(2,3);
        System.out.println(r);

        float rF = calc.somar(f1, f2);
        System.out.println(rF);

        String s1 = "2", s2 = "5";
        int rS = calc.somar(s1, s2);
        System.out.println(rS);
        System.out.println(calc.somar(1,2,3));
        System.out.println(calc.somar("2", 3));
    }
}