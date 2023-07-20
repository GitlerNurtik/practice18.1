public class Nissan_Skyline_R34 extends Car{
    public Nissan_Skyline_R34(int speed, String color) {
        super(speed, color);
    }

    public void drift_mode(){
        System.out.println(getColor()+" имеет Дрифт режим");
    }
    @Override
    public void Sport(){
        System.out.println(getColor()+" имеет Спорт режим");

    }
}
