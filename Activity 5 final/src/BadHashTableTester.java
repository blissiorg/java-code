
public class BadHashTableTester {
	public static void main(String[] args) {
		// This builds the hash table using the same values used in the collision resolution slides. 
		BadHashTable badHashTable = new BadHashTable();
		badHashTable.put(33);
		badHashTable.put(16);
		badHashTable.put(27);
		badHashTable.put(23);
		badHashTable.put(26);
		badHashTable.put(79);
		badHashTable.put(88);
		
		System.out.println(badHashTable);
	}
}
