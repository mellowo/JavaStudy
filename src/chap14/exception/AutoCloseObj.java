package chap14.exception;

public class AutoCloseObj implements AutoCloseable{

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("리소스가 close() 되었습니다.");
	}

}
