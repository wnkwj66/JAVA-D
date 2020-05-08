package day10;

public class InterfaceEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
interface RemoteController{
	public int chUp(int ch);
	public int chDown(int ch);
	public int volUp(int vol);
	public int volDown(int vol);
//	인터페이스에 새로운 추상 메서드를 추가하면 해당 인터페이스를 구현한 모든 클래스에 에러 발생(오버라이딩 하지 않기 때문)
//	이러한 번거로움을 해결하고자 디폴트 메서드 이용
//	디폴트 메서드는 구현 된 내용이 없는 메서드 <-> 추상 메서드는 구현 클래스에서 꼭 오버라이딩을 해야한다
}
class TvRemoteController implements RemoteController{

	@Override
	public int chUp(int ch) { return ++ch;}
	
	@Override
	public int chDown(int ch) { return --ch;}
	
	@Override
	public int volUp(int vol) { return ++vol;}

	@Override
	public int volDown(int vol) { return --vol;}
	
}
