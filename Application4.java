

interface Image {
    void display();
}


class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadImage();
    }

    private void loadImage() {
        System.out.println(" Loading image " + fileName + " from network...");
    }

    @Override
    public void display() {
        System.out.println(" Displaying image: " + fileName);
    }
}


class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}


public class Application4  {
    public static void main(String[] args) {
        System.out.println();
        Image image1 = new ProxyImage("Sample1.jpg");
        image1.display();
        image1.display();

        System.out.println();
        Image image2 = new ProxyImage("Sample2.jpg");
        image2.display();
        image2.display();
    }
}
