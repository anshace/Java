public class Vehicle
{   
    String type;
    String color;
    int topspeed;

    public void print()
    {   
        System.out.println("Vehicle Type: " + type);
        System.out.println(type+" Color: " + color);
        System.out.println(type+" Top Speed: " + topspeed);
    }

}

class VehicleUse
{
    public static void main(String[] args)
    {
        Vehicle v = new Vehicle();
        v.print();
        System.out.println();

        Cars c= new Cars();
        c.gears=10;
        c.color="Black";
        c.print();
        System.out.println();
    }
}

class VehicleName
{
    public static void main(String[] args)
    {
        Vehicle v = new Vehicle();
        v.type="Vehicle";
        v.color="White";
        v.topspeed=100;
        v.print();
        System.out.println();
    }
}