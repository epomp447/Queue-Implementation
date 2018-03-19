public class TestProgram {
	public static void main(String[] Args) {
		LinkedListQueue<String> namelist2 = new LinkedListQueue<String>();
		String temp2 = namelist2.poll();
		System.out.println("The value in temp is " + temp2);
		namelist2.offer("Ryan");
		namelist2.offer("David");
		namelist2.offer("Caroline");
		namelist2.offer("John");
		namelist2.offer("Jack");
		System.out.println("The first item is " + namelist2.peek());
		System.out.println("Remove item " + namelist2.poll());
		while (!namelist2.isEmpty()) {
			System.out.println(namelist2.poll());
		}	
	}
}