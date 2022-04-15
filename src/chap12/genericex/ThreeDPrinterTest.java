package chap12.genericex;

public class ThreeDPrinterTest {
	public static void main(String[] args) {
		ThreeDPrinter printer = new ThreeDPrinter();
		
		Powder p1 = new Powder();
		
		printer.setMaterial(p1);
		Powder p2 = (Powder)printer.getMaterial();
		System.out.println(p2);

		
		GenericPrinter<Powder> powderPtriter = new GenericPrinter<>();
		powderPtriter.geneticInfo();
		powderPtriter.setMaterial(new Powder());
		System.out.println(powderPtriter.getMaterial());
	}
}
