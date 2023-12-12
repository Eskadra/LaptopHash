public class Laptop {
    private String name;
    private int ram;
    private int storageCap;
    private String os;
    private String color;
    private double diagonal;
    
    public Laptop(String name, int ram, int storageCap, String os, String color, double diagonal) {
        this.name = name;
        this.ram = ram;
        this.storageCap = storageCap;
        this.os = os;
        this.color = color;
        this.diagonal = diagonal;
    }
    
    @Override
    public String toString() {
        return String.format(
            "\nНазвание: %s\nОперативная память: %d GB\nОбьем накопителя: %d GB\nОС: %s\nColor: %s\nДиагональ: %.1f дюймов\n",
            this.name, this.ram, this.storageCap, this.os, this.color, this.diagonal);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Laptop) {
            Laptop other = (Laptop) obj;
            return this.name.equals(other.name) &&
                this.ram == other.ram &&
                this.storageCap == other.storageCap &&
                this.os.equals(other.os) &&
                this.color.equals(other.color) &&
                this.diagonal == other.diagonal;
        }
        return false;
    }
    
    public int getRam() {
        return this.ram;
    }
    
    public int getStorageCap() {
        return this.storageCap;
    }
    
    public String getOS() {
        return this.os;
    }
    
    public double getDiagonal() {
        return this.diagonal;
    }
}