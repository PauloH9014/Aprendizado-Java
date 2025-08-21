    package ExampleTwo;

    import java.util.Scanner;

    public class Aluno{
        private double notas;
        private double media;

        public Aluno(int notas, int media) {
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

                return (int) sumValue;
            }
        }
    }
