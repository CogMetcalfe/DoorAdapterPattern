import java.util.ArrayList;

public class DoorAdapterMain {

	public static void main(String[] args) {
		ArrayList<IPushable> pushArr = new ArrayList<IPushable>();
		pushArr.add(new PushDoor());
		pushArr.add(new PushDoorAdapter(new AutomaticDoor()));
		for(IPushable door:pushArr) {
			door.push();
		}
	}

}

