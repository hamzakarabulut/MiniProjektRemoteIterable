import java.util.ArrayList;
import java.util.Iterator;

public class Remote implements Iterable<String>{

	private ArrayList<String> channels = new ArrayList<String>();
	
	public class RemoteIterator implements Iterator<String> {
		
		private int index=0;

		@Override
		public boolean hasNext() {
			if(index>=channels.size()) {
			return false;
			}
			else {
				return true;
			}
		}

		@Override
		public String next() {
			String channel = channels.get(index);
			index++;
			
			return channel;
		}
		
	}
	
	public void addChannel(String channel) {
		channels.add(channel);
	}
	
	public void removeChannel(String channel) {
		if(channels.contains(channel)) {
			channels.remove(channel);
		}
		else {
			System.out.println("there is no such channel ");
		}
		
	}
	
	public int numberOfChannel() {
		return channels.size();
	}

	@Override
	public Iterator<String> iterator() {

		return new RemoteIterator();
	}
	
	
	
}
