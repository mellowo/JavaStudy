package chap12.genericex;

public class GenericPrinter<T extends Material> {
	
	private T material;
	
	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	public void geneticInfo() {
		material.doString();
		System.out.println("generic에서 선언한 메서드입니다.");
	}
}
