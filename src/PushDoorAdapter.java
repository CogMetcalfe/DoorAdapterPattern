public class PushDoorAdapter implements IPushable{
	IWaitable waitDoor;
	public PushDoorAdapter(IWaitable waitDoor) {
		this.waitDoor = waitDoor;
	}
	
	public void push() {
		waitDoor.waitByDoor();
	}
}


