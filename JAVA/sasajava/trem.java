import java.util.Scanner;

public class trem {
    public static void main(String[] args) {
        Scanner duda = new Scanner(System.in);

        double VelocidadeA;
        double VelocidadeB;
        double positiontremA;
        double positiontremB;
        double t;

        while (true) {
            try {


                System.out.println("Digite a velocidade do TREM A: ");
                VelocidadeA = duda.nextDouble();
                if (VelocidadeA < 0 || VelocidadeA > 300) {
                    System.out.println("Valor inválido, a posição do trem A deve ser positiva");
                    continue;
                } else
                    System.out.println("Digite a velocidade do TREM B: ");
                while (true) {
                    VelocidadeB = duda.nextDouble();
                    if (VelocidadeB > 0 || VelocidadeB < -300) {
                        System.out.println("Valor inválido, a posição do trem B deve ser negativa");

                    } else
                        break;
                }

            } catch (Exception e) {
                System.out.println("Valor inválido");
                continue;

            }
            break;
        }
        while (true) {
            System.out.println("Digite a posição do TREM A");
            positiontremA = duda.nextDouble();
            if (positiontremA < 0 || positiontremA > 10000) {
                System.out.println("Valor inválido, a posição do trem A deve estar entre 0 e 10.000km");

            }
            System.out.println("Digite a posição do TREM B");
            positiontremB = duda.nextDouble();
            if (positiontremB < 0 || positiontremB >10000){
                System.out.println("Valor inválido, a posição do trem B deve estar entre 0 e 10.000km");
            }else{

            }

            t = (positiontremA - positiontremB) / (VelocidadeB - VelocidadeA);


            double segundos = t * 3600;

            double time2 = positiontremA + VelocidadeA * t;
            double time3 = positiontremB + VelocidadeB * t;

            if (time2 != time3){
                System.out.println("Os trens não irão se colidir");
            }else {

                double horario = 17 * 3600 + segundos;
                double hora = horario / 3600;
                double minutos = hora % 3600;
                System.out.println(hora);
                System.out.println(minutos);

                System.out.println(horario);
//                System.out.printf("%.0f:%.0f:%.0f\n", hora, m, s);
                System.out.printf("O kilometro que vão se colidir é %.0f e o tempo é %.2f \n", time3, segundos);
                }


            }






        }
    }


