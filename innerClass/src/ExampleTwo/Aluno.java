    package ExampleTwo;

    import java.util.Scanner;

    public class Aluno{
        private double notas;
        private double media;

        public Aluno(double notas, double media) {
            this.notas = notas;
            this.media = media;
        }

        public double getNotas(){
            return this.notas;
        }

        public double getMedia(){
            return this.media;
        }
        public void setNotas(double newNotas){
            this.notas = newNotas;
        }
        public void setMedia(double newMedia){
            this.media = newMedia;
        }
// esta dando erro para chamar esta innerClass no main
        public class Notas{
            Scanner sc = new Scanner(System.in);
            double sumValue = 0.0;

            public int calcularMedia(){
                for(int i = 0; i < 3; i++){
                    System.out.println("Informe a sua nota: ");
                    sumValue = sc.nextDouble();
                    sumValue += getNotas()/3;
                }
                setNotas(sumValue);
                setMedia(sumValue/3);

                if(sumValue >= 7){
                    System.out.println("O aluno foi aprovado");
                } else if (sumValue > 5 && sumValue <= 6) {
                    System.out.println("O aluno precisa fazer exame final");
                }else{
                    System.out.println("Aluno reprovado");
                }

                return (int) sumValue;
            }
        }
    }
