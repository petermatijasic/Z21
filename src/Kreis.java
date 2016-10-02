/**
 * Created by petermatijasic on 24.09.16.
 */
public class Kreis {
    private double radius;

    public Kreis(){
        this.radius = 5.0;
    }
    public Kreis(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double newRadius){
        this.radius = newRadius;
    }

    public void printRadius(){
        System.out.println("Der Radius ist: " + radius);
    }

    public double getKreisFlaeche(){
        double flaeche;
        flaeche = 3.1415 * radius * radius;
        return flaeche;
    }

    public void printKreisFlaeche(){
        System.out.println("Die Fläche ist: " + getKreisFlaeche());
    }

    public double getKreisUmfang(){
        double umfang;
        umfang = 2 * 3.1415 * radius;
        return umfang;
    }

    public void printKreisUmfang(){
        System.out.println("Der Umfang ist: " + getKreisUmfang());
    }

    public static void main(String args[]) {
        Kreis ersterKreis = new Kreis();
        ersterKreis.printRadius();
        ersterKreis.printKreisFlaeche();
        ersterKreis.printKreisUmfang();
        System.out.println("Kreisfläche auf 3.0 setzen");
        ersterKreis.setRadius(3.0);
        ersterKreis.printRadius();
        ersterKreis.printKreisFlaeche();
        ersterKreis.printKreisUmfang();

        Kreis zweiterKreis = new Kreis(4.0);
        System.out.println("Der Radius des zweiten Kreises ist: " + zweiterKreis.getRadius());

    }
}
