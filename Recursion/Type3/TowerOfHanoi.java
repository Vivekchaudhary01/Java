public class TowerOfHanoi
{
	public static void main(String[] args)
	{
		int n=4;
		char from='A', aux='B', to='C';
		towerOfHanoi(n, from, to, aux);
	}
	public static void towerOfHanoi(int n, char from, char to, char aux){
		if(n==1){
			System.out.println("Move Disk From "+from+" To "+to);
			return;
		}
		towerOfHanoi(n-1, from, aux, to);
		System.out.println("Move Disk From "+from+" To "+to);
		towerOfHanoi(n-1, aux, to, from);
	}
}
