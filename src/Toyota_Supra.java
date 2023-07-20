public class Toyota_Supra extends Car{
    public Toyota_Supra(int speed, String color) {
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
