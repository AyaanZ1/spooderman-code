package e;
import java.util.*;
public class PizzaTime {

	public static void main(String[] args) throws InterruptedException {
		String[] spooderman = {"pizza time", "im gonna put some dirt in your eye", "I missed the part where thats my problem","You want forgiveness? get religion","Mr stark, I don't feel so good","Everywhere I go, I see his face.","Your trash brock"};
		Random rand = new Random();
		int selector = rand.nextInt(spooderman.length);
		String story = "You are dancing along the streets of the city. People look at you awkwardly until you approach a sign,'I can't believe spiderman would do this, what am I supposed to tell my kids?'. As you look more closely towards the picture, you see who took it.";
		char[] Story = story.toCharArray();
		for (int i = 0; i < story.length();i++) {
			
			System.out.print(Story[i]);
			
			if (Story[i] == '.') {
				System.out.println("");
			}
			Thread.sleep(5);
		}
		
		System.out.println(spooderman[selector]);
	
	
	}
	
}
