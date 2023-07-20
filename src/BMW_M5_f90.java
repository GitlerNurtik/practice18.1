public class BMW_M5_f90 extends Car{
    public BMW_M5_f90(int speed, String color) {
        super(speed, color);
    }
    @Override
    public void Sport(){
        System.out.println(getColor()+" имеет Спорт режим");
    }
    @Override
    public void drift_mode(){
        System.out.println(getColor()+" имеет Дрифт режим");
    }
}
