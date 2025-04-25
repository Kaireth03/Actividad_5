import java.util.Scanner;

public class Figuras_geometricas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int figura;
        int operacion;
        double resultado = 0;


        System.out.println("\nSeleccione la figura:");
        System.out.println("1. Circulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triangulo");
        System.out.println("4. Rectangulo");
        System.out.println("5. Pentágono");
        figura = entrada.nextInt();

        System.out.println("\nSeleccione la operación:");
        System.out.println("1. Calcular area");
        System.out.println("2. Calcular perímetro");
        operacion = entrada.nextInt();

        switch (figura) {
            case 1: // Círculo
                System.out.print("Ingrese el radio: ");
                double radio = entrada.nextDouble();
                if (operacion == 1) {
                    resultado = Math.PI * radio * radio;
                } else {
                    resultado = 2 * Math.PI * radio;
                }
                break;

            case 2: // Cuadrado
                System.out.print("Ingrese el lado: ");
                double lado = entrada.nextDouble();
                if (operacion == 1) {
                    resultado = lado * lado;
                } else {
                    resultado = 4 * lado;
                }
                break;

            case 3: // Triángulo
                if (operacion == 1) {
                    System.out.print("Ingrese la base: ");
                    double base = entrada.nextDouble();
                    System.out.print("Ingrese la altura: ");
                    double altura = entrada.nextDouble();
                    resultado = (base * altura) / 2;
                } else {
                    System.out.print("Ingrese los tres lados del triangulo:");
                    System.out.print("\nLado 1: ");
                    double l1 = entrada.nextDouble();
                    System.out.print("Lado 2: ");
                    double l2 = entrada.nextDouble();
                    System.out.print("Lado 3: ");
                    double l3 = entrada.nextDouble();
                    resultado = l1 + l2 + l3;
                }
                break;

            case 4: // Rectángulo
                System.out.print("Ingrese la base: ");
                double baseR = entrada.nextDouble();
                System.out.print("Ingrese la altura: ");
                double alturaR = entrada.nextDouble();
                if (operacion == 1) {
                    resultado = baseR * alturaR;
                } else {
                    resultado = 2 * (baseR + alturaR);
                }
                break;

            case 5: // Pentágono (regular)
                System.out.print("Ingrese el lado: ");
                double ladoP = entrada.nextDouble();
                if (operacion == 1) {
                    
                    resultado = (5 * ladoP * ladoP) / (4 * Math.tan(Math.PI / 5));
                } else {
                    resultado = 5 * ladoP;
                }
                break;

            default:
                System.out.println("Opcion de figura no valida.");

                return;
        }

        System.out.println("\nEl resultado es: " + resultado);
        entrada.close();
    }
}
