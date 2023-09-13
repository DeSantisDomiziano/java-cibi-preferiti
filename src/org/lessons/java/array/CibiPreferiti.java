package org.lessons.java.array;

public class CibiPreferiti {
	public static void main(String[] args) {
		
		String[] arr = {"lasagna", "amatriciana", "carbonara", "risotto crema di scampi", "pizza", "panino alla zozzona", "sushi", "cucina brasiliana", "ciao"};
		
		System.out.println("nella tua lista dei cibi preferiti ci sono " + arr.length + " piatti");
		System.out.println("il tuo preferito è " + arr[0] + "\nmentre il meno preferito è " + arr[arr.length - 1]);
		
		int piattoDiMezzo = arr.length / 2;
		if(arr.length % 2 == 0) {
			piattoDiMezzo = (arr.length / 2) - 1;
		}

		System.out.println("il piatto intermedio è: " + arr[piattoDiMezzo]);
	}
}
