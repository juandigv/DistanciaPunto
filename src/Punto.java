public class Punto {
    double x;
    double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void dist(Punto a) {
        double cont1 = Math.sqrt(((a.x - this.x) * (a.x - this.x) + (a.y - this.y) * (a.y - this.y)));
        System.out.print(cont1);
    }


}
