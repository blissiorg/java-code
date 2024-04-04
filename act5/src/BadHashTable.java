
public class BadHashTable {
	@SuppressWarnings("unchecked")
	private SLL<Integer>[] hashTable = new SLL[10];
	
	public void put(int key) {
		int hashVal = key % 10;
		if (hashTable[hashVal] == null) {
			hashTable[hashVal] = new SLL<>();
		}

		hashTable[hashVal].insertAtTail(key);
	}
	
	public boolean containsKey(int key) {
		int hashVal = key % 10;

		if (hashTable[hashVal] == null) {
			return false;
		}

		return hashTable[hashVal].contains(key);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < hashTable.length; i++) {
			sb.append(i).append(": ");
 
			if (hashTable[i] == null) {
				sb.append("");
			} else {
				sb.append(hashTable[i].toString());
				sb.append(" -->");
			}
			sb.append("\n");
		}

		return sb.toString();
	}
}
