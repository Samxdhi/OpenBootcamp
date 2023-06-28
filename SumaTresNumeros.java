public class SumaTresNumeros {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 200;
        int num3 = 28;
        
        int resultado = sumarTresNumeros(num1, num2, num3);
        System.out.println("El resultado de la suma es: " + resultado);
    }
    
    public static int sumarTresNumeros(int a, int b, int c) {
        return a + b + c;
    }
}
