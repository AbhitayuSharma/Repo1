package practice2;

public interface Add {
	default int add(int a,int b) {
		return a+b;
	}
	void someMethod();
}
