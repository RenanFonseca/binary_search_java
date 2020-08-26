package binary_search;

public class BinarySearch {	
	
	public void searchInt(int[] searchIn, int searchFor) {
		int[] search = orderInt(searchIn);
		int start = 0;
		int end = search.length - 1;
		int middle;
		boolean found = false;
		
		while(start <= end && found == false) {
			middle = (start + end) / 2;			
			
			if (searchFor == search[middle]) {
				System.out.println("Achou na posição: " + middle + ", sendo o "+ (middle + 1) +"º numero: "+ search[middle]);
				found = true;
			} else {
				if (searchFor < search[middle]) {
					end = middle -1;
				} else {
					start = middle +1;
				}				
			}			
		}		
	}
	
	public void searchString(String[] searchIn, String searchFor) {
		String[] search = orderString(searchIn);
		int start = 0;
		int end = search.length - 1;
		int middle;
		boolean found = false;
		int comp;
		
		while(start <= end && found == false) {
			middle = (start + end) / 2;			
			
			if (searchFor.equalsIgnoreCase(search[middle])) {
				System.out.println("Achou na posição: " + middle + ", sendo o "+ (middle + 1) +"º na Lista: "+ search[middle]);
				found = true;
			} else {
				comp = searchFor.compareTo(search[middle]);
				if (comp < 0) {
					end = middle -1;
				} else {
					start = middle +1;
				}				
			}
		}
	}
	
	private int[] orderInt(int[] order) {		
		int temp[] = new int[order.length];
		int vazio = 0;
		
		for (int i = 0; i < order.length; i++) {
			if (order[i] == 0) {
				order[i] = vazio;
			}
		}
		
		for (int i = 0; i < order.length; i++) {
			for (int j = i + 1; j < order.length; j++) {
				if (order[i] > order[j]) {
					temp[i] = order[i];
					order[i] = order[j];
					order[j] = temp[i];
				}
			}
		}
		return order;
	}
	
	private String[] orderString(String[] order) {		
		String temp[] = new String[order.length];
		
		for (int i = 0; i < order.length; i++) {
			for (int j = i + 1; j < order.length; j++) {
				int comp = order[i].compareTo(order[j]);
				if ( comp > 0 ) {
					temp[i] = order[i];
					order[i] = order[j];
					order[j] = temp[i];
				}
			}
		}
		return order;
	}
	
	public void printVetorInt(int[] print) {
		for (int i = 0; i < print.length; i++) {
			System.out.print(print[i] + ", ");
		}
	}
	
	public void printVetorString(String[] print) {
		for (int i = 0; i < print.length; i++) {
			System.out.print(print[i] + ", ");
		}
	}
	
}
	
	