//muitas vazes a sobrecarga de metodos é batizada de polimorfiso estatico, 
//sendo que estatico significa feito pelo computador, ou em tempo de compilação.

public class Calculadora{

    public int somar(int a, int b, int c){
        return a + b + c;
    }

    public int somar(int a, int b){
     return a + b;
    }

    public float somar (float a, float b){
        return a + b;
    }
   
    public int somar(String s1, String s2){
        return Integer.parseInt(s1) + Integer.parseInt(s2);
    }

    public int somar (String s, int i){
        return Integer.parseInt(s) + i;
    }

    public int soma (int i, String s){
        //return somar(s, i) ;
        //return somar (Integer.toString(i),s);
        //return somar (i, Integer.parseInt(s));
        //return (int) somar((float)i, float.parseFloat(s));
        return somar(i, Integer.parseInt(s),0);
    }
}
