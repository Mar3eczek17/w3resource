interface IProductPart {
}

interface ILineStep {
    IProductPart buildProductPart();
}

interface IProduct {
    void installFirstPart(IProductPart part);
    void installSecondPart(IProductPart part);
    void installThirdPart(IProductPart part);
}

class ProductPart implements IProductPart {
    private String part;

    public void setPart(String partName) {
        this.part = partName;
    }

    public String getPart() {
        return part;
    }
}

class Car implements IProduct {
    private ProductPart body;
    private ProductPart chassis;
    private ProductPart engine;

    public void installFirstPart(IProductPart part) {
        this.body = (ProductPart) part;
    }

    public void installSecondPart(IProductPart part) {
        this.chassis = (ProductPart) part;
    }

    public void installThirdPart(IProductPart part) {
        this.engine = (ProductPart) part;
    }

    public void displayAssembly() {
        System.out.println("Assembled Car: Body - " + body.getPart() + ", Chassis - " + chassis.getPart() + ", Engine - " + engine.getPart());
    }
}

class AssemblyLine {
    private final ILineStep step1;
    private final ILineStep step2;
    private final ILineStep step3;

    public AssemblyLine(ILineStep step1, ILineStep step2, ILineStep step3) {
        this.step1 = step1;
        this.step2 = step2;
        this.step3 = step3;
    }

    public IProduct assembleProduct() {
        IProductPart firstPart = step1.buildProductPart();
        IProductPart secondPart = step2.buildProductPart();
        IProductPart thirdPart = step3.buildProductPart();

        IProduct product = new Car();
        product.installFirstPart(firstPart);
        product.installSecondPart(secondPart);
        product.installThirdPart(thirdPart);

        return product;
    }
}

class CarBodyStep implements ILineStep {
    public IProductPart buildProductPart() {
        ProductPart part = new ProductPart();
        part.setPart("Body");
        return part;
    }
}

class CarChassisStep implements ILineStep {
    public IProductPart buildProductPart() {
        ProductPart part = new ProductPart();
        part.setPart("Chassis");
        return part;
    }
}

class CarEngineStep implements ILineStep {
    public IProductPart buildProductPart() {
        ProductPart part = new ProductPart();
        part.setPart("Engine");
        return part;
    }
}

public class TestAssemblyLine {
    public static void main(String[] args) {
        ILineStep bodyStep = new CarBodyStep();
        ILineStep chassisStep = new CarChassisStep();
        ILineStep engineStep = new CarEngineStep();

        AssemblyLine assemblyLine = new AssemblyLine(bodyStep, chassisStep, engineStep);
        IProduct car = assemblyLine.assembleProduct();

        ((Car) car).displayAssembly();


    }
}
