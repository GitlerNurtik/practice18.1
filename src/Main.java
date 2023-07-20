public class Main {
    public static void main(String[] args) {
    Nissan_Skyline_R34 nissan = new Nissan_Skyline_R34(250,"Nissan Skyline R34");
    Toyota_Supra toyota = new Toyota_Supra(250, "Toyota Supra");
    BMW_M5_f90 BMW = new BMW_M5_f90(250, "BMW M5 F90");Car[] cars = new Car[]{nissan,toyota,BMW};

        for (int i = 0; i < cars.length; i++) {

                cars[i].Sport();
                cars[i].drift_mode();


        }
    }
}